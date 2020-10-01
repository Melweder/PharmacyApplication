package com.melweder.pharmacyapp;

import com.melweder.pharmacyapp.entities.Patient;
import com.melweder.pharmacyapp.repositories.PatientRepository;
import org.junit.runner.RunWith;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PharmacyAppApplicationTests {

	@Autowired
	private PatientRepository patientRepository;

	@Before
	public void setUp(){
		patientRepository.save(new Patient("ul. Biebrzanska 47a/56", "Adolg", "Kitler",694306542,'M',null,null));
	}
	@After
	public void cleanDB(){
		patientRepository.deleteAll();
	}

	@Test
	public void contextLoads() {
		List<Patient> patient = patientRepository.findAll();
		System.out.println(patient.get(0).toString());
		assertEquals(1,patient.size());
	}

}
