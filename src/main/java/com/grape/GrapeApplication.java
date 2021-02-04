package com.grape;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.grape.mapper")
public class GrapeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrapeApplication.class, args);
    }

}
