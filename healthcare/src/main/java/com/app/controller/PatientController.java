package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.Patientdto;
import com.app.entities.Patients;
import com.app.service.PatientService;

@RestController
@RequestMapping("/Patients")
public class PatientController {
	@Autowired
	private PatientService patientService;
	
	public PatientController() {
		System.out.println("Started constructor patientCon");
	}
	@PostMapping
	public Patients registerPatient(@RequestBody Patients info) {
		System.out.println("in fn to add new patient");
		return patientService.registerPatient(info);
		
	}
	
	@GetMapping
	public List<Patientdto>  listAllPatient(){
		System.out.println("in listing all patients");
		return patientService.getAllPatients();
		
	}
	
	@PutMapping
	public Patients updatePatientDetails(@RequestBody Patients patient)
	{
		System.out.println("in update for patient "+patient);
		return patientService.updateCategoryDetails(patient);
	}
	
	
	@DeleteMapping
	public 
	
	
	
	
	

}
