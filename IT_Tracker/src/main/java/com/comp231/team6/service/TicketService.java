package com.comp231.team6.service;

import java.util.List;

import com.comp231.team6.models.Ticket;

public interface TicketService {
    List<Ticket> getAllTickets();
    Ticket getTicketById(String id);
}