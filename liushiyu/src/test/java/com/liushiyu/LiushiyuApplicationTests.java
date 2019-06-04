package com.liushiyu;

import com.liushiyu.dao.UserDaoExample;
import com.liushiyu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LiushiyuApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {

        System.out.println(userService.getAllData());
    }

}
