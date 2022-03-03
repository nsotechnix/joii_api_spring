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
    private String vendor_u_id;
    @NotBlank
    private String hotel_name;
    @NotBlank
    private String hotel_address;
    @NotBlank
    private Long hotel_phone;
    @NotBlank
    private Long hotel_pin;
    @NotBlank
    private String hotel_image1;
    @NotBlank
    private String hotel_image2;
    private String hotel_image3;
    private String hotel_image4;
    private String hotel_image5;
    @NotBlank
    private String city;
    @NotBlank
    private Long status;
    @NotBlank
    private String property_type;
    @NotBlank
    private String room_type;
    @NotBlank
    private String bed_type;
    @NotBlank
    private Long ac;
    @NotBlank
    private Long wifi;
    @NotBlank
    private Long garden;
    @NotBlank
    private Long price;
    @NotBlank
    private String description;

    public Hotels() {
        super();
    }

    public Hotels(Long id, String vendor_u_id, String hotel_name, String hotel_address, Long hotel_phone, Long hotel_pin, String hotel_image1, String hotel_image2, String hotel_image3, String hotel_image4, String hotel_image5, String city, Long status, String property_type, String room_type, String bed_type, Long ac, Long wifi, Long garden, Long price, String description) {
        super();
        this.id = id;
        this.vendor_u_id = vendor_u_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.hotel_phone = hotel_phone;
        this.hotel_pin = hotel_pin;
        this.hotel_image1 = hotel_image1;
        this.hotel_image2 = hotel_image2;
        this.hotel_image3 = hotel_image3;
        this.hotel_image4 = hotel_image4;
        this.hotel_image5 = hotel_image5;
        this.city = city;
        this.room_type = room_type;
        this.property_type = property_type;
        this.price = price;
        this.bed_type = bed_type;
        this.ac = ac;
        this.garden = garden;
        this.wifi = wifi;
        this.description = description;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
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

    public String getBed_type() {
        return bed_type;
    }

    public void setBed_type(String bed_type) {
        this.bed_type = bed_type;
    }

    public Long getAc() {
        return ac;
    }

    public void setAc(Long ac) {
        this.ac = ac;
    }

    public Long getWifi() {
        return wifi;
    }

    public void setWifi(Long wifi) {
        this.wifi = wifi;
    }

    public Long getGarden() {
        return garden;
    }

    public void setGarden(Long garden) {
        this.garden = garden;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}