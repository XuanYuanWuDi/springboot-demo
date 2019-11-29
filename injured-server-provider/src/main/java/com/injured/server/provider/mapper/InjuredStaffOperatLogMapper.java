package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredStaffOperatLog;
import com.injured.server.api.entity.InjuredStaffOperatLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredStaffOperatLogMapper {
    long countByExample(InjuredStaffOperatLogExample example);

    int deleteByExample(InjuredStaffOperatLogExample example);

    int insert(InjuredStaffOperatLog record);

    int insertSelective(InjuredStaffOperatLog record);

    List<InjuredStaffOperatLog> selectByExample(InjuredStaffOperatLogExample example);

    int updateByExampleSelective(@Param("record") InjuredStaffOperatLog record, @Param("example") InjuredStaffOperatLogExample example);

    int updateByExample(@Param("record") InjuredStaffOperatLog record, @Param("example") InjuredStaffOperatLogExample example);
    
    /**
     * @Description 根据任务类型等查询操作日志
     * @param submitTask 任务类型名称
     * @param id 查勘任务id/机构id/用户id/菜单id/任务id/权限等id
     * @param companyId 保险公司id
     * @return
     */
    public List<InjuredStaffOperatLog> logListByTaskId(
    		@Param("submitTask") int submitTask,
    		@Param("id") Long id,
    		@Param("companyId") Long companyId
    		);
}