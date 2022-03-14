package com.example.joii_api.controllers;
import com.example.joii_api.security.services.HotelService;
import com.example.joii_api.models.Hotels;
import com.example.joii_api.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController

public class HotelController {
    @Autowired
    private HotelService hotelService;
    @Autowired
    HotelRepository hotelRepository;

    @GetMapping("/api/hotels/available")
    public  List <Hotels> getAvailableHotels(){
      return   hotelRepository.findAvailableHotels();
    }

     //Get All Notes
    @GetMapping("/api/hotels")
    public List<Hotels> getAllHotels() {
        return hotelRepository.findAll();
    }

//     ------------ Retrieve hotel list by city name ------------
@RequestMapping(value = "/api/hotels/{id}", method = RequestMethod.GET)
public Optional <Hotels> getbyId(@PathVariable Long id) {
    return hotelService.findAllbyId(id);
}

    @RequestMapping(value = "/api/hotels/city/{city}", method = RequestMethod.GET)
    public List<Hotels> getbyCity(@PathVariable String city) {
        return hotelService.findAllByCity(city);
    }

    @RequestMapping(value = "/api/hotels/city/{city}", method = RequestMethod.POST)
    public List<Hotels> Search(@PathVariable String city) {
        return hotelService.findAllByCity(city);
    }

    @RequestMapping(value = "/api/hotels/price/asc", method = RequestMethod.GET)
    public List<Hotels> getALLHotelsPrice() {
        return hotelService.getAllByPriceASC();
    }
    @RequestMapping(value = "/api/hotels/price/desc", method = RequestMethod.GET)
    public List<Hotels> getALLHotelsPriceDesc() {
        return hotelService.getAllByPriceDESC();
    }

    @RequestMapping(value = "/api/hotels/type/{property_type}", method = RequestMethod.GET)
    public List<Hotels> Getallbyproperty(@PathVariable String property_type) {
        return hotelService.getAllByPropertyType(property_type);
    }










}