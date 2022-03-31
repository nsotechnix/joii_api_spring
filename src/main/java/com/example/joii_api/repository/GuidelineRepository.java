package com.example.joii_api.repository;

import com.example.joii_api.models.Guidelines;
import com.example.joii_api.models.Hotels;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GuidelineRepository extends CrudRepository<Guidelines,Long> {
    @Query(value = "SELECT * FROM guideline WHERE vendor_u_id=?1 and status = 1", nativeQuery = true)
    List<Guidelines> findGuidelines(String vendor_u_id);
}
