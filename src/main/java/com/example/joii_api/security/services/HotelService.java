package com.example.joii_api.security.services;
import java.util.List;
import com.example.joii_api.models.Hotels;
import java.util.ArrayList;
import java.util.Optional;

import com.example.joii_api.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    // Retrieve all rows from table and populate list with objects
    public List getAllReservations() {

        List hotels = new ArrayList<>();
        hotelRepository.findAll().forEach(hotels::add);

        return hotels;
    }

    // Retrieves one row from table based on given id
    public List<Hotels> findAllByCity(String city) {
        List hotels=new ArrayList<>();
         hotelRepository.findAllByCity(city).forEach(hotels::add);
         return hotels;

    }
    public Optional<Hotels> findAllbyId(Long id){
         return hotelRepository.findById(id);
    }




}
