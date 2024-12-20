package ru.netology.jdbchw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.jdbchw.controller.ProductController;
import ru.netology.jdbchw.service.ProductService;

@Configuration
public class JavaConfig {

    @Bean
    public ProductService productService() {
        return new ProductService();
    }

    @Bean
    public ProductController productController(ProductService productService) {
        return new ProductController(productService);
    }
}