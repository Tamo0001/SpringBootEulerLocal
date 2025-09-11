package com.SpringBoot.Euler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class EulerSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EulerSpringApplication.class, args);
    }
}
