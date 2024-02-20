package com.FAT.backendDB.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.CollectionIdMutability;

import javax.swing.*;

@Entity
@Table(name="technicians")
public class Technicians {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    private static long count=1;
//    @Column(name="technician_id")
//    private String tech_id;

    @Column(name="first_name")
    private String first_name;

    @Column(name="second_name")
    private String second_name;

    @Column(name = "email")
    private String email;

    @Column(name="mobile_number")
    private long mobile_number;

    @Column(name="aadhar_number")
    private long aadhar_number;

    @Column(name="password")
    private String password;

    public Technicians() {
    }

    public Technicians(long id, String first_name, String second_name, String email, int mobile_number, long aadhar_number, String password) {
        this.id = id;
        this.first_name = first_name;
        this.second_name = second_name;
        this.email = email;
        this.mobile_number = mobile_number;
        this.aadhar_number = aadhar_number;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(int mobile_number) {
        this.mobile_number = mobile_number;
    }

    public long getAadhar_number() {
        return aadhar_number;
    }

    public void setAadhar_number(long aadhar_number) {
        this.aadhar_number = aadhar_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

