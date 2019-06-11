package com.liushiyu.service;

import com.liushiyu.dao.UserDao;

import java.util.List;

public interface UserService {

    List<UserDao> getAllData();

    int updataHome(String name,Integer id);
}
