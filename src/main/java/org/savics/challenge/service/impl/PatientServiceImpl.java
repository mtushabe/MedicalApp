package org.savics.challenge.service.impl;

import java.util.List;

import org.savics.challenge.dao.PatientDao;
import org.savics.challenge.models.Patient;
import org.savics.challenge.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDao patientDao;

	// Persist user into database
	@Override
	public void savePatient(Patient patient) {

		patientDao.save(patient);

	}

	@Override
	public List<Patient> getPatients() {

		return patientDao.findAll();
	}

}
