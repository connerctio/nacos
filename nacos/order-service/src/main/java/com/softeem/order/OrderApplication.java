package com.softeem.order;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan("com.softeem.order.mapper")
@SpringBootApplication
public class  OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        System.out.println("创建RestTemplate");
        return new RestTemplate();
    }
/*    @Bean
    public IRule myRule(){
        return new NacosRule();
    }*/

}