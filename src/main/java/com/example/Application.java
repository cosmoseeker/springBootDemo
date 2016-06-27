package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1，第一种启动方式：@SpringBootApplication（官方demo）
 * 2，第二种启动方式：http://jinnianshilongnian.iteye.com/blog/1997192
 * Created by qyx on 2016/5/15.
 */
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
