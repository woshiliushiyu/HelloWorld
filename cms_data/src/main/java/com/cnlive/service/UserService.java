package com.cnlive.service;

import com.cnlive.bean.UserBean;

import java.util.List;

public interface UserService {

    List<UserBean> getAllBean();

    void insertUserDao();
}
