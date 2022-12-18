package ru.otus.spring.Lesson2.Service;

import org.springframework.stereotype.Component;
import ru.otus.spring.Lesson2.Model.Student;
import ru.otus.spring.Lesson2.Repository.Repository;

@Component
public class ExamenServiceImpl implements ExamenService{


    private final MyScanner myScanner;
    private final Repository repository;
    private final Printer printer;
    private String text = "Enter your name:";


    public ExamenServiceImpl(MyScanner myScanner, Repository repository, Printer printer) {
        this.myScanner = myScanner;
        this.repository = repository;
        this.printer = printer;
    }


    @Override
    public void runExamen() {
        repository.loadCsv();
        String name =  myScanner.scanning(text);
        Student student = new Student(name);
        printer.print();
    }


}
