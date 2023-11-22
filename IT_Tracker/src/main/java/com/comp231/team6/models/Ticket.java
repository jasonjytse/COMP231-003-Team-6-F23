package com.comp231.team6.models;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

import jakarta.validation.constraints.NotBlank;

@Entity
@Table  (name = "ticket")
public class Ticket {
    @Id
    @Column(name = "ticketid")
    private String ticketId; 
    
    @Column(name = "responderId")
    private String responderId;

    
    private String ticketTitle;
    private String ticketDescription;
    private String ticketStatus;
    private String ticketPriority;
    private String ticketType;
    private Date ticketDate;
    private Time ticketTime;

}
