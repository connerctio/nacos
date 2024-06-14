package com.softeem.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@MapperScan("com.softeem.order.mapper")
@SpringBootApplication
public class  OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
/*    @LoadBalanced
    @Bean
    public NacosRule restTemplate(){
        return new NacosRule();
    }*/

}