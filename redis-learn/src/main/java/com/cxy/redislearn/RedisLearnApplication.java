package com.cxy.redislearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cxy.redislearn.dao")
public class RedisLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisLearnApplication.class,args);
    }

}
