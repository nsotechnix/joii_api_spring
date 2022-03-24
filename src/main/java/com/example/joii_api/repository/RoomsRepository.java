package com.example.joii_api.repository;
import java.util.List;
import java.util.Optional;

import com.example.joii_api.models.Hotels;
import com.example.joii_api.models.Rooms;
import org.hibernate.annotations.OrderBy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface RoomsRepository extends JpaRepository<Rooms, String> {
    @Query(value = "SELECT * FROM hotels WHERE vendor_u_id=?1 AND status = 1", nativeQuery = true)
    List <Rooms>findAvailableRooms(String vendor_u_id);
    Optional<Rooms>findById(Long id);

}