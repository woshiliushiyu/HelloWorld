package com.liushiyu;

import com.alibaba.fastjson.JSONObject;
import com.liushiyu.config.HttpAPIService;
import com.liushiyu.dao.weatherDao.JsonRootBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LiushiyuApplicationTests {


    private static final Logger logger = LoggerFactory.getLogger(LiushiyuApplicationTests.class);

    @Autowired
    private HttpAPIService httpAPIService;

    @Test
    public void contextLoads() {

        String uri = "http://wthrcdn.etouch.cn/weather_mini?city=" + "北京";
        try {
            String str = httpAPIService.doGet(uri);
            JsonRootBean jsonRootBean = JSONObject.parseObject(str, JsonRootBean.class);
            System.out.println("获取数据" + jsonRootBean.getData().getGanmao());
            logger.info("获取数据" + jsonRootBean.getData().getGanmao());
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }
}
