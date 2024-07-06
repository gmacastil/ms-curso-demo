package com.lite.ms_curso_demo.infraestructure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1")
public class APIController {

    @GetMapping("/")
    public String getHello() {
        return "Hello World!";
    }

    @PostMapping("/crear")
    public void create() {
        System.out.println("Creating a new object");
    }

    @PutMapping("/update")
    public void update() {
        System.out.println("Update a new object");
    }


}
