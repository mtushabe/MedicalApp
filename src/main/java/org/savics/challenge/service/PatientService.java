package org.savics.challenge.service;

import java.util.List;

import org.savics.challenge.models.Patient;

public interface PatientService {

	// Save patient to database
	void savePatient(Patient patient);

	// Return a list of all patients
	List<Patient> getPatients();

}
