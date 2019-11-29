package com.injured.server.provider.mapper;

import com.injured.server.api.entity.CompanyAgency;
import com.injured.server.api.model.request.fast.CompanyAgencyReq;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Repository
public interface CompanyAgencyMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CompanyAgency record);

    int insertSelective(CompanyAgency record);

    CompanyAgency selectByPrimaryKey(Long id);

    /**
     * @Description 修改机构信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(CompanyAgency record);

    int updateByPrimaryKey(CompanyAgency record);

    List<CompanyAgency> findChildNodeByPidAndCompanyId(@Param("pid")Long pid,@Param("companyId")Long companyId);

    /**
     * @Description 根据保险公司id 查询所有机构信息
     * @param companyId
     * @return
     */
    public List<CompanyAgencyReq> findAllNode(@Param("companyId")Long companyId);
    
    /**
     * @Description 根据条件查询机构列表
     * @param fuzzy 是否模糊查询
     * @param agencyName 机构名称
     * @param isClaim 是否是理赔机构
     * @param companyId 保险公司id
     * @return
     */
    public List<CompanyAgencyReq> findNodeByQuery(
    		@Param("fuzzy")String fuzzy,
    		@Param("agencyName")String agencyName,
    		@Param("isClaim")Integer isClaim,
    		@Param("companyId")Long companyId
    		);
    
    /**
     * @Description 根据机构id和保险公司id 查询机构详细信息
     * @param id
     * @param companyId
     * @return
     */
    public CompanyAgencyReq findAgencyById(
    		@Param("id")Long id,
    		@Param("companyId")Long companyId);

    
    /**
     * @Description 根据机构代码或者机构名称 查询机构信息
     * @param agencyCode 机构代码
     * @param agencyName 机构名称
     * @param companyId 保险公司id
     * @return
     */
    public CompanyAgencyReq findAgencyByCodeOrName(
    		@Param("agencyCode")String agencyCode,
    		@Param("agencyName")String agencyName,
    		@Param("companyId")Long companyId
    		);

    /**
     * @Description 查询一级和二级的所有机构
     * @return
     */
     List<CompanyAgency> selectleve1or2();
     
     /**
     * @Description  根据等级查询
     * @param companyId
     * @param agencyLevel
     * @return
     */
    public List<CompanyAgencyReq> findNodeByAgencyLevel(
    		 @Param("companyId")Long companyId,
    		 @Param("agencyLevel")Integer agencyLevel
    		 );
    
    /**
     * 所有机构
     * @return
     */
    List<CompanyAgency> selectAllByCompany(Long companyId);
    
    /**
     * 根据id 查询机构信息 
     * @param id
     * @param companyId
     */
    public CompanyAgencyReq findAgencyOfLevel(@Param("id")Long id, @Param("companyId")Long companyId);
    
    /**
     * 根据id 查询机构信息 
     * @param companyId
     * @param level
     */
    public List<CompanyAgencyReq> findAgencyByLevel(@Param("companyId")Long companyId, @Param("agencyLevel")int agencyLevel);
    
    /**
     *  根据二级机构id查询其父级机构和子级机构
     * @param id
     */
    public List<CompanyAgencyReq> findAllAgencyByTwoId(@Param("id")Long id);
    
    /**
     *  根据三级机构id查询其父级机构和子级机构
     * @param id
     */
    public List<CompanyAgencyReq> findAllAgencyByThreeId(@Param("id")Long id);
    
    /**
     *  根据四级机构id查询其父级机构和子级机构
     * @param id
     */
    public List<CompanyAgencyReq> findAllAgencyByFourId(@Param("id")Long id);
    
    /**
     * 查询所有机构
     * @param companyId
     * @param isClaim 是否为理赔机构
     * @return
     */
    public List<CompanyAgencyReq> findAllisClaimNode(@Param("companyId")Long companyId, @Param("isClaim")Integer isClaim);
}