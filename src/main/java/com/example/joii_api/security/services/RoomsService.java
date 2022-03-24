package com.example.joii_api.security.services;

import com.example.joii_api.models.Hotels;
import com.example.joii_api.models.Rooms;
import com.example.joii_api.repository.HotelRepository;
import com.example.joii_api.repository.RoomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoomsService {
    @Autowired
    private RoomsRepository roomsRepository;
    public List<Rooms> findAllRooms(String vendor_u_id) {
        List rooms=new ArrayList<>();
        roomsRepository.findAvailableRooms(vendor_u_id).forEach(rooms::add);
        return rooms;

    }
    public Optional<Rooms> findAllbyId(Long id){
        return roomsRepository.findById(id);
    }

}
