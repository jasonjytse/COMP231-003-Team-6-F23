package com.comp231.team6.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @Author Jason Tse
 */
@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @Column(name = "ticketid")
    @GeneratedValue
    private int ticketId;

    @Column(name = "tickettitle")
    private String ticketTitle;

    @Column(name = "ticketdescription")
    private String ticketDescription;

    @Column(name = "ticketdate")
    private String ticketDate;

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
        this.ticketDate= createdDate;
        this.ticketStatus = status;
        this.ticketCreatedBy = createdBy;
    }

    // Getters and Setters
    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int id) {
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

    public String getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(String createdDate) {
        this.ticketDate = createdDate;
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
                ", createdDateTime=" + ticketDate +
                ", status='" + ticketStatus + '\'' +
                ", createdBy='" + ticketCreatedBy + '\'' +
                '}';
    }
}
