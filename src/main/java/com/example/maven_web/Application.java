package com.example.maven_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories; // 追加
import org.springframework.boot.autoconfigure.domain.EntityScan; // 追加

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.maven_web", "com.example.maven_logic"}) // 追加
@EnableJpaRepositories(basePackages = "com.example.maven_logic") // 追加
@EntityScan(basePackages = "com.example.maven_logic") // 追加

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
