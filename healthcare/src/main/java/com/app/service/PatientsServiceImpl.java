package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Patients;
import com.app.repository.PatientRepository;

@Service
@Transactional
public class PatientsServiceImpl implements PatientService {
	@Autowired
    private PatientRepository patientRepository;
	@Override
	public Patients registerPatient(Patients info) {
		// TODO Auto-generated method stub
		
		return patientRepository.save(info);
		
	}

}
