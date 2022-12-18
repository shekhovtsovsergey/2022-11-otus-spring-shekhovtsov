package ru.otus.spring.Lesson2.Repository;

import ru.otus.spring.Lesson2.Model.Answer;
import ru.otus.spring.Lesson2.Model.Question;
import java.util.Map;

public interface Repository {

    Map<Question, Answer> loadCsv();

    Map<Question, Answer> getRepo();

}
