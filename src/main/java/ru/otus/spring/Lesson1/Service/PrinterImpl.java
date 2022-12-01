package ru.otus.spring.Lesson1.Service;

import ru.otus.spring.Lesson1.Repository.Repository;

public class PrinterImpl implements Printer{

    private final Repository repository;

    public PrinterImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void print(){
        repository.print();
    }

}
