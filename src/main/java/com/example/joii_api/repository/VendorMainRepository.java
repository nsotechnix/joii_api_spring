package com.example.joii_api.repository;;
import com.example.joii_api.models.Hotels;
import com.example.joii_api.models.VendorMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VendorMainRepository extends JpaRepository<VendorMain, String> {
    @Query(value = "SELECT * FROM vendor_main WHERE status = 1", nativeQuery = true)
    List<VendorMain> findAvailableHotels();
    @Query(value = "SELECT * FROM vendor_main WHERE city = ?1 AND status= 1", nativeQuery = true)
    List<VendorMain>findAllByCity(String city);
    Optional<VendorMain> findById(Long id);
//    List <VendorMain>findAllByOrderByPriceAsc();
//    List <VendorMain>findAllByOrderByPriceDesc();
    @Query(value = "SELECT * FROM vendor_main WHERE property_type = ?1 AND status=1", nativeQuery = true)
    List <VendorMain>findHotelsByProperty_type(String property_type);
}
