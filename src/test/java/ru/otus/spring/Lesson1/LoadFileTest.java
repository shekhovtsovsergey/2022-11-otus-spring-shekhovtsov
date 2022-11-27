package ru.otus.spring.Lesson1;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static junit.framework.Assert.assertEquals;

@DisplayName("Класс LoadFile")
public class LoadFileTest {

    @DisplayName("Класс LoadFile")
    @Test
    void shouldHaveCorrectConstructor(){
        LoadFile loadFile = new LoadFile("question.csv");
        assertEquals("question.csv", loadFile.getFile());

    }


}
