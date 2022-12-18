package ru.otus.spring.Lesson2.Service;

import ru.otus.spring.Lesson2.Repository.Repository;
import java.util.Arrays;

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
