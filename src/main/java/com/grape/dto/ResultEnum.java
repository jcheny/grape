package com.grape.dto;

import lombok.Getter;

/**
 * @Author: chen
 * @Date: 2021/2/4 4:31 PM
 * @Version 1.0
 */
@Getter
public enum ResultEnum {
    SUCCESS(200,"成功"),
    FAIL(500,"失败")
    ;
    private int code;

    private String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
