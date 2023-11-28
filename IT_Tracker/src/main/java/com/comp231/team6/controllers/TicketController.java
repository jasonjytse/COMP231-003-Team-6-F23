package com.comp231.team6.controllers;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.comp231.team6.models.Ticket;
import com.comp231.team6.service.TicketService;

public class TicketController {

    private final TicketService ticketService;

    
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/tickets")
    public String listTickets(Model model) {
        List<Ticket> tickets = ticketService.getAllTickets();
        model.addAttribute("tickets", tickets);
        return "ticket/list"; // Assuming you have a Thymeleaf template named "list.html"
    }
}
