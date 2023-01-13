package ru.otus.spring.Lesson2.Dao;

import ru.otus.spring.Lesson2.Model.Ticket;

public interface TicketDao {

    Ticket getTicket() throws TicketNotFoundException;

}
