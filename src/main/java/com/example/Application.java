package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan; // 追加
import org.springframework.data.jpa.repository.config.EnableJpaRepositories; // 追加

@SpringBootApplication
@EntityScan(basePackages = {"com.example.entity"})
@ComponentScan(basePackages = {"com.example.controller", "com.example.service"})
@EnableJpaRepositories(basePackages = {"com.example.repository"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
