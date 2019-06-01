package com.cihon.changan.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@MapperScan("com.cihon.changan.common.dao")
@EnableEurekaClient
@SpringBootApplication
public class ProjectApplication {
    public static void main(String[] args) {

        SpringApplication.run(ProjectApplication.class, args);
    }
}
