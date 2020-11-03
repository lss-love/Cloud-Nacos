package com.lian.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //无参构造
public class ResultJson {

    private int code;
    private Object data;

    public ResultJson(int code, Object data) {
        this.code = code;
        this.data = data;
    }
}
