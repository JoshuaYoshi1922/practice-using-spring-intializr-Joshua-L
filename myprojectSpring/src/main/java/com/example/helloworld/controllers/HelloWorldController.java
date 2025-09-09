package com.example.helloworld.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
