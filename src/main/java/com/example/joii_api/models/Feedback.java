package com.example.joii_api.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;

@Entity
@Table(name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String user_id;
    @NotBlank
    private String hotel_u_id;
    @NotBlank
    private String rating;

    private String feedback;

    @NotBlank
    private String status= String.valueOf(1);
    public Feedback(){
        super();
    }
    public Feedback(Long id,String user_id,String hotel_u_id,String rating,String feedback,String status) {
        super();
        this.id = id;
        this.user_id=user_id;
        this.hotel_u_id=hotel_u_id;
        this.rating=rating;
        this.feedback=feedback;
        this.status=status;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }


    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getHotel_u_id() {
        return hotel_u_id;
    }

    public void setHotel_u_id(String hotel_u_id) {
        this.hotel_u_id = hotel_u_id;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
