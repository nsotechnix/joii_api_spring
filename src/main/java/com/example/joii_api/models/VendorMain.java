package com.example.joii_api.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "vendor_main")
public class VendorMain {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String vendor_u_id;
    @NotBlank
    private String name;

    @NotBlank
    private String phone;

    @NotBlank
    private String email;
    @NotBlank
    private String address_line_one;
    private String address_line_two;
    private String locality;
    private String landmark;
    private Long pin_code;
    private String state;

    private String city;

    private String document_one_type;
    private String document_one_name;

    private String document_two_type;
    @NotBlank
    private String doucment_two_name;
    @NotBlank
    private String document_one_image;
    @NotBlank
    private String document_two_image;
    @NotBlank
    private String hotel_image;
    @NotBlank
    private String starting_price;
    @Column(name = "added_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate added_date;
    private String status;


    public VendorMain() {
        super();
    }

    public VendorMain(Long id, String vendor_u_id, String name, String phone, String email, String address_line_one, String address_line_two, String locality, String landmark, Long pin_code, String state, String city, String document_one_type, String document_one_name, String document_two_type, String document_two_image, String document_one_image,
                      String hotel_image, String starting_price, LocalDate added_date, String status) {
        super();
        this.id = id;
        this.vendor_u_id = vendor_u_id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address_line_one = address_line_one;
        this.address_line_two = address_line_two;
        this.locality = locality;
        this.landmark = landmark;
        this.pin_code = pin_code;
        this.state = state;
        this.city = city;
        this.document_one_type = document_one_type;
        this.document_one_name = document_one_name;
        this.document_two_type = document_two_type;
        this.document_one_image = document_one_image;
        this.document_two_image = document_two_image;
        this.hotel_image = hotel_image;
        this.starting_price = starting_price;
        this.added_date = added_date;
        this.status = status;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVendor_u_id() {
        return vendor_u_id;
    }

    public void setVendor_u_id(String vendor_u_id) {
        this.vendor_u_id = vendor_u_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress_line_one() {
        return address_line_one;
    }

    public void setAddress_line_one(String address_line_one) {
        this.address_line_one = address_line_one;
    }

    public String getAddress_line_two() {
        return address_line_two;
    }

    public void setAddress_line_two(String address_line_two) {
        this.address_line_two = address_line_two;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public Long getPin_code() {
        return pin_code;
    }

    public void setPin_code(Long pin_code) {
        this.pin_code = pin_code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDocument_one_type() {
        return document_one_type;
    }

    public void setDocument_one_type(String document_one_type) {
        this.document_one_type = document_one_type;
    }

    public String getDocument_one_name() {
        return document_one_name;
    }

    public void setDocument_one_name(String document_one_name) {
        this.document_one_name = document_one_name;
    }

    public String getDocument_two_type() {
        return document_two_type;
    }

    public void setDocument_two_type(String document_two_type) {
        this.document_two_type = document_two_type;
    }

    public String getDoucment_two_name() {
        return doucment_two_name;
    }

    public void setDoucment_two_name(String doucment_two_name) {
        this.doucment_two_name = doucment_two_name;
    }

    public String getDocument_one_image() {
        return document_one_image;
    }

    public void setDocument_one_image(String document_one_image) {
        this.document_one_image = document_one_image;
    }

    public String getDocument_two_image() {
        return document_two_image;
    }

    public void setDocument_two_image(String document_two_image) {
        this.document_two_image = document_two_image;
    }

    public String getHotel_image() {
        return hotel_image;
    }

    public void setHotel_image(String hotel_image) {
        this.hotel_image = hotel_image;
    }

    public String getStarting_price() {
        return starting_price;
    }

    public void setStarting_price(String starting_price) {
        this.starting_price = starting_price;
    }

    public LocalDate getAdded_date() {
        return added_date;
    }

    public void setAdded_date(LocalDate added_date) {
        this.added_date = added_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}