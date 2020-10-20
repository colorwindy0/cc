package com.cxy.sqllearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cxy.sqllearn.dao")
public class SqlLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlLearnApplication.class,args);
    }

}
