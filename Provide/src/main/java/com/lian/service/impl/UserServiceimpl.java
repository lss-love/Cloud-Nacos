package com.lian.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lian.dao.UserDao;
import com.lian.entity.User;
import com.lian.service.UserService;
import com.lian.vo.ResultJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author :LSS
 * @description:
 * @date :2020/11/2 20:50
 */

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public ResultJson all() {
        return new ResultJson(1,userDao.selectAll());
    }

    @Override
    public ResultJson insert(int c) {
        for (int i = 0;i < c;i++){
            User user = new User("123", "124", 1, 1, "1", 1);
            userDao.insert(user);
        }
        return new ResultJson(1,"OK");
    }
}
