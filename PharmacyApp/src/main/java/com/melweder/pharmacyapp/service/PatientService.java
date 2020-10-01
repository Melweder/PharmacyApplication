package com.melweder.pharmacyapp.service;

import com.melweder.pharmacyapp.entities.Patient;
import com.melweder.pharmacyapp.repositories.PatientRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }
    public void initializePatients(){
        Patient patient = new Patient();
        patient.setName("Lukasz");
        patient.setSurname("Wach");
        patient.setSex('M');
        patient.setAddress("Kolska");
        patient.setPhoneNumber(63);
        patientRepository.save(patient);
    }
}
