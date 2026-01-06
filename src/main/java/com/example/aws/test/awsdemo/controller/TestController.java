package com.example.aws.test.awsdemo.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/list")
public class TestController {

    @GetMapping("/list")
    public ResponseEntity<?> getCity() {

        return ResponseEntity.ok(getCities());
    }

    private ArrayList<String> getCities() {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("Phoenix");
        return cities;
    }
}
