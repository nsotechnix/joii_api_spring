package com.example.joii_api.repository;
import java.util.List;
import java.util.Optional;

import com.example.joii_api.models.Hotels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface HotelRepository extends JpaRepository<Hotels, String> {

    List<Hotels>findAllByCity(String  city);
    Optional<Hotels>findById(Long id);

}