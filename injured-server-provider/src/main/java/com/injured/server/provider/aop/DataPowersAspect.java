package com.injured.server.provider.aop;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.injured.commons.string.StringUtils;
import com.injured.server.api.annotations.DataPowers;
import com.injured.server.api.contract.CompanyAgencyContract;
import com.injured.server.api.entity.CompanyAgency;
import com.injured.server.api.entity.base.BaseEntity;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 数据过滤处理
 *
 * @author lzx
 */
@Aspect
@Component
public class DataPowersAspect
{

    @Resource
    private CompanyAgencyContract companyAgencyContract;

    // 配置织入点
    @Pointcut("@annotation(com.injured.server.api.annotations.DataPowers)")
    public void dataScopePointCut()
    {
    }

    @Before("dataScopePointCut()")
    public void doBefore(JoinPoint point) throws Throwable
    {
        handleDataScope(point);
    }

    protected void handleDataScope(final JoinPoint joinPoint)
    {
        // 获得注解
        DataPowers controllerDataScope = getAnnotationLog(joinPoint);
        if (controllerDataScope == null)
        {
            return;
        }

       dataScopeFilter(joinPoint,controllerDataScope.tableAlias(),controllerDataScope.region(),controllerDataScope.quota());

    }

    /**
     * 数据范围过滤
     *
     * @param joinPoint 切点
     */
    public void dataScopeFilter(JoinPoint joinPoint,String tableAlias,String tableRegion,String tableQuota)
    {
        Object params = joinPoint.getArgs()[0];
        if(params != null && params instanceof BaseEntity){
            BaseEntity entity  = (BaseEntity) params;
            JSONObject powers = entity.getBasePowers();
            String company = entity.getBaseCompany();

            if(powers == null || StringUtils.isBlank(company)){
                throw new RuntimeException("需要数据权限过滤,需要查询的方法的父类BaseEntity的powers和company不能为空");
            }
            if(StringUtils.isEmpty(tableRegion) ||StringUtils.isEmpty(tableQuota)){
                throw new RuntimeException("需要数据权限过滤,需要查询的方法的的region和quota注解值必须填写");
            }
            String region = powers.getString("region");
            String [] regions = region.split(",");
            String quota = powers.getString("quota");
            String [] quotas = quota.split(",");

            if(regions.length != quotas.length){
                throw new RuntimeException("需要数据权限过滤,需要查询的方法的POWERS中region和quota的数量不一致");
            }
            StringBuilder dataAuthSql = new StringBuilder();
            //获取该人机构ID下的所有子机构ID
            List<String> agencyIds = new ArrayList<>();
            for(String regionStr:regions) {
                CompanyAgency companyAgency = new CompanyAgency();
                        companyAgency.setId(Long.valueOf(regionStr));
                        companyAgency.setCompanyId(Long.valueOf(company));
                        List<CompanyAgency> reuslt= companyAgencyContract.findChildNode(companyAgency);
                        StringBuilder builder = new StringBuilder();
                        if(reuslt != null && reuslt.size() > 0){
                            builder.append(regionStr).append(",");
                            for (CompanyAgency gency:reuslt) {
                                if(!Long.valueOf(regionStr).equals(gency.getId())) {
                                    builder.append(gency.getId()).append(",");
                                }
                            }
                            String ids = builder.toString();
                            if (ids.lastIndexOf(",") == ids.length() - 1) {
                                ids = builder.toString().substring(0, builder.length() - 1);
                            }
                            agencyIds.add(ids);
                        }else{
                            agencyIds.add(regionStr);
                        }
            }
            //生成最终SQL语句

            generateSql(dataAuthSql,agencyIds,quotas,tableAlias,tableRegion,tableQuota,company);

            entity.setPowersScope(dataAuthSql.toString());

        }else {
            throw new RuntimeException("需要数据权限过滤，需要查询方法的第一个参数必须集成BaseEntity，且不能为NULL");
        }

    }

    /**
     * 是否存在注解，如果存在就获取
     */
    private DataPowers getAnnotationLog(JoinPoint joinPoint)
    {
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();

        if (method != null)
        {
            return method.getAnnotation(DataPowers.class);
        }
        return null;
    }


    private static void generateSql(StringBuilder dataAuthSql,List<String> agencyIds,String []quotas,String tableAlias,String tableRegion,String tableQuota,String company){
        dataAuthSql.append(" AND (");
        for(int x = 0; x < agencyIds.size(); x++){
            //判断是否用了表的别名
            if(StringUtils.isNotEmpty(tableAlias)) {
                //如果是第一次,不用加or
                if (x == 0) {
                    dataAuthSql.append(StringUtils.format(" {}.{} in ({}) and {}.{} ", tableAlias,tableRegion,agencyIds.get(x),tableAlias,tableQuota));
                } else {
                    dataAuthSql.append(StringUtils.format(" or {}.{} in ({}) and {}.{} ", tableAlias,tableRegion,agencyIds.get(x),tableAlias,tableQuota));
                }
                if(quotas[x].contains("&")){
                    String [] quotas_t = quotas[x].split("&");
                    for(int y = 0; y < quotas_t.length; y++) {
                        if(y == 0) {
                            dataAuthSql.append(StringUtils.format(" {}", quotas_t[y]));
                        }else{
                            dataAuthSql.append(StringUtils.format(" and {}.{} {}",tableAlias, tableQuota, quotas_t[y]));
                        }
                    }
                }else{
                    dataAuthSql.append(StringUtils.format(" {}",quotas[x]));
                }
            }else{
                if (x == 0) {
                    dataAuthSql.append(StringUtils.format(" {} in ({}) and {} ", tableRegion,agencyIds.get(x),tableQuota));

                } else {
                    dataAuthSql.append(StringUtils.format(" or {} in ({}) and {} ",tableRegion,agencyIds.get(x),tableQuota));
                }
                if(quotas[x].contains("&")){
                    String [] quotas_t = quotas[x].split("&");
                    for(int y = 0; y < quotas_t.length; y++) {
                        if(y == 0) {
                            dataAuthSql.append(StringUtils.format(" {}", quotas_t[y]));
                        }else{
                            dataAuthSql.append(StringUtils.format(" and {} {}", tableQuota, quotas_t[y]));
                        }
                    }
                }else{
                    dataAuthSql.append(StringUtils.format(" {}",quotas[x]));
                }
            }
        }
        dataAuthSql.append(" ) ");
        dataAuthSql.append(" AND ").append(tableRegion).append(" is not null ");
        if(StringUtils.isNotEmpty(tableAlias)) {
            dataAuthSql.append(StringUtils.format(" AND {}.company_id = {}", tableAlias, company));
        }else{
            dataAuthSql.append(StringUtils.format(" AND company_id = {}",  company));
        }
    }
}
