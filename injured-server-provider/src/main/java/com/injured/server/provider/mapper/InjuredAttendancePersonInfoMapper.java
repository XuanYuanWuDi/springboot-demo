package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredAttendancePersonInfo;
import com.injured.server.api.entity.InjuredAttendancePersonInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredAttendancePersonInfoMapper {
    long countByExample(InjuredAttendancePersonInfoExample example);

    int deleteByExample(InjuredAttendancePersonInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredAttendancePersonInfo record);

    int insertSelective(InjuredAttendancePersonInfo record);

    List<InjuredAttendancePersonInfo> selectByExample(InjuredAttendancePersonInfoExample example);

    InjuredAttendancePersonInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredAttendancePersonInfo record, @Param("example") InjuredAttendancePersonInfoExample example);

    int updateByExample(@Param("record") InjuredAttendancePersonInfo record, @Param("example") InjuredAttendancePersonInfoExample example);

    int updateByPrimaryKeySelective(InjuredAttendancePersonInfo record);

    int updateByPrimaryKey(InjuredAttendancePersonInfo record);
}