package com.example.Courseregistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course {
    @Id
    private String courseID;
    private String courseName;
    private String trainer;
    private int durationInWeeks;
}
