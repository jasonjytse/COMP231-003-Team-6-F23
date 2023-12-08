package com.comp231.team6.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.comp231.team6.models.Ticket;
import com.comp231.team6.repository.TicketRepository;
import org.springframework.web.bind.annotation.PostMapping;

@RequestMapping("/")
@Controller
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;


    @GetMapping
    public String index() {
        return "create";
    }

    @PostMapping
    public String createTicket(@RequestParam(value="ticketTitle") String ticketTitle,
                                @RequestParam(value="ticketDescription") String ticketDescription,
                                @RequestParam(value="ticketCreatedDate") String ticketCreatedDate,
                                @RequestParam(value="ticketStatus") String ticketStatus,
                                @RequestParam(value="ticketCreatedBy") String ticketCreatedBy) {

        Ticket ticket = new Ticket(ticketTitle, ticketDescription, ticketCreatedDate, ticketStatus, ticketCreatedBy);
        ticketRepository.save(ticket);
        return "redirect:/tickets";
    }

    @GetMapping("tickets")
    public String listTickets(Model model) {
        List<Ticket> tickets = ticketRepository.findAll();
        for (Ticket ticket : tickets) {
            System.out.println(ticket.toString());
        }

        model.addAttribute("tickets", tickets);
        return "list";
    }


}
