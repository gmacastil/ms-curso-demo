package com.lite.ms_curso_demo.infraestructure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lite.ms_curso_demo.application.ProductApplication;
import com.lite.ms_curso_demo.domain.Product;



@RestController("/productos")
public class APIController {

    @Autowired
    public ProductApplication productApplication;

    // GET es para leer

    @GetMapping("")
    public List<Product> getAllProducts() {
        return productApplication.findAll();
    }

    // POST es para crear

    @PostMapping("")
    public Product createProduct(@RequestBody Product product) {
        return productApplication.save(product);
    }

    // PUt es para update

    // DELETE es para borrar
   
}
