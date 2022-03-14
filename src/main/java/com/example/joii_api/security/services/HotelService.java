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
        hotelRepository.findAvailableHotels().forEach(hotels::add);

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

    public List getAllByPriceASC(){
        List hotels= new ArrayList<>();
        hotelRepository.findAllByOrderByPriceAsc().forEach(hotels::add);
        return hotels;
    }
    public List getAllByPriceDESC(){
        List hotels= new ArrayList<>();
        hotelRepository.findAllByOrderByPriceDesc().forEach(hotels::add);
        return hotels;
    }
    public List getAllByPropertyType(String property_type){
        List hotels = new ArrayList<>();
        hotelRepository.findHotelsByProperty_type(property_type).forEach(hotels::add);
        return hotels;

    }




}
