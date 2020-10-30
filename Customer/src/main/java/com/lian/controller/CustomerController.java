package com.lian.controller;

import com.lian.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/OpenFeign")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/hello")
    public String hello() {
        return customerService.hello();
    }
}
