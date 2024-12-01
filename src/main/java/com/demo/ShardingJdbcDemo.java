package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.demo.mapper")
@SpringBootApplication
public class ShardingJdbcDemo {
    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcDemo.class, args);
    }
}
