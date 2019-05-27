package com.liushiyu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LSYMainController {

    @RequestMapping(value = "/index")
    @ResponseBody
    public String index() {
        return "请求成功";
    }
}
