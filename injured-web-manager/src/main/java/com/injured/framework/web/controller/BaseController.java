package com.injured.framework.web.controller;

import java.beans.PropertyEditorSupport;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.injured.project.system.menu.domain.Menu;
import com.injured.project.system.menu.mapper.MenuMapper;
import com.injured.project.system.role.domain.RoleMenu;
import com.injured.project.system.role.domain.SysUserAgnecyPrice;
import com.injured.project.system.role.mapper.RoleMenuMapper;
import com.injured.project.system.role.mapper.SysUserAgnecyPriceMapper;
import com.injured.server.api.contract.CompanyAgencyContract;
import com.injured.server.api.entity.CompanyAgency;
import com.injured.server.api.model.compensat.FastCompensationReviewQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.injured.common.utils.DateUtils;
import com.injured.common.utils.StringUtils;
import com.injured.common.utils.security.ShiroUtils;
import com.injured.common.utils.sql.SqlUtil;
import com.injured.framework.web.domain.AjaxResult;
import com.injured.framework.web.domain.AjaxResult.Type;
import com.injured.framework.web.page.PageDomain;
import com.injured.framework.web.page.TableDataInfo;
import com.injured.framework.web.page.TableSupport;
import com.injured.project.system.user.domain.User;

import javax.servlet.http.HttpServletRequest;

/**
 * web层通用数据处理
 * 
 * @author lzx
 */
public class BaseController
{

    @Autowired
    private SysUserAgnecyPriceMapper sysUserAgnecyPriceMapper;
    @Autowired
    private MenuMapper menuMapper;
    @Reference(timeout = 60000)
    private CompanyAgencyContract companyAgencyContract;

    public FastCompensationReviewQuery initQuery(FastCompensationReviewQuery query, HttpServletRequest request){
        User user = getSysUser();
        Long userId = user.getUserId();
        query.setReviewerId(userId);

        //查找请求菜单的菜单ID
        String URI = request.getRequestURI();

        List<Menu> menus = menuMapper.selectMenuByUrl(URI);

        if(menus == null || menus.size() != 1){
            return null;
        }
        Long menuId = menus.get(0).getMenuId();

        List<SysUserAgnecyPrice> roleMenus = sysUserAgnecyPriceMapper.selectByUserIdAndMenuId(userId,menuId);

        if(roleMenus == null || roleMenus.size() == 0){
            return null;
        }

        StringBuilder region = new StringBuilder();
        StringBuilder quota = new StringBuilder();

        Set<Long> agencySet = new HashSet<>();

        for(SysUserAgnecyPrice sysUserAgnecyPrice:roleMenus){
            if(!agencySet.contains(sysUserAgnecyPrice.getAgencyId())) {
                agencySet.add(sysUserAgnecyPrice.getAgencyId());
                region.append(sysUserAgnecyPrice.getAgencyId()).append(",");
                quota.append(sysUserAgnecyPrice.getPriceScope()).append(",");
            }
        }
        JSONObject powers = new JSONObject();
        powers.put("region",region.toString().substring(0,region.length()-1));
        powers.put("quota",quota.toString().substring(0,quota.length()-1));

        //找出所有选择的一级机构下的权限列表内的二级机构
        if(query.getCompanyAgencyIdFirst() != -1) {
            CompanyAgency agencyQuery = new CompanyAgency();
            agencyQuery.setCompanyId(user.getCompanyId());
            agencyQuery.setId(query.getCompanyAgencyIdFirst());
            List<CompanyAgency> agencys = companyAgencyContract.findChildNode(agencyQuery);
            String ids = powers.getString("region");
            String quotas = powers.getString("quota");
            String [] quotaArray = quotas.split(",");
            String [] idsArray = ids.split(",");
            StringBuilder idBuilder = new StringBuilder();
            StringBuilder quotaBuilder = new StringBuilder();
            for (int x = 0; x < idsArray.length;x ++) {
                for (CompanyAgency companyAgency:agencys) {
                    if(companyAgency.getId().toString().equals(idsArray[x])){
                        idBuilder.append(idsArray[x]).append(",");
                        quotaBuilder.append(quotaArray[x]).append(",");
                        break;
                    }
                }
            }
            if(StringUtils.isNotBlank(idBuilder.toString())) {
                ids = idBuilder.toString().substring(0, idBuilder.length() - 1);
                quotas = quotaBuilder.toString().substring(0, quotaBuilder.length() - 1);
            }

            powers = new JSONObject();
            powers.put("quota",quotas);
            powers.put("region",ids);
            query.setBasePowers(powers);
        }else{
            query.setBasePowers(powers);
        }
        query.setBaseCompany(user.getCompanyId().toString());
        return query;
    }


