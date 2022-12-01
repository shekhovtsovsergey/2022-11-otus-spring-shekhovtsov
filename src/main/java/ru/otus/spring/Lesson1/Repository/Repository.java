package ru.otus.spring.Lesson1.Repository;

import ru.otus.spring.Lesson1.Model.Answer;
import ru.otus.spring.Lesson1.Model.Question;

import java.util.Map;

public interface Repository {

    Map<Question, Answer> loadCsv();

    void print();

}
