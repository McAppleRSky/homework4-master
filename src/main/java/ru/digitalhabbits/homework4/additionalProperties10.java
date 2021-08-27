package ru.digitalhabbits.homework4;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(
        ignoreResourceNotFound = false,
        value="classpath:config/10-additional.properties")
public class additionalProperties10 {
    // current.user=anonymous
    String user;
}
