package com.SpringBoot.Euler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class EulerSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EulerSpringApplication.class, args);
//        var euler6 = context.getBean(Euler6.class);
//        euler6.sumSquaresResult();
//        System.out.println(euler6.sumSquaresResult());

         Euler7 euler7 = context.getBean(Euler7.class);

        //System.out.println(euler7.primenumber());

    }
}
