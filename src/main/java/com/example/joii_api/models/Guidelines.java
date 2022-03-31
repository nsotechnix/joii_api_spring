package com.example.joii_api.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name="guideline")
public class Guidelines {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String vendor_u_id;
    private String guideline;
    @NotBlank
    @Column(name = "added_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate added_date ;
    @NotBlank
    private String status= String.valueOf(1);

    public Guidelines(){super();}

    public Guidelines(Long id,String vendor_u_id,String guideline,LocalDate added_date,String status){
        this.id=id;
        this.vendor_u_id=vendor_u_id;
        this.guideline=guideline;
        this.added_date=added_date;
        this.status=status;

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

    public String getGuideline() {
        return guideline;
    }

    public void setGuideline(String guideline) {
        this.guideline = guideline;
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
