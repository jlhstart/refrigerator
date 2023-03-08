package com.refrigerator_management.entity;

import lombok.Data;

@Data
public class Result<T> {
    private Integer code;
    private T data;

    public Result(int code){
        this.code=code;
    }

    public Result(int code, T data){
        this.code=code;
        this.data=data;
    }

}
