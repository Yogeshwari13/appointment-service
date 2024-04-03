package com.yogeshwari.appointmentservice;
import java.time.LocalDateTime;
public class Appointment {
    private long id;

   // private User user;
    private String serviceType;

    public long getId() {
        return id;
    }

    public Appointment(long id, String serviceType, LocalDateTime scheduledDate, String status, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.serviceType = serviceType;
        this.scheduledDate = scheduledDate;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getServiceType() {
        return serviceType;
    }

    public LocalDateTime getScheduledDate() {
        return scheduledDate;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    private LocalDateTime scheduledDate;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
