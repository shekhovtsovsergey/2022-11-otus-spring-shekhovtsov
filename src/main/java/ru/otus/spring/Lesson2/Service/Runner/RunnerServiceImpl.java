package ru.otus.spring.Lesson2.Service.Runner;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.otus.spring.Lesson2.Model.Answer;
import ru.otus.spring.Lesson2.Model.Student;
import ru.otus.spring.Lesson2.Model.Ticket;
import ru.otus.spring.Lesson2.Service.Exam.ExamService;
import ru.otus.spring.Lesson2.Service.IOService.IOService;
import ru.otus.spring.Lesson2.Service.Student.StudentService;
import ru.otus.spring.Lesson2.Service.TicketService.TicketService;

@Component
@RequiredArgsConstructor
public class RunnerServiceImpl implements RunnerService {


    private final TicketService ticketService;
    private final ExamService examService;
    private final StudentService studentService;
    private final IOService ioService;



    @Override
    public void run() {
        Student student = studentService.getStudent();
        Ticket ticket = ticketService.getTicket();
        boolean examResult = examService.getExamResult(ticket, getAnswers(ticket));
        ioService.outputString(examResult ? "\nCongratulations, " + student.getFirstName() + " "  + "! You passed the exam!"
                : "\nI'm sorry, " + student.getFirstName() + " " + ". But you didn't pass the exam.");
    }


    private Answer getAnswers(Ticket ticket) {
        Answer answer = new Answer();
        ticket.getQuestions().forEach(question -> {
            ioService.outputString(String.valueOf(question));
            answer.putAnswer(question, ioService.inputString());
        });
        return answer;
    }


}
