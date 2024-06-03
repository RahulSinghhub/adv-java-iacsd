package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Patients;

public interface PatientRepository extends JpaRepository<Patients,Long> {
    public List<Patients> findAll();
}
