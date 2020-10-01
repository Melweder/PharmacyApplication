package com.melweder.pharmacyapp.repositories;

import com.melweder.pharmacyapp.entities.Drug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugRepository extends JpaRepository<Drug,Integer> {
}
