package ru.digitalhabbits.homework4;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/20-additional.properties")
public class additionalProperties20 {
    // homework.message=Hello from ${current.user} to ${spring.application.name}
    String message;
}
