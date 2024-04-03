package com.yogeshwari.appointmentservice.service;

import com.yogeshwari.appointmentservice.Appointment;

import java.time.LocalDateTime;

public class AppointmentService {
    private static long appointmentIdCounter = 1;

    public Appointment createAppointment(long userId, String serviceType, LocalDateTime scheduledDate, String status) {
        // Call User microservice API to fetch user details
        //User user = getUserDetails(userId);

//        if (user == null) {
//            throw new RuntimeException("User not found");
//        }

        // Create the appointment
        Appointment appointment = new Appointment(appointmentIdCounter++, serviceType, scheduledDate, status, LocalDateTime.now(), LocalDateTime.now());
        return appointment;
    }

//    private User getUserDetails(long userId) {
//        // Make HTTP request to User microservice API to fetch user details
//        // Return user object or null if not found
//        return null;
//    }
}
