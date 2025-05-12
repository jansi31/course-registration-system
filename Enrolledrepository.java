package com.example.Courseregistration.Repository;

import com.example.Courseregistration.model.Enrolled;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Enrolledrepository extends JpaRepository<Enrolled,String> {
}
