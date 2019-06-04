package com.liushiyu.controller;

import com.liushiyu.dao.UserDao;
import com.liushiyu.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class LSYMainController {

    private static final Logger logger = LoggerFactory.getLogger(LSYMainController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    @ResponseBody
    public List<UserDao> index() {
        System.out.println("请求成功");
        logger.info("开始请求成功"+"index");
        return userService.getAllData();
    }



}
