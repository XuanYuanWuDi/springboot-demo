package com.injured.server.provider.mapper;

import com.injured.server.api.entity.CeRegist;
import com.injured.server.api.entity.CeRegistExample;
import java.util.List;

import com.injured.server.provider.db.annotation.DataSource;
import com.injured.server.provider.mode.ClaimCompanyId;
import com.injured.server.provider.mode.RegistInstanceInfo;
import org.apache.ibatis.annotations.Param;

public interface CeRegistMapper {
    @DataSource("slave")
    long countByExample(CeRegistExample example);
    @DataSource("slave")
    int deleteByExample(CeRegistExample example);
    @DataSource("slave")
    int deleteByPrimaryKey(Long id);
    @DataSource("slave")
    int insert(CeRegist record);
    @DataSource("slave")
    int insertSelective(CeRegist record);
    @DataSource("slave")
    List<CeRegist> selectByExample(CeRegistExample example);
    @DataSource("slave")
    CeRegist selectByPrimaryKey(Long id);
    @DataSource("slave")
    int updateByExampleSelective(@Param("record") CeRegist record, @Param("example") CeRegistExample example);
    @DataSource("slave")
    int updateByExample(@Param("record") CeRegist record, @Param("example") CeRegistExample example);
    @DataSource("slave")
    int updateByPrimaryKeySelective(CeRegist record);
    @DataSource("slave")
    int updateByPrimaryKey(CeRegist record);

    /**
     * 根据报案号  保险公司code 查询报案保单信息
     * @param claimCompanyIds
     * @return
     */
    @DataSource("slave")
    List<RegistInstanceInfo> selectClaimInstance(List<ClaimCompanyId> claimCompanyIds);

    @DataSource("slave")
    List<RegistInstanceInfo> selectBatchRegists(List<Long> regists);
}