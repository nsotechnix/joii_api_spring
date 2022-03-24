package com.example.joii_api.security.services;
import java.util.List;
import com.example.joii_api.models.Hotels;
import java.util.ArrayList;
import java.util.Optional;

import com.example.joii_api.models.VendorMain;
import com.example.joii_api.repository.HotelRepository;
import com.example.joii_api.repository.VendorMainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorMainService {

    @Autowired
    private VendorMainRepository vendorMainRepository;

    // Retrieve all rows from table and populate list with objects
    public List getAllReservations() {

        List hotels = new ArrayList<>();
        vendorMainRepository.findAvailableHotels().forEach(hotels::add);

        return hotels;
    }

    // Retrieves one row from table based on given id
    public List<VendorMain> findAllByCity(String city) {
        List hotels=new ArrayList<>();
        vendorMainRepository.findAllByCity(city).forEach(hotels::add);
        return hotels;

    }
    public Optional<VendorMain> findAllbyId(Long id){
        return vendorMainRepository.findById(id);
    }

//    public List getAllByPriceASC(){
//        List hotels= new ArrayList<>();
//        vendorMainRepository.findAllByOrderByPriceAsc().forEach(hotels::add);
//        return hotels;
//    }
//    public List getAllByPriceDESC(){
//        List hotels= new ArrayList<>();
//        vendorMainRepository.findAllByOrderByPriceDesc().forEach(hotels::add);
//        return hotels;
//    }
    public List getAllByPropertyType(String property_type){
        List hotels = new ArrayList<>();
        vendorMainRepository.findHotelsByProperty_type(property_type).forEach(hotels::add);
        return hotels;

    }




}
