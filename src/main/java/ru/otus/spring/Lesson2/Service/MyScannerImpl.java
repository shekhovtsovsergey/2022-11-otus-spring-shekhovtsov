package ru.otus.spring.Lesson2.Service;

import org.springframework.stereotype.Component;
import ru.otus.spring.Lesson2.Repository.Repository;
import java.util.Scanner;


@Component
public class MyScannerImpl implements MyScanner {


    private final Repository repository;

    public MyScannerImpl(Repository repository) {
        this.repository = repository;
    }


    @Override
    public String scanning(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.println(text);
        return sc.nextLine();
    }



}
