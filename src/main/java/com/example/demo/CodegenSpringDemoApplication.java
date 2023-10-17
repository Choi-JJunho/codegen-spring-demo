package com.example.demo;

import openapi.api.JunoApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodegenSpringDemoApplication implements JunoApi {

    public static void main(String[] args) {
        SpringApplication.run(CodegenSpringDemoApplication.class, args);
    }

}
