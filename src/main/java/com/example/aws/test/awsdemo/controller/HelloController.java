package com.example.aws.test.awsdemo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Happy New Year Everyone! <h1>🚀</h1>";
    }

    @GetMapping("/list")
    public ArrayList<String> getCity() {

        return new ArrayList<String>() {
            {
                add("New York");
                add("Los Angeles");
                add("Chicago");
                add("Houston");
                add("Phoenix");
            }
        };
    }
    

}
