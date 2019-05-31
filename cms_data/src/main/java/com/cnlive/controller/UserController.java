package com.cnlive.controller;


import com.cnlive.bean.UserBean;
import com.cnlive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public List<UserBean> index() {
        return userService.getAllBean();
    }

    @RequestMapping("/insert")
    public void insert(){
        userService.insertUserDao();
    }
}
