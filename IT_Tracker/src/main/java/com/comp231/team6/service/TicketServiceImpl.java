package com.comp231.team6.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.comp231.team6.repository.TicketRepository;
import java.util.List;

import com.comp231.team6.models.Ticket;

public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;


    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket getTicketById(String id) {
        return ticketRepository.findById(id).orElse(null);
    }

    
    
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

   
}