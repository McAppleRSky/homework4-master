package ru.digitalhabbits.homework4;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/config/application-${property.environment}.properties")
public class MyProperties {
    String name, user, message;
}
