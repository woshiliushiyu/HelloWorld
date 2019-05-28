package com.liushiyu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LSYMainController {

    private static final Logger logger = LoggerFactory.getLogger(LSYMainController.class);

    @RequestMapping(value = "/index")
    @ResponseBody
    public String index() {
        System.out.println("请求成功");
        logger.info("开始请求成功"+"index");
        return "请求成功01";
    }
}
