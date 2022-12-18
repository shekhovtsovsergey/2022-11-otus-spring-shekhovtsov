package ru.otus.spring.Lesson2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring.Lesson2.Repository.RepositoryImpl;
import ru.otus.spring.Lesson2.Service.PrinterImpl;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        RepositoryImpl repository = context.getBean("repository", RepositoryImpl.class);
        PrinterImpl printer = context.getBean("printer", PrinterImpl.class);
        repository.loadCsv();
        printer.print();
    }
}
