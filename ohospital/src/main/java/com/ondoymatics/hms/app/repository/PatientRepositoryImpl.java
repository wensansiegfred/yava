package com.ondoymatics.hms.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.ondoymatics.hms.app.models.Patient;

@Repository("patientRepository")
public class PatientRepositoryImpl implements PatientRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	@SuppressWarnings("unchecked")
	public List<Patient> getAllPatient() {
		List<Patient> patients = em.createQuery("SELECT p FROM Patient p").getResultList();
		return patients;
	}

	@Override
	public Patient getOneById(Long id) {
		Patient patient = em.find(Patient.class, id);
		return patient;
	}

	@Override
	public void save(Patient patient) {
		em.persist(patient);
		em.flush();
	}
}
