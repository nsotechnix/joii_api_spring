package com.example.joii_api.repository;
import java.util.List;
import java.util.Optional;

import com.example.joii_api.models.Hotels;
import org.hibernate.annotations.OrderBy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface HotelRepository extends JpaRepository<Hotels, String> {
    @Query(value = "SELECT * FROM hotels WHERE status = 1", nativeQuery = true)
    List <Hotels>findAvailableHotels();
    @Query(value = "SELECT * FROM hotels WHERE city = ?1 AND status= 1", nativeQuery = true)
    List<Hotels>findAllByCity(String  city);
    Optional<Hotels>findById(Long id);
   List <Hotels>findAllByOrderByPriceAsc();
   List <Hotels>findAllByOrderByPriceDesc();
    @Query(value = "SELECT * FROM hotels WHERE property_type = ?1 AND status=1", nativeQuery = true)
   List <Hotels>findHotelsByProperty_type(String property_type);

}