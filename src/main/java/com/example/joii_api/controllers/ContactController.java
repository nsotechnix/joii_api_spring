package com.example.joii_api.controllers;

import com.example.joii_api.models.Booking;
import com.example.joii_api.models.Contact;
import com.example.joii_api.payloads.response.MessageResponse;
import com.example.joii_api.security.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController

@RequestMapping("/api")
public class ContactController {
    @Autowired
    ContactService contactService;
    @RequestMapping(value = "/addcontact", method = RequestMethod.POST)
    public ResponseEntity<MessageResponse> addContact(@RequestBody Contact contact) {
        contactService.addContact(contact);
        return ResponseEntity.ok(new MessageResponse("Sent  successfully!"));

    }
}
