package com.example.excelutil;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.excelutil.mapper"})
public class ExcelUtilApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExcelUtilApplication.class, args);
    }

}
