package com.lian.service;

import com.lian.vo.ResultJson;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "Prodiver")
public interface UserService {

    //查询
    @GetMapping("/provide/user/all.do") //此处的路径要和提供者的接口路径一致
    ResultJson all();

    //新增
    @GetMapping("/provide/user/insert.do") ////此处的路径要和提供者的接口路径一致
    ResultJson insert(@RequestParam int c);
}
