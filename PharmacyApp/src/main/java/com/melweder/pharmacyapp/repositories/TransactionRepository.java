package com.melweder.pharmacyapp.repositories;

import com.melweder.pharmacyapp.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
}
