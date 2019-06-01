package com.liushiyu.dao;

import com.liushiyu.bean.UserDao;
import com.liushiyu.bean.UserDaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDaoMapper {
    int deleteByExample(UserDaoExample example);

    int insert(UserDao record);

    int insertSelective(UserDao record);

    List<UserDao> selectByExample(UserDaoExample example);

    int updateByExampleSelective(@Param("record") UserDao record, @Param("example") UserDaoExample example);

    int updateByExample(@Param("record") UserDao record, @Param("example") UserDaoExample example);
}