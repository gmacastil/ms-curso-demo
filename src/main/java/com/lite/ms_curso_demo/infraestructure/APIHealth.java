package com.lite.ms_curso_demo.infraestructure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("/")
public class APIHealth {
  
    @GetMapping("")
    public String get(){
        return "ok";
    }
   
}
