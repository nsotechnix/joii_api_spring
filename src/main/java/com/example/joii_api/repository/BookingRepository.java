package com.example.joii_api.repository;


import com.example.joii_api.models.Booking;
import com.example.joii_api.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends CrudRepository<Booking,String> {
    Optional<Booking> findById(Long id);
    @Query(value = "SELECT * FROM booking WHERE user_id = ?1", nativeQuery = true)
    List <Booking> findByUser(String user_id);

}