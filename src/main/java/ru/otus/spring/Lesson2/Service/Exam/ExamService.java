package ru.otus.spring.Lesson2.Service.Exam;


import ru.otus.spring.Lesson2.Model.Answer;
import ru.otus.spring.Lesson2.Model.Ticket;

public interface ExamService {

    boolean getExamResult(Ticket ticket, Answer answer);

}
