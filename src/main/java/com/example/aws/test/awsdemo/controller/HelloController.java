package com.example.aws.test.awsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello this is test <h3>Spring-Boot on Lambda</h3> </br> <h1>🚀</h1>";
    }

}