    /**
     * 将前台传递过来的日期格式的字符串，自动转化为Date类型
     */
    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        // Date 类型转换
        binder.registerCustomEditor(Date.class, new PropertyEditorSupport()
        {
            @Override
            public void setAsText(String text)
            {
                setValue(DateUtils.parseDate(text));
            }
        });
    }

    /**
     * 设置请求分页数据
     */
    protected void startPage()
    {
        PageDomain pageDomain = TableSupport.buildPageRequest();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();
        if (StringUtils.isNotNull(pageNum) && StringUtils.isNotNull(pageSize))
        {
            String orderBy = SqlUtil.escapeOrderBySql(pageDomain.getOrderBy());
            PageHelper.startPage(pageNum, pageSize, orderBy);
        }
    }

    /**
     * 响应请求分页数据
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    protected TableDataInfo getDataTable(List<?> list)
    {
        TableDataInfo rspData = new TableDataInfo();
        
        PageDomain pageDomain = TableSupport.buildPageRequest();
        if (null == pageDomain.getPageNum() || null == pageDomain.getPageSize())
        {
            rspData.setRows(list);
            rspData.setTotal(list.size());
            return rspData;
        }
        Integer pageNum = (pageDomain.getPageNum() - 1) * pageDomain.getPageSize();
        Integer pageSize = pageDomain.getPageNum() * pageDomain.getPageSize();
        if (pageSize > list.size())
        {
            pageSize = list.size();
        }
        
        rspData.setCode(0);
        rspData.setRows(list.subList(pageNum, pageSize));
        rspData.setTotal(new PageInfo(list).getTotal());
        return rspData;
    }
    
    /**
     * 响应请求分页数据
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    protected TableDataInfo getDataTableLog(List<?> list)
    {
        TableDataInfo rspData = new TableDataInfo();
        rspData.setRows(list);
        rspData.setTotal(list.size());
        return rspData;
    }

    /**
     * 响应返回结果
     * 
     * @param rows 影响行数
     * @return 操作结果
     */
    protected AjaxResult toAjax(int rows)
    {
        return rows > 0 ? success() : error();
    }

    /**
     * 响应返回结果
     * 
     * @param result 结果
     * @return 操作结果
     */
    protected AjaxResult toAjax(boolean result)
    {
        return result ? success() : error();
    }

    /**
     * 返回成功
     */
    public AjaxResult success()
    {
        return AjaxResult.success();
    }

    /**
     * 返回成功
     */
    public AjaxResult success(Object data)
    {
        return AjaxResult.success(data);
    }

    /**
     * 返回失败消息
     */
    public AjaxResult error()
    {
        return AjaxResult.error();
    }

    /**
     * 返回成功消息
     */
    public AjaxResult success(String message)
    {
        return AjaxResult.success(message);
    }

    /**
     * 返回失败消息
     */
    public AjaxResult error(String message)
    {
        return AjaxResult.error(message);
    }

    /**
     * 返回错误码消息
     */
    public AjaxResult error(Type type, String message)
    {
        return new AjaxResult(type, message);
    }

    /**
     * 页面跳转
     */
    public String redirect(String url)
    {
        return StringUtils.format("redirect:{}", url);
    }

    public User getSysUser()
    {
        return ShiroUtils.getSysUser();
    }

    public void setSysUser(User user)
    {
        ShiroUtils.setSysUser(user);
    }

    public Long getUserId()
    {
        return getSysUser().getUserId();
    }

    public String getLoginName()
    {
        return getSysUser().getLoginName();
    }
}
