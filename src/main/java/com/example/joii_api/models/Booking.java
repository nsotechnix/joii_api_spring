package com.example.joii_api.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
    private String hotel_name;
    @NotBlank
    private String room_id;
    @Column(name = "check_in_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate check_in_date;

    @Column(name = "check_out_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate check_out_date ;
    @NotBlank
    private String status;
    @NotBlank
    private  String amount;
    @NotBlank
    private  String no_of_days;
    @CreatedDate
    @Temporal(TemporalType.DATE)
    @Column(name = "booking_date")
    private Date booking_date=new Date();
    public Booking(){
        super();
    }
    public Booking(Long id,String hotel_u_id,String user_id, String room_id,LocalDate check_in_date,LocalDate check_out_date,String status,String amount,String no_of_days,Date booking_date,String hotel_name) {
        super();
        this.id = id;
        this.hotel_u_id = hotel_u_id;
        this.user_id=user_id;
        this.room_id=room_id;
        this.check_in_date=check_in_date;
        this.check_out_date=check_out_date;
        this.status=status;
        this.amount=amount;
        this.no_of_days=no_of_days;
        this.booking_date=booking_date;
        this.hotel_name=hotel_name;

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

    public LocalDate getCheck_in_date() {
        return check_in_date;
    }

    public void setCheck_in_date(LocalDate check_in_date) {
        this.check_in_date = check_in_date;
    }

    public LocalDate getCheck_out_date() {
        return check_out_date;
    }

    public void setCheck_out_date(LocalDate check_out_date) {
        this.check_out_date = check_out_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getNo_of_days() {
        return no_of_days;
    }

    public void setNo_of_days(String no_of_days) {
        this.no_of_days = no_of_days;
    }

    public Date getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(Date booking_date) {
        this.booking_date = booking_date;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }
}
