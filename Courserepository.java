package com.example.Courseregistration.Repository;

import com.example.Courseregistration.model.Course;
import com.example.Courseregistration.model.Enrolled;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Courserepository extends JpaRepository<Course, String>{
}
