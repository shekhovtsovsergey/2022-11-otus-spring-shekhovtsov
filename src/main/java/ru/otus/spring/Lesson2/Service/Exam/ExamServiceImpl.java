package ru.otus.spring.Lesson2.Service.Exam;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.otus.spring.Lesson2.Config.TicketConfig;
import ru.otus.spring.Lesson2.Model.Answer;
import ru.otus.spring.Lesson2.Model.Ticket;

@RequiredArgsConstructor
@Service
public class ExamServiceImpl implements ExamService {

    private final TicketConfig ticketConfig;

    @Override
    public boolean getExamResult(Ticket ticket, Answer answer) {
        long countCorrectStudentAnswers = ticket.getQuestions().stream()
                .filter(q -> answer.getAnswer(q).equalsIgnoreCase(q.getCorrectAnswer()))
                .count();
        return countCorrectStudentAnswers >= ticketConfig.getCorrect();
    }

}
