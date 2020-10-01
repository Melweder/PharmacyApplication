package com.melweder.pharmacyapp.repositories;

import com.melweder.pharmacyapp.entities.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {
}
