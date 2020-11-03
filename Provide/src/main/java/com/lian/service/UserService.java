package com.lian.service;

import com.lian.vo.ResultJson;

public interface UserService {
    //查询
    ResultJson all();
    //新增
    ResultJson insert(int c);

}
