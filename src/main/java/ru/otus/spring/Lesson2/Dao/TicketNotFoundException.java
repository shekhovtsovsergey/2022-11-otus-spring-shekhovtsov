package ru.otus.spring.Lesson2.Dao;

public class TicketNotFoundException extends RuntimeException {

    public TicketNotFoundException(String message, Exception e) {
        super(message,e);
    }
}
