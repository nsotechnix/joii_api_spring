package com.example.joii_api.repository;

import com.example.joii_api.models.Contact;
import com.example.joii_api.models.VendorInfo;
import org.springframework.data.repository.CrudRepository;

public interface VendorInfoRepository extends CrudRepository <VendorInfo,Long> {
}
