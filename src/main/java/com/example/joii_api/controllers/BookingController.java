package com.example.joii_api.controllers;

import java.util.List;
import java.util.Optional;

import com.example.joii_api.models.Booking;
import com.example.joii_api.payloads.response.MessageResponse;
import com.example.joii_api.repository.BookingRepository;
import com.example.joii_api.security.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController

@RequestMapping("/api")
public class BookingController {

    @Autowired
    private BookingService bookingService;
    @Autowired
    private BookingRepository bookingRepository;

    // ------------ Retrieve all reservations ------------
    @RequestMapping(value = "/bookings", method = RequestMethod.GET)
    public List getAllReservations() {

        return bookingService.getAllBookings();

    }

    // ------------ Retrieve a reservation ------------
    @RequestMapping(value = "/bookings/id/{id}", method = RequestMethod.GET)
    public Optional<Booking> getBooking(@PathVariable Long id) {
        return bookingService.getBooking(id);
    }

    // ------------ Create a reservation ------------
 //   -------Show Bookings of a User------------
    @RequestMapping(value = "/bookings/addbookings", method = RequestMethod.POST)
    public ResponseEntity<MessageResponse> addReservation(@RequestBody Booking booking) {
        bookingService.addBooking(booking);
        return ResponseEntity.ok(new MessageResponse("Booked  successfully!"));

    }
    @RequestMapping(value = "/bookings/user/{user_id}", method = RequestMethod.GET)
     public List<Booking> getBooking(@PathVariable String user_id) {
         return bookingService.getAllByUser(user_id);
     }



//     ------------ Update a reservation ------------
    @RequestMapping(value = "/bookings/{id}", method = RequestMethod.PUT)
    public ResponseEntity<MessageResponse> updateReservation(@RequestBody Booking booking, @PathVariable Long id) {
        booking.setId(id);
        booking.setStatus(String.valueOf(0));
        bookingRepository.save(booking);
        return ResponseEntity.ok(new MessageResponse("Booking Cancelled!"));

    }
//
//    // ------------ Delete a reservation ------------
//    @RequestMapping(value = "/reservations/{id}", method = RequestMethod.DELETE)
//    public void deleteReservation(@PathVariable String id) {
//        reservationService.deleteReservation(id);
//    }
}
