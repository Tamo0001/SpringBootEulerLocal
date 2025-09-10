package com.SpringBoot.Euler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private Euler7 euler7;


    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> index() {
        logger.info("Application name: {}", appName);
        return ResponseEntity.status(404).body("not found");
    }

    @GetMapping(value = "/euler7/loesung/{euler}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> test(@PathVariable("euler") int euler) {

        // N-te Primzahl berechnen
        int result = euler7.primenumber(euler);

        return ResponseEntity.ok(result);
    }
}




