package com.ola_spring.ola_spring.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class InitialController {

    @GetMapping
    public String get(){
        return "Olá Spring";
    }
    
}
