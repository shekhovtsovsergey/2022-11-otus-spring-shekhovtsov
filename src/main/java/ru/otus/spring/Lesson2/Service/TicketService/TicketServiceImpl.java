package ru.otus.spring.Lesson2.Service.TicketService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.otus.spring.Lesson2.Dao.TicketDao;
import ru.otus.spring.Lesson2.Model.Ticket;

@RequiredArgsConstructor
@Service
public class TicketServiceImpl implements TicketService {

    private final TicketDao ticketDao;

    @Override
    public Ticket getTicket() {
        return ticketDao.getTicket();
    }

}
