package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/helloworld")
    public String helloworld(){
        return "helloworld";
    }

    @RequestMapping("/helloworld2")
    public String helloworld2(){
        return "helloworld2";
    }
}
