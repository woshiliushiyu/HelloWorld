package com.liushiyu.bean;

import com.liushiyu.dao.UserDao;
import com.liushiyu.dao.UserDaoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface UserDaoMapper {
    int deleteByExample(UserDaoExample example);

    int insert(UserDao record);

    int insertSelective(UserDao record);

    List<UserDao> selectByExample(UserDaoExample example);

    int updateByExampleSelective(@Param("record") UserDao record, @Param("example") UserDaoExample example);

    int updateByExample(@Param("record") UserDao record, @Param("example") UserDaoExample example);
}