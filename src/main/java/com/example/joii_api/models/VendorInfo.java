package com.example.joii_api.models;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
@Table(name="vendor_info")
public class VendorInfo {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String email;

    @NotBlank
    private String phone;

    private Long status=Long.valueOf(1);

    @GeneratedValue
    private String unique_id= String.valueOf(UUID.randomUUID());


public VendorInfo(){
    super();
}
    public VendorInfo(Long id,String name,String phone,String email, Long status,String unique_id) {
        super();
        this.id = id;
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.status=status;
        this.unique_id=unique_id;

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

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(String unique_id) {
        this.unique_id = unique_id;
    }
}
