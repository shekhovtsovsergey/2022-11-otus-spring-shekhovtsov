package ru.otus.spring.Lesson2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.otus.spring.Lesson2.Service.Runner.RunnerServiceImpl;

@Configuration
@ComponentScan
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        RunnerServiceImpl runnerService = context.getBean(RunnerServiceImpl.class);
        runnerService.run();
    }
}
