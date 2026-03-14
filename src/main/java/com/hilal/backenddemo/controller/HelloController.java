package com.hilal.backenddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Backend";
    }

    @GetMapping("/info")
    public String info(){ return "backend is running"; }

    @GetMapping("/status")
    public String status(){ return "API is working"; }
}
