package com.example.joii_api.repository;

import com.example.joii_api.models.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository <Contact,String> {
}
