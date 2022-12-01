package ru.otus.spring.Lesson1.Model;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

@DisplayName("Класс QuestionTest")
public class QuestionTest {


    @DisplayName("Класс LoadFile")
    @Test
    void shouldHaveCorrectConstructor(){
        Question question = new Question("hello");
        assertEquals("hello", question.getValue());

    }


}
