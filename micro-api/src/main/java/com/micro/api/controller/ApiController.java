package com.micro.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiController {
    /**
     * ADMIN权限访问
     * @return
     */
    @GetMapping("hello")
    public String getHello(){
        return  "hello";
    }

    /**
     * ADMIN,USER权限访问
     * @return
     */
    @GetMapping("hi")
    public String getHi(){
        return  "hi";
    }
}
