package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredImg;
import com.injured.server.api.entity.InjuredImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredImgMapper {
    long countByExample(InjuredImgExample example);

    int deleteByExample(InjuredImgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredImg record);

    int insertSelective(InjuredImg record);

    List<InjuredImg> selectByExample(InjuredImgExample example);

    InjuredImg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredImg record, @Param("example") InjuredImgExample example);

    int updateByExample(@Param("record") InjuredImg record, @Param("example") InjuredImgExample example);

    int updateByPrimaryKeySelective(InjuredImg record);

    int updateByPrimaryKey(InjuredImg record);
}