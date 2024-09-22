package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan; // 追加
import org.springframework.data.jpa.repository.config.EnableJpaRepositories; // 追加

// @SpringBootApplication(scanBasePackages = {"com.example.controller", "com.example.service", "com.example.entity", "com.example.repository"})
// @ComponentScan(basePackages = {"com.example.controller", "com.example.service", "com.example.entity", "com.example.repository"})
// @EnableJpaRepositories(basePackages = {"com.example.repository"})
// @EntityScan(basePackages = {"com.example.entity"})

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.entity"})
@EnableJpaRepositories(basePackages = {"com.example.repository"})
@EntityScan(basePackages = {"com.example.entity"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
