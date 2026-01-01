package com.example.aws.test.awsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Happy New Year Everyone! <h1>🚀</h1>";
    }

}
