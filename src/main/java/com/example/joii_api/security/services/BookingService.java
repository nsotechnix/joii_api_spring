package com.example.joii_api.security.services;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.joii_api.models.Booking;
import com.example.joii_api.models.Hotels;
import com.example.joii_api.models.User;
import com.example.joii_api.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    // Retrieve all rows from table and populate list with objects
    public List getAllBookings() {

        List booking = new ArrayList<>();
        bookingRepository.findAll().forEach(booking::add);

        return booking;
    }

    // Retrieves one row from table based on given id
    public Optional<Booking> getBooking(Long id) {
        return bookingRepository.findById(id);

    }

    // Inserts row into table
    public void addBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    public List <Booking> getAllByUser(String user_id){
        return bookingRepository.findByUser(user_id);
    }



    // Updates row in table
//    public void updateBooking(Long id) {
//       return bookingRepository.save(id);
//
//    }

//
//    // Removes row from table
//    public void deleteReservation(Booking booking) {
//        bookingRepository.delete(booking);
//    }
}