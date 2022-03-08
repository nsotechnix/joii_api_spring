package com.example.joii_api.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;

@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String phone;
    @NotBlank
    private String message;

    @NotBlank
    private String status= String.valueOf(1);
    public Contact(){
        super();
    }
    public Contact(Long id,String name,String email,String phone,String message,String status) {
        super();
        this.id = id;
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.message=message;
        this.status=status;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
