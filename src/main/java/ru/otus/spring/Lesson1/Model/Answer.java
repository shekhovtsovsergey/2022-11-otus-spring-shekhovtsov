package ru.otus.spring.Lesson1.Model;

import lombok.Getter;
import lombok.Setter;
import ru.otus.spring.Lesson1.Repository.Repository;
import java.util.Map;


@Getter
@Setter
public class Answer implements Repository {

    private final String value;

    public Answer(String value) {
        this.value = value;
    }

    @Override
    public Map<Question, Answer> loadCsv() {
        return null;
    }

    @Override
    public void print() {
    }

    @Override
    public String toString() {
        return value;
    }


}
