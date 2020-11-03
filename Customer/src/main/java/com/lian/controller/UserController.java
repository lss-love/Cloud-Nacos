package com.lian.controller;

import com.lian.service.UserService;
import com.lian.vo.ResultJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author :LSS
 * @description:
 * @date :2020/11/2 21:17
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //查询
    @GetMapping("/all.do")
    public ResultJson all() {
        return userService.all();
    }

    //新增
    @GetMapping("/insert.do")
    public ResultJson insert(@RequestParam int c) {
        return userService.insert(c);
    }
}