package ru.netology.jdbchw;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.jdbchw.repository.OrderRepository;

import java.util.List;

@SpringBootApplication
public class JdbcHwApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdbcHwApplication.class, args);
    }
}