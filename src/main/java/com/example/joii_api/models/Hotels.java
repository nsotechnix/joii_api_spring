package com.example.joii_api.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Entity
@Table(name = "hotels")
public class Hotels {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String hotel_u_id;
    @NotBlank
    private String hotel_name;
    @NotBlank
    private String hotel_address;
    @NotBlank
    private Long hotel_phone;
    @NotBlank
    private Long hotel_pin;
    @NotBlank
    private String hotel_landmark;
    @NotBlank
    private String hotel_image;
    @NotBlank
    private String hotel_doc1;
    @NotBlank
    private String hotel_doc_2;
    @NotBlank
    private String hotel_doc_3;
    @NotBlank
    private  String city;
    @NotBlank
    private Long hotel_status;
    public Hotels(){
        super();
    }
    public Hotels(Long id,String hotel_u_id, String hotel_name, String hotel_address,Long hotel_phone,Long hotel_pin,String hotel_landmark,String hotel_image,String hotel_doc1,String hotel_doc_2, String hotel_doc_3,String city,Long hotel_status) {
        super();
        this.id = id;
        this.hotel_name = hotel_name;
        this.hotel_u_id = hotel_u_id;
        this.hotel_address=hotel_address;
        this.hotel_phone=hotel_phone;
        this.hotel_pin=hotel_pin;
        this.hotel_landmark=hotel_landmark;
        this.hotel_image=hotel_image;
        this.hotel_doc1=hotel_doc1;
        this.hotel_doc_2=hotel_doc_2;
        this.hotel_doc_3=hotel_doc_3;
        this.city=city;
        this.hotel_status=hotel_status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotel_u_id() {
        return hotel_u_id;
    }

    public void setHotel_u_id(String hotel_u_id) {
        this.hotel_u_id = hotel_u_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_address() {
        return hotel_address;
    }

    public void setHotel_address(String hotel_address) {
        this.hotel_address = hotel_address;
    }

    public Long getHotel_phone() {
        return hotel_phone;
    }

    public void setHotel_phone(Long hotel_phone) {
        this.hotel_phone = hotel_phone;
    }

    public Long getHotel_pin() {
        return hotel_pin;
    }

    public void setHotel_pin(Long hotel_pin) {
        this.hotel_pin = hotel_pin;
    }

    public String getHotel_landmark() {
        return hotel_landmark;
    }

    public void setHotel_landmark(String hotel_landmark) {
        this.hotel_landmark = hotel_landmark;
    }

    public String getHotel_image() {
        return hotel_image;
    }

    public void setHotel_image(String hotel_image) {
        this.hotel_image = hotel_image;
    }

    public String getHotel_doc1() {
        return hotel_doc1;
    }

    public void setHotel_doc1(String hotel_doc1) {
        this.hotel_doc1 = hotel_doc1;
    }

    public String getHotel_doc_2() {
        return hotel_doc_2;
    }

    public void setHotel_doc_2(String hotel_doc_2) {
        this.hotel_doc_2 = hotel_doc_2;
    }

    public String getHotel_doc_3() {
        return hotel_doc_3;
    }

    public void setHotel_doc_3(String hotel_doc_3) {
        this.hotel_doc_3 = hotel_doc_3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getHotel_status() {
        return hotel_status;
    }

    public void setHotel_status(Long hotel_status) {
        this.hotel_status = hotel_status;
    }
}
