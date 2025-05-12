package com.example.Courseregistration.Service;

import com.example.Courseregistration.Repository.Courserepository;
import com.example.Courseregistration.Repository.Enrolledrepository;
import com.example.Courseregistration.model.Course;
import com.example.Courseregistration.model.Enrolled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Courseservice {
     @Autowired
    Courserepository repo;
     @Autowired
    Enrolledrepository repoo;
    public List<Course> availablecourse() {
     return repo.findAll();
    }
    public List<Enrolled> getenrolledstudents() {
        return repoo.findAll();
    }

    public void enrollcourse(String emailId, String name, String coursename) {
        Enrolled e=new Enrolled(emailId,name,coursename);
        repoo.save(e);
    }
}
