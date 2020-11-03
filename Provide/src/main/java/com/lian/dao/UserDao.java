package com.lian.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lian.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends BaseMapper<User> {

    @Select("select * from t_user")
    List<User> selectAll();
}
