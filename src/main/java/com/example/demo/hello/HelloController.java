package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaojunjie on 5/8/17.
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "Hello Spring Boot";
    }
}
