package com.Schoolmanagementsystem.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String instructorName;
    private String instructorAddress;
    private String phoneNumber;
    @ManyToMany
    List<Courses> coursesList=new ArrayList<>();
    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorAddress() {
        return instructorAddress;
    }

    public void setInstructorAddress(String instructorAddress) {
        this.instructorAddress = instructorAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Instructor(String instructorName, String instructorAddress, String phoneNumber) {
        this.instructorName = instructorName;
        this.instructorAddress = instructorAddress;
        this.phoneNumber = phoneNumber;
    }

    public Instructor() {
    }
}
