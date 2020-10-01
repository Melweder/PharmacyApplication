package com.melweder.pharmacyapp;

import com.melweder.pharmacyapp.repositories.PatientRepository;
import com.melweder.pharmacyapp.service.PatientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class PharmacyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharmacyAppApplication.class, args);
	}

	private final PatientService patientService;

	public PharmacyAppApplication(PatientService patientService){
		this.patientService = patientService;
	}

	@EventListener
	public void start(ApplicationReadyEvent event){
		patientService.initializePatients();
	}
}
