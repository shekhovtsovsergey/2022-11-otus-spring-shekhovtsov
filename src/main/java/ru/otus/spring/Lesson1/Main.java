package ru.otus.spring.Lesson1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring.Lesson1.Repository.RepositoryImpl;
import ru.otus.spring.Lesson1.Service.PrinterImpl;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        RepositoryImpl repository = context.getBean("repository", RepositoryImpl.class);
        PrinterImpl printer = context.getBean("printer", PrinterImpl.class);
        repository.loadCsv();
        printer.print();
        context.close();
    }
}
