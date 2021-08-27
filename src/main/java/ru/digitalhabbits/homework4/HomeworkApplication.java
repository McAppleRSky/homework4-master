package ru.digitalhabbits.homework4;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Collection;
import java.util.Map;

import static org.slf4j.LoggerFactory.getLogger;

@SpringBootApplication
public class HomeworkApplication
        implements ApplicationRunner {
    private Collection collections;
    private Map map;
    private static final Logger logger = getLogger(HomeworkApplication.class);

    @Value("${homework.message}")
    private String message;

    public static void main(String[] args) {
        SpringApplication.run(HomeworkApplication.class, args);

        /*spring.config.import=classpath:additional-application.properties,
                classpath:additional-application[.yml],
        optional:file:./external.properties,
                classpath:additional-application-properties/ 4spring-boot:2.4.0 */

    }

    @Override
    public void run(ApplicationArguments args) {
        logger.info(message);
    }
}
