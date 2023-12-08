package com.comp231.team6.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @Column(name = "ticketid")
    @GeneratedValue
    private String ticketId;

    @Column(name = "tickettitle")
    private String ticketTitle;

    @Column(name = "ticketdescription")
    private String ticketDescription;

    @Column(name = "ticketcreateddate")
    private String ticketCreatedDate;

    @Column(name = "ticketstatus")
    private String ticketStatus;

    @Column(name = "ticketcreatedby")
    private String ticketCreatedBy;

    // Default constructor required by JPA
    public Ticket() {
    }

    // Constructor with title, description, date/time, status, and creator
    public Ticket(String title, String description, String createdDate, String status, String createdBy) {
        this.ticketTitle = title;
        this.ticketDescription = description;
        this.ticketCreatedDate= createdDate;
        this.ticketStatus = status;
        this.ticketCreatedBy = createdBy;
    }

    // Getters and Setters
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String id) {
        this.ticketId = id;
    }

    public String getTicketTitle() {
        return ticketTitle;
    }

    public void setTicketTitle(String title) {
        this.ticketTitle = title;
    }

    public String getTicketDescription() {
        return ticketDescription;
    }

    public void setTicketDescription(String description) {
        this.ticketDescription = description;
    }

    public String getCreatedDateTime() {
        return ticketCreatedDate;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.ticketCreatedDate = createdDateTime;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String status) {
        this.ticketStatus = status;
    }

    public String getTicketCreatedBy() {
        return ticketCreatedBy;
    }

    public void setTicketCreatedBy(String createdBy) {
        this.ticketCreatedBy = createdBy;
    }

    // You might want to override equals() and hashCode() as well, especially if you're using these objects in collections.

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + ticketId +
                ", title='" + ticketTitle + '\'' +
                ", description='" + ticketDescription + '\'' +
                ", createdDateTime=" + ticketCreatedDate +
                ", status='" + ticketStatus + '\'' +
                ", createdBy='" + ticketCreatedBy + '\'' +
                '}';
    }
}
