package com.cihon.changan.gateway;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Cihontask
 *
 * @author zouyutang
 * @date 2018/8/9 
 * @package com.cihon.gateway
 */
@MapperScan("com.cihon.changan.common.dao")
@EnableEurekaClient
@SpringBootApplication
@EnableZuulProxy
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
