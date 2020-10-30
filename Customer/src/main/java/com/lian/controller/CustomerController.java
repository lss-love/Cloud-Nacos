package com.lian.controller;

import com.lian.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/OpenFeign")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/hello")
    public String hello() {
        return customerService.hello();
    }

    @GetMapping("/hello1")
    public String hello(@RequestParam String b) {
        return customerService.hello1(b);
    }

    @GetMapping("/hello2")
    public List<String> hello(@RequestParam int c) {
        return customerService.hello2(c);
    }
}
