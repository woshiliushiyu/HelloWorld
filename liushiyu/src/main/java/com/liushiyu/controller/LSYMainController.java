package com.liushiyu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class LSYMainController {

    static Logger logger;

    @RequestMapping(value = "/index")
    @ResponseBody
    public String index() {
        System.out.println("请求成功");
        logger.info("开始请求成功"+"index");
        return "请求成功01";
    }
}
