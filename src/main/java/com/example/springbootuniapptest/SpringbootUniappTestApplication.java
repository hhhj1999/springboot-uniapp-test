package com.example.springbootuniapptest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value="com.example.springbootuniapptest.mapper")
@SpringBootApplication
public class SpringbootUniappTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootUniappTestApplication.class, args);
    }

}
