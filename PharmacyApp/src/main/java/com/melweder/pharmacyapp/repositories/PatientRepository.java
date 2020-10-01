package com.melweder.pharmacyapp.repositories;

import com.melweder.pharmacyapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
