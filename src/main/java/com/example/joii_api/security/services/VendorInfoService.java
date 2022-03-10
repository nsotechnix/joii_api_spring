package com.example.joii_api.security.services;

import com.example.joii_api.models.Contact;
import com.example.joii_api.models.VendorInfo;
import com.example.joii_api.repository.BookingRepository;
import com.example.joii_api.repository.ContactRepository;
import com.example.joii_api.repository.VendorInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorInfoService {
    @Autowired
    VendorInfoRepository vendorInfoRepository;

    public void addVendor(VendorInfo vendorInfo){
        vendorInfoRepository.save(vendorInfo);

    }
}
