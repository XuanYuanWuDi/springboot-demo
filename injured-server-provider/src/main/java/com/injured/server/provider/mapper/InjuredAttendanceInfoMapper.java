package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredAttendanceInfo;
import com.injured.server.api.entity.InjuredAttendanceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredAttendanceInfoMapper {
    long countByExample(InjuredAttendanceInfoExample example);

    int deleteByExample(InjuredAttendanceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredAttendanceInfo record);

    int insertSelective(InjuredAttendanceInfo record);

    List<InjuredAttendanceInfo> selectByExample(InjuredAttendanceInfoExample example);

    InjuredAttendanceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredAttendanceInfo record, @Param("example") InjuredAttendanceInfoExample example);

    int updateByExample(@Param("record") InjuredAttendanceInfo record, @Param("example") InjuredAttendanceInfoExample example);

    int updateByPrimaryKeySelective(InjuredAttendanceInfo record);

    int updateByPrimaryKey(InjuredAttendanceInfo record);
}