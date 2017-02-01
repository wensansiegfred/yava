package com.ondoymatics.hms.app.repository;

import java.util.List;

import com.ondoymatics.hms.app.models.Patient;

public interface PatientRepository {
	List<Patient> getAllPatient();
	Patient getOneById(Long id);
	void save(Patient patient);
}
