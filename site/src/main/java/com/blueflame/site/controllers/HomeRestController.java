package com.blueflame.site.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

    @GetMapping("/")
    public String helloWorld(){
        return "Dekh ke gadiyan vadiyan vadiyan meri daran friendan ve";
    }
}
