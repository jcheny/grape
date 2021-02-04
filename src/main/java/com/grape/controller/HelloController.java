package com.grape.controller;

import com.grape.dto.ResponseResult;
import com.grape.entity.Bgm;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chen
 * @Date: 2021/2/4 3:11 PM
 * @Version 1.0
 */
@RestController
@RequestMapping("hello")
@ResponseResult
public class HelloController {

    @RequestMapping("/1")
    @ResponseResult(need = false)
    public Bgm hello(){
        Bgm bgm = new Bgm();
        bgm.setAuthor("343");
        return bgm;
    }

}
