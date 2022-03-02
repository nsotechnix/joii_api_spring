package com.example.joii_api.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String hotel_u_id;
    @NotBlank
    private String user_id;
    @NotBlank
    private String room_id;
    @Column(name = "check_in_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss", iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime check_in_date ;
    @Column(name = "check_out_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss", iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime check_out_date;
    @NotBlank
    private String status;
    public Booking(){
        super();
    }
    public Booking(Long id,String hotel_u_id,String user_id, String room_id,LocalDateTime check_in_date,LocalDateTime check_out_date,String status) {
        super();
        this.id = id;
        this.hotel_u_id = hotel_u_id;
        this.user_id=user_id;
        this.room_id=room_id;
        this.check_in_date=check_in_date;
        this.check_out_date=check_out_date;
        this.status=status;

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

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    public LocalDateTime getCheck_in_date() {
        return check_in_date;
    }

    public void setCheck_in_date(LocalDateTime check_in_date) {
        this.check_in_date = check_in_date;
    }

    public LocalDateTime getCheck_out_date() {
        return check_out_date;
    }

    public void setCheck_out_date(LocalDateTime check_out_date) {
        this.check_out_date = check_out_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
