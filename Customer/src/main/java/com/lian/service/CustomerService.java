package com.lian.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Prodiver") //和你的提供者服务名联系在一起，括号里是提供者的服务名
public interface CustomerService {

    //对应提供者，请求方式和路径一致，返回值类型一致，函数名可变
    @GetMapping("/hello")
    String hello();

}
