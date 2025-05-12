package com.example.Courseregistration.Controller;

import com.example.Courseregistration.Service.Courseservice;
import com.example.Courseregistration.model.Course;
import com.example.Courseregistration.model.Enrolled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")

public class Coursecontroller {
    @Autowired
    Courseservice service;
    @GetMapping("courses")
    public List<Course> availablecourses(){
        return service.availablecourse();
    }
    @GetMapping("courses/enrolled")
    public List<Enrolled> getenrolledstudents(){
        return service.getenrolledstudents();
    }
    @PostMapping("courses/register")
    public String enrollcourse(@RequestParam("emailId")String emailId,@RequestParam("name") String name,@RequestParam("coursename") String coursename){
        service.enrollcourse(emailId,name,coursename);
        return "Congratulations"+name+"successfully enrolled for"+coursename;
    }
}
