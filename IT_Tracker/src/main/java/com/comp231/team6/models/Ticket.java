package com.comp231.team6.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDateTime;

@EntityScan
public class Ticket {
    
    // Fields
    private String id;
    private String title;
    private String description;
    private LocalDateTime createdDateTime;
    private String status;
    private String createdBy;

    // Default constructor required by JPA
    public Ticket() {
    }

    // Constructor with title, description, date/time, status, and creator
    public Ticket(String title, String description, LocalDateTime createdDateTime, String status, String createdBy) {
        this.title = title;
        this.description = description;
        this.createdDateTime = createdDateTime;
        this.status = status;
        this.createdBy = createdBy;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    // You might want to override equals() and hashCode() as well, especially if you're using these objects in collections.

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createdDateTime=" + createdDateTime +
                ", status='" + status + '\'' +
                ", createdBy='" + createdBy + '\'' +
                '}';
    }
