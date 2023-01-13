package ru.otus.spring.Lesson2.Model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor

public class Ticket {

    private final List<Question> questions;

}
