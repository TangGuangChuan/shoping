package com.example.shopping.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tangguangchuan
 * @date 2022/5/24 10:47
 */
@RefreshScope(proxyMode = ScopedProxyMode.DEFAULT)
@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${shopping.user.name}")
    private String name;
    @Value("${shopping.user.age}")
    private Integer age;
    @RequestMapping("/hello")
    public Map helloWorld(){
        Map map = new HashMap<>();
        map.put("name",name);
        map.put("age",age);
        System.out.println(name);
        System.out.println(age);
        return map;
    }
}
