package ru.otus.spring.Lesson2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.otus.spring.Lesson2.Service.ExamenServiceImpl;

@Configuration
@ComponentScan
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        ExamenServiceImpl examenService = context.getBean(ExamenServiceImpl.class);
        examenService.runExamen();

    }
}
