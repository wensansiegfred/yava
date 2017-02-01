package com.ondoymatics.hms.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ondoymatics.hms.app.models.Patient;
import com.ondoymatics.hms.app.repository.PatientRepository;

@Service("patientService")
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;

	@Transactional
	public List<Patient> getAllPatient() {
		return patientRepository.getAllPatient();
	}

	@Transactional
	public Patient getPatientById(Long id) {
		return patientRepository.getOneById(id);
	}

	@Transactional
	public void registerPatient(Patient patient) {
		patientRepository.save(patient);
	}
}
