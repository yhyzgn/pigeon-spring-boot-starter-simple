package com.yhy.simple.pigeon.starter.controller;

import com.yhy.simple.pigeon.starter.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author : 颜洪毅
 * e-mail : yhyzgn@gmail.com
 * time   : 2020-08-30 18:48
 * version: 1.0.0
 * desc   :
 */
@RestController
@RequestMapping("/api/mapper")
public class MapperController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/test")
    public String test() {
        return userMapper.test() + "-test";
    }
}
