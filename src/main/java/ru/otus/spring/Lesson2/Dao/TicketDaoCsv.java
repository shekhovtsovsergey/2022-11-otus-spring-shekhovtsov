package ru.otus.spring.Lesson2.Dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.otus.spring.Lesson2.Config.TicketConfig;
import ru.otus.spring.Lesson2.Model.Question;
import ru.otus.spring.Lesson2.Model.Ticket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class TicketDaoCsv implements TicketDao {

    private final TicketConfig ticketConfig;

    @Override
    public Ticket getTicket() throws TicketNotFoundException {
        try (InputStream i = TicketDaoCsv.class.getResourceAsStream("/" + ticketConfig.getResourceName());
            BufferedReader r = new BufferedReader(new InputStreamReader(i))) {
            List<Question> questions = new ArrayList<>();
            String l;
            while ((l = r.readLine()) != null) {
                if (l.isEmpty()) {
                    continue;
                }
                List<String> elements = Arrays.asList(l.split(";"));
                questions.add(new Question(elements.get(0), elements.get(1)));
            }
            return new Ticket(questions);
        } catch (Exception e) {
            throw new TicketNotFoundException("Ticket with name " + ticketConfig.getResourceName() + " not found", e);
        }
    }
}
