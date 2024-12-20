package ru.netology.jdbchw;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.jdbchw.repository.OrderRepository;

import java.util.List;

@SpringBootApplication
public class JdbcHwApplication {
    /*private final OrderRepository orderRepository;

    public JdbcHwApplication(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }*/

    public static void main(String[] args) {
        SpringApplication.run(JdbcHwApplication.class, args);
    }

    /*@Override
    public void run(String... args) {
        String name = "Alexey";
        List<String> product = orderRepository.getProductsNames(name);
        product.forEach(productName -> System.out.printf("Product name: %s\n", productName));
    }*/
}