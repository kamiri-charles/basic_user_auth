package com.example.basic_user_auth.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Hello {

    @GetMapping(path = "api/test")
    public String hello_world() {
        return "Hello World";
    };

}