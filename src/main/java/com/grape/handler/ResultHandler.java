package com.grape.handler;

import com.grape.dto.R;
import com.grape.dto.ResponseResult;
import com.grape.exception.GlobalException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: chen
 * @Date: 2021/2/4 4:46 PM
 * @Version 1.0
 */
@Slf4j
@ControllerAdvice
@ResponseBody
public class ResultHandler implements ResponseBodyAdvice<Object> {

    private static final String RESPONSE_RESULT_ANN = "RESPONSE-RESULT-ANN";

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        ResponseResult attribute = (ResponseResult)request.getAttribute(RESPONSE_RESULT_ANN);
        if(attribute ==  null){
            return false;
        }
        return attribute.need();
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter methodParameter,
                                  MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {
        if(body instanceof GlobalException){
            GlobalException exception = (GlobalException) body;
            return R.R(exception.getResultEnum());
        }
        if(body instanceof Exception){
            Exception exception = (Exception) body;
            return R.fail(exception.getMessage());
        }
        return R.success(body);
    }
}
