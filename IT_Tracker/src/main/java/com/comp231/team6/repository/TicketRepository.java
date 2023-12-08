package com.comp231.team6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comp231.team6.models.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    
}
