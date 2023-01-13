package ru.otus.spring.Lesson2.Model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Question {

    private final String question;
    private final String correctAnswer;


    public String toString() {
        return getQuestion();
    }

}
