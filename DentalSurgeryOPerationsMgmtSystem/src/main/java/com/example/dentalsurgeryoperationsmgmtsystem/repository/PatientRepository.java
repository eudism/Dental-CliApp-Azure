package com.example.dentalsurgeryoperationsmgmtsystem.repository;

import com.example.dentalsurgeryoperationsmgmtsystem.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByNameContainingIgnoreCase(String string);
}
