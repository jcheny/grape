package com.grape.interceptor;

import com.grape.dto.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @Author: chen
 * @Date: 2021/2/4 4:40 PM
 * @Version 1.0
 */
@Slf4j
@Component
public class ResultInterceptor implements HandlerInterceptor {

    private static final String RESPONSE_RESULT_ANN = "RESPONSE-RESULT-ANN";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(handler instanceof HandlerMethod){
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Class<?> beanType = handlerMethod.getBeanType();
            Method method = handlerMethod.getMethod();
            if(method != null){
                if(method.isAnnotationPresent(ResponseResult.class)){
                    request.setAttribute(RESPONSE_RESULT_ANN,method.getAnnotation(ResponseResult.class));
                }
            }
            else if(beanType.isAnnotationPresent(ResponseResult.class)){
                request.setAttribute(RESPONSE_RESULT_ANN,beanType.getAnnotation(ResponseResult.class));
            }
        }
        return true;
    }
}
