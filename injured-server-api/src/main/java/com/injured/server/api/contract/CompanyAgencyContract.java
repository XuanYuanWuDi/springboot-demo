package com.injured.server.api.contract;

import com.injured.server.api.entity.CompanyAgency;
import com.injured.server.api.model.request.fast.CompanyAgencyReq;
import com.injured.server.api.model.response.BaseResponse;

import java.util.List;

/**
 * @author zlu
 * @title: CompanyAgencyContract
 * @projectName injured
 * @description: TODO
 * @date 2019/7/318:02
 */
public interface CompanyAgencyContract {

    public List<CompanyAgency> findChildNode(CompanyAgency agency);
    
    /**
     *  查询所有机构列表
     * @return
     */
    public BaseResponse findAllList(CompanyAgencyReq agency);
    
    /**
     *  根据机构id和保险公司id 查询机构详细信息
     * @param id
     * @param companyId
     * @return
     */
    public BaseResponse findAgencyById(Long id, Long companyId);
    
    /**
     *  修改保存机构信息，并且保存操作日志
     * @param agency
     * @param userName 操作员工名字
     * @param userNo 操作员工工号
     * @return
     */
    public BaseResponse updateCompanyAgency(CompanyAgency agency,String userName,String userNo);
    
    /**
     *  根据机构code或机构name 查询机构信息
     * @param agencyCode 机构编码
     * @param agencyName 机构名称
     * @param companyId 保险公司id
     * @return
     */
    public BaseResponse findAgencyByCodeOrName(String agencyCode,String agencyName, Long companyId);
    
    /**
     *  新增机构信息，并保存操作日志
     * @param agency 机构信息
     * @param userName 操作员工名字
     * @param userNo 操作员工工号
     * @return
     */
    public BaseResponse insertCompanyAgency(CompanyAgency agency,String userName,String userNo);

    
    /**
     *  根据机构等级查询机构信息
     * @param level 机构等级
     * @param companyId
     * @return
     */
    public BaseResponse findAgencyByLevel(Integer level, Long companyId);
    
    /**
              * 根据父id查询机构列表 
     * @param pid
     * @param companyId
     * @return
     */
    public BaseResponse findAgencyByPid(Long pid, Long companyId); 
    
    /**
     * 根据父id获取子集机构id 
     * @param pid
     * @param companyId
     * @return
     */
    public List<Long> findIdByPid(Long pid, Long companyId);
    
    /**
     * 获取所有机构列表
     * @param companyId
     * @return
     */
    public BaseResponse findAllAgency(Long companyId);

    /**
     * 根据机构id 查询 父级2级机构id
     * @param id
     * @param companyId
     * @return
     */
    public BaseResponse findAgencyOfLevel(Long id,Long companyId);
    
    /**
     * 根据机构等级查询机构信息
     * @param companyId
     * @param level 机构等级
     * @return
     */
    public BaseResponse findAgencyByLevel(Long companyId, int agencyLevel);


    /**
     * 根据子ID查找所有父节点
     * @param companyId
     * @return
     */
    public List<Long> findByChildId(Long id,Long companyId,List<Long> result);
    
    /**
     * 根据机构id查询其父级机构和子级机构树
     * @param id
     * @param
     * @return
     */
    public BaseResponse findAgencyByIdLevel(Long id, Integer agencyLevel, Long comapnyId);
    
    /**
     * 查询是理赔机构的机构树
     * @param companyId
     * @return
     */
    public BaseResponse findAllManagerAgency(Long companyId);
    
    /**
     *跟新redis中机构信息
     * @param companyId
     */
    public void updateRedis(Long companyId);
}
