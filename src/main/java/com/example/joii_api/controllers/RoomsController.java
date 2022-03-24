package com.example.joii_api.controllers;

import com.example.joii_api.models.Hotels;
import com.example.joii_api.models.Rooms;
import com.example.joii_api.repository.HotelRepository;
import com.example.joii_api.repository.RoomsRepository;
import com.example.joii_api.security.services.HotelService;
import com.example.joii_api.security.services.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController

public class RoomsController {
    @Autowired
    private RoomsService roomsService;
    @Autowired
    RoomsRepository roomsRepository;
    @RequestMapping(value = "/api/rooms/vendor/{vendor_u_id}", method = RequestMethod.GET)
    public List<Rooms> getbyCity(@PathVariable String vendor_u_id) {
        return roomsService.findAllRooms(vendor_u_id);
    }
    @RequestMapping(value = "/api/rooms/{id}", method = RequestMethod.GET)
    public Optional<Rooms> getbyId(@PathVariable Long id) {
        return roomsService.findAllbyId(id);
    }

}
