package ru.netology.jdbchw.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.netology.jdbchw.repository.OrderRepository;

import java.util.List;

public class ProductService {

    @Autowired
    OrderRepository orderRepository;

    public List<String> getProductsNames(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be empty");
        }
        return orderRepository.getProductsNames(name);
    }
}