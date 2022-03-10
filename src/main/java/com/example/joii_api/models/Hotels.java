package com.example.joii_api.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "hotels")
public class Hotels {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String room_id;
    @NotBlank
    private String  bed_type;

    @NotBlank
    private String city;

    @NotBlank
    private String description;
    @NotBlank
    private  String hotel_image1;
    @NotBlank
    private  String hotel_image2;
    @NotBlank
    private  String hotel_image3;
    @NotBlank
    private  String hotel_image4;
    @NotBlank
    private  String hotel_image5;
    @NotBlank
    private  String address;

    @NotBlank
    private  String hotel_name;

    @NotBlank
    private Long hotel_phone;
    @NotBlank
    private Long hotel_pin;
    @NotBlank
     private Long price;
    @NotBlank
    private String property_type;
    @NotBlank
    private String room_type;
    @NotBlank
    private String facility;
    @NotBlank
    private Long status;
    @NotBlank
    private String vendor_u_id;
    @Column(name = "added_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate added_date ;
    @Column(name = "update_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate update_date ;




    public Hotels() {
        super();
    }

    public Hotels(Long id,String room_id,String  bed_type,String city,String description,String hotel_image1,String hotel_image2,String hotel_image3,String hotel_image4,String hotel_image5, String address, String hotel_name
    ,Long hotel_phone,Long hotel_pin, Long price,String property_type,String room_type,String facility,Long status,String vendor_u_id,LocalDate added_date,LocalDate update_date) {
        super();
        this.id=id;
        this.room_id=room_id;
        this.bed_type=bed_type;
        this.city=city;
        this.description=description;
        this.hotel_image1=hotel_image1;
        this.hotel_image2=hotel_image2;
        this.hotel_image3=hotel_image3;
        this.hotel_image4=hotel_image4;
        this.hotel_image5=hotel_image5;
        this.address=address;
        this.hotel_name=hotel_name;
        this.hotel_phone=hotel_phone;
        this.hotel_pin=hotel_pin;
        this.price=price;
        this.property_type=property_type;
        this.room_type=room_type;
        this.facility=facility;
        this.status=status;
        this.vendor_u_id=vendor_u_id;
        this.added_date=added_date;
        this.update_date=update_date;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    public String getBed_type() {
        return bed_type;
    }

    public void setBed_type(String bed_type) {
        this.bed_type = bed_type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHotel_image1() {
        return hotel_image1;
    }

    public void setHotel_image1(String hotel_image1) {
        this.hotel_image1 = hotel_image1;
    }

    public String getHotel_image2() {
        return hotel_image2;
    }

    public void setHotel_image2(String hotel_image2) {
        this.hotel_image2 = hotel_image2;
    }

    public String getHotel_image3() {
        return hotel_image3;
    }

    public void setHotel_image3(String hotel_image3) {
        this.hotel_image3 = hotel_image3;
    }

    public String getHotel_image4() {
        return hotel_image4;
    }

    public void setHotel_image4(String hotel_image4) {
        this.hotel_image4 = hotel_image4;
    }

    public String getHotel_image5() {
        return hotel_image5;
    }

    public void setHotel_image5(String hotel_image5) {
        this.hotel_image5 = hotel_image5;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getProperty_type() {
        return property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getVendor_u_id() {
        return vendor_u_id;
    }

    public void setVendor_u_id(String vendor_u_id) {
        this.vendor_u_id = vendor_u_id;
    }

    public LocalDate getAdded_date() {
        return added_date;
    }

    public void setAdded_date(LocalDate added_date) {
        this.added_date = added_date;
    }

    public LocalDate getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(LocalDate update_date) {
        this.update_date = update_date;
    }
}