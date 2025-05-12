package com.example.Courseregistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Enrolled {
    @Id
    private String emailId;
    private String name;
    private String coursename;

    public Enrolled(String emailId, String name, String coursename) {
        this.emailId=emailId;
        this.name=name;
        this.coursename=coursename;
    }
    public Enrolled(){

    }
}

