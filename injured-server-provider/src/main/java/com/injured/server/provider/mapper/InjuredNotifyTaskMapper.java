package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredNotifyTask;
import com.injured.server.api.entity.InjuredNotifyTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredNotifyTaskMapper {
    long countByExample(InjuredNotifyTaskExample example);

    int deleteByExample(InjuredNotifyTaskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredNotifyTask record);

    int insertSelective(InjuredNotifyTask record);

    List<InjuredNotifyTask> selectByExampleWithBLOBs(InjuredNotifyTaskExample example);

    List<InjuredNotifyTask> selectByExample(InjuredNotifyTaskExample example);

    InjuredNotifyTask selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredNotifyTask record, @Param("example") InjuredNotifyTaskExample example);

    int updateByExampleWithBLOBs(@Param("record") InjuredNotifyTask record, @Param("example") InjuredNotifyTaskExample example);

    int updateByExample(@Param("record") InjuredNotifyTask record, @Param("example") InjuredNotifyTaskExample example);

    int updateByPrimaryKeySelective(InjuredNotifyTask record);

    int updateByPrimaryKeyWithBLOBs(InjuredNotifyTask record);

    int updateByPrimaryKey(InjuredNotifyTask record);

    List<InjuredNotifyTask> selectNotifyTaskUnsent(InjuredNotifyTask record);

    List<InjuredNotifyTask> selectNotifyTaskList(InjuredNotifyTask record);
}