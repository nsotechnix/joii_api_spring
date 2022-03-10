package com.example.joii_api.controllers;

import com.example.joii_api.models.Booking;
import com.example.joii_api.models.Contact;
import com.example.joii_api.models.VendorInfo;
import com.example.joii_api.payloads.response.MessageResponse;
import com.example.joii_api.security.services.ContactService;
import com.example.joii_api.security.services.VendorInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VendorInfoController {
    @Autowired
    VendorInfoService vendorInfoService;
    @RequestMapping(value = "/addvendor", method = RequestMethod.POST)
    public ResponseEntity<MessageResponse> addVendor(@RequestBody VendorInfo vendorInfo) {

        vendorInfoService.addVendor(vendorInfo);
        return ResponseEntity.ok(new MessageResponse("Booked  successfully!"));

    }
}
