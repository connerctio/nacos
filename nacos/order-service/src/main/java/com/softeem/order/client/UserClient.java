package com.softeem.order.client;

import com.softeem.order.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("userservice")// 指定微服务名称
public interface UserClient {
    @GetMapping("/user/{id}")//在调用userController的queryById方法时，会自动将请求转发到userController的queryById方法
    User findById(@PathVariable("id") Long id);
}