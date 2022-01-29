package com.example.springweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringwebController {

    @GetMapping("/greeting")
    public String greeting(){
        return "Welcome to spring websecurity";
    }
}
