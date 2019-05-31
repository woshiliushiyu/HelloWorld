package com.cnlive.dao;

import com.cnlive.bean.UserDao;
import com.cnlive.bean.UserDaoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDaoMapper {
    int deleteByExample(UserDaoExample example);

    int insert(UserDao record);

    int insertSelective(UserDao record);

    List<UserDao> selectByExample(UserDaoExample example);

    int updateByExampleSelective(@Param("record") UserDao record, @Param("example") UserDaoExample example);

    int updateByExample(@Param("record") UserDao record, @Param("example") UserDaoExample example);
}