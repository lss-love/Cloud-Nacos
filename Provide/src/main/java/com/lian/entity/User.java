package com.lian.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :LSS
 * @description:
 * @date :2020/11/2 20:23
 */
@Data
@TableName("t_user")
@NoArgsConstructor
public class User {
    @TableId("id")
    private int id;
    private String no;
    private String password;
    private int role;
    private int flag;
    private String status;
    private int identity;

    public User(String no, String password, int role, int flag, String status, int identity) {
        this.no = no;
        this.password = password;
        this.role = role;
        this.flag = flag;
        this.status = status;
        this.identity = identity;
    }

}
