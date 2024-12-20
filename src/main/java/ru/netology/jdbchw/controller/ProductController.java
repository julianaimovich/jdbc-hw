package ru.netology.jdbchw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jdbchw.service.ProductService;

import java.util.List;

@RestController
public class ProductController {
    ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductsNames(String name) {
        return service.getProductsNames(name);
    }
}