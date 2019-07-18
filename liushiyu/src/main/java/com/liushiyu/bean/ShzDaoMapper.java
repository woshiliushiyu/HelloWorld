package com.liushiyu.bean;

import com.liushiyu.dao.ShzDao;
import com.liushiyu.dao.ShzDaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShzDaoMapper {
    int deleteByExample(ShzDaoExample example);

    int insert(ShzDao record);

    int insertSelective(ShzDao record);

    List<ShzDao> selectByExample(ShzDaoExample example);

    int updateByExampleSelective(@Param("record") ShzDao record, @Param("example") ShzDaoExample example);

    int updateByExample(@Param("record") ShzDao record, @Param("example") ShzDaoExample example);
}