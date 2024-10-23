package com.furryfriendshub.OwnerEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tblregisteraccount")
public class OwnerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int owner_id;

    @Column(name = "firstname")
    private String fname;
    
    private String lname;
    private String email;
    private String phone_number;
    private String address;
    private String payment_type;

    public OwnerEntity() {
        super();
    }

    public OwnerEntity(int owner_id, String fname, String lname, String email, String phone_number, String address, String payment_type) {
        super();
        this.owner_id = owner_id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
        this.payment_type = payment_type;
    }

    public int getOwnerId() {
        return owner_id;
    }

    public void setOwnerId(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getFName() {
        return fname;
    }

    public void setFName(String fName) {
        this.fname = fName;
    }

    public String getLName() {
        return lname;
    }

    public void setLName(String lName) {
        this.lname = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPaymentType() {
        return payment_type;
    }

    public void setPaymentType(String payment_type) {
        this.payment_type = payment_type;
    }

    
}