package com.lian.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "OK" + System.currentTimeMillis();
    }

    @GetMapping("/hello1")
    public String hello(@RequestParam String n){
        return "OK" + n;
    }

    @GetMapping("/hello2")
    public List<String> hello(@RequestParam int c){
        ArrayList<String> objects = new ArrayList<>();
        for (int i = 0 ; i < c; i++){
            objects.add("力争上游"+i);
        }
        return objects;
    }

}
