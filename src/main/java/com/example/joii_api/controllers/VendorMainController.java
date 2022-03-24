package com.example.joii_api.controllers;
import com.example.joii_api.models.VendorMain;
import com.example.joii_api.repository.VendorMainRepository;
import com.example.joii_api.models.Hotels;
import com.example.joii_api.security.services.VendorMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController

public class VendorMainController {
    @Autowired
    private VendorMainService vendorMainService;
    @Autowired
    VendorMainRepository vendorMainRepository;

    @GetMapping("/api/vendor/available")
    public  List <VendorMain> getAvailableHotels(){
        return   vendorMainRepository.findAvailableHotels();
    }

//    //Get All Notes
//    @GetMapping("/api/vendor")
//    public List<VendorMain> getAllHotels() {
//        return vendorMainRepository.findAll();
//    }

    //     ------------ Retrieve hotel list by city name ------------
    @RequestMapping(value = "/api/vendor/{id}", method = RequestMethod.GET)
    public Optional <VendorMain> getbyId(@PathVariable Long id) {
        return vendorMainService.findAllbyId(id);
    }

    @RequestMapping(value = "/api/vendor/city/{city}", method = RequestMethod.GET)
    public List<VendorMain> getbyCity(@PathVariable String city) {
        return vendorMainService.findAllByCity(city);
    }

    @RequestMapping(value = "/api/vendor/city/{city}", method = RequestMethod.POST)
    public List<VendorMain> Search(@PathVariable String city) {
        return vendorMainService.findAllByCity(city);
    }

//    @RequestMapping(value = "/api/vendor/price/asc", method = RequestMethod.GET)
//    public List<VendorMain> getALLHotelsPrice() {
//        return vendorMainService.getAllByPriceASC();
//    }
//    @RequestMapping(value = "/api/vendor/price/desc", method = RequestMethod.GET)
//    public List<VendorMain> getALLHotelsPriceDesc() {
//        return vendorMainService.getAllByPriceDESC();
//    }

    @RequestMapping(value = "/api/vendor/type/{property_type}", method = RequestMethod.GET)
    public List<VendorMain> Getallbyproperty(@PathVariable String property_type) {
        return vendorMainService.getAllByPropertyType(property_type);
    }










}