package com.cnlive;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cnlive.dao")
@SpringBootApplication
public class CnliveApplication {

    public static void main(String[] args) {
        SpringApplication.run(CnliveApplication.class, args);
    }

}
