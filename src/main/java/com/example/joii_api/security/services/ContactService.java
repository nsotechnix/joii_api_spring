package com.example.joii_api.security.services;

import com.example.joii_api.models.Contact;
import com.example.joii_api.repository.BookingRepository;
import com.example.joii_api.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    ContactRepository contactRepository;

    public void addContact(Contact contact){
         contactRepository.save(contact);

    }
}
