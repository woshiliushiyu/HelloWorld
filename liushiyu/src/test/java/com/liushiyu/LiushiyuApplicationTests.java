package com.liushiyu;

import com.alibaba.fastjson.JSONObject;
import com.liushiyu.bean.ShzDaoMapper;
import com.liushiyu.config.HttpAPIService;
import com.liushiyu.dao.ShzDao;
import com.liushiyu.dao.weatherDao.JsonRootBean;
import com.liushiyu.service.ShzService;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LiushiyuApplicationTests {


    private static final Logger logger = LoggerFactory.getLogger(LiushiyuApplicationTests.class);

    @Autowired
    private HttpAPIService httpAPIService;

    @Autowired
    private ShzService shzService;

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

    @Test
    public void shz() {

        try {
            Document document = Jsoup.parse(new URL("http://www.guoxue.com/minqingstory/SHZ/shz.htm").openStream(),"GBK","http://www.guoxue.com/minqingstory/SHZ/shz.htm");

            Elements links = document.select("a[href]");
            for (int j = 0;j<links.size();j++)
            {

                if (j == 0) continue;
                if (j == links.size()-1) continue;
                if (j == links.size()-2) continue;
                Element link = links.get(j);

                String[] volume = link.text().split(" ");

                System.out.println("link : " + link.attr("href"));
                System.out.println("text : " + link.text());
                System.out.println("volume : " + volume[0]);

                ShzDao shzDao = new ShzDao();
                shzDao.setName(link.text());
                shzDao.setSrc("http://www.guoxue.com/minqingstory/SHZ/"+link.attr("href"));
                shzDao.setVolume(volume[0]);
                int i = shzService.insert(shzDao);
                System.out.println(i==1?"成功":"失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void qsbk() {

        try {
            Document document = Jsoup.parse(new URL("https://www.qiushibaike.com/text/").openStream(),"UTF-8","https://www.qiushibaike.com/text/");

            Elements links = document.select("span");
            for (int j = 0;j<links.size();j++) {
                Element link = links.get(j);
                System.out.println("link : " + link.text());//.attr("value"));

            }
        } catch (MalformedURLException e) {

        } catch (IOException io) {

        }
    }
}
