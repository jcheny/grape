package com.grape.exception;

import com.grape.dto.R;
import com.grape.dto.ResultEnum;
import lombok.Data;

@Data
public class GlobalException extends RuntimeException {

    private ResultEnum resultEnum;

    public GlobalException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.resultEnum = resultEnum;
    }
}
