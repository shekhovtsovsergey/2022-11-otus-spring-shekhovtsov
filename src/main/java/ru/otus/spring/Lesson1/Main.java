package ru.otus.spring.Lesson1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        LoadFile loadFile = context.getBean("loadFile", LoadFile.class);
        loadFile.loadFile();
        context.close();
    }

}
