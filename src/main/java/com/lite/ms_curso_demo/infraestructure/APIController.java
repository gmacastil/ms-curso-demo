package com.lite.ms_curso_demo.infraestructure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class APIController {

    @Value("${app.mensaje}")
    private String mensaje;

    @Value("${app.factor}")
    private int factor;


    @GetMapping("/")
    public String calcular(int a) {
        return a * factor + "";
    }

    @GetMapping("/hola")
    public String getMensage() {
        return mensaje;
    }

}
