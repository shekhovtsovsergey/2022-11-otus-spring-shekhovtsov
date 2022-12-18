package ru.otus.spring.Lesson2.Service;

import org.springframework.stereotype.Component;
import ru.otus.spring.Lesson2.Repository.Repository;
import java.util.Arrays;

@Component
public class PrinterImpl implements Printer{



    private final Repository repository;


    public PrinterImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void print() {
        System.out.println(Arrays.asList(repository.getRepo()));
    }





}
