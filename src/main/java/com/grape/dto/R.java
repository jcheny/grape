package com.grape.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: chen
 * @Date: 2021/2/4 4:33 PM
 * @Version 1.0
 */
@Data
public class R implements Serializable {

    private int code;

    private String message;

    private Object data;

    public R() {
    }

    public R(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    private R(ResultEnum resultEnum){
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
    }
    private R(ResultEnum resultEnum, Object data){
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
        this.data = data;
    }

    public static R success(){
        return new R(ResultEnum.SUCCESS);
    }

    public static R success(Object data){
        return new R(ResultEnum.SUCCESS,data);
    }

    public static R fail(){
        return new R(ResultEnum.FAIL);
    }

    public static R fail(Object data){
        return new R(ResultEnum.FAIL,data);
    }

    public static R R(ResultEnum resultEnum){
        return new R(resultEnum);
    }
}
