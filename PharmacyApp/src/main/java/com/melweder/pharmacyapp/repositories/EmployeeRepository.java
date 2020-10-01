package com.melweder.pharmacyapp.repositories;

import com.melweder.pharmacyapp.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
