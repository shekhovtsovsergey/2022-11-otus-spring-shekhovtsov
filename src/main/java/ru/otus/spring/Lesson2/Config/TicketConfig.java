package ru.otus.spring.Lesson2.Config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Getter
@PropertySource("classpath:application.properties")
@Configuration
public class TicketConfig {

    @Value("${resourceName}")
    private String resourceName;

    @Value("${correct}")
    private int correct;

}
