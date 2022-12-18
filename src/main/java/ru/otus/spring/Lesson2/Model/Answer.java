package ru.otus.spring.Lesson2.Model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@RequiredArgsConstructor
public class Answer {

    private final String value;


    public String toString() {
        return value;
    }


}
