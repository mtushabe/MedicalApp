package org.savics.challenge.dao;

import java.util.List;

import org.savics.challenge.models.Patient;
import org.springframework.data.repository.CrudRepository;

//Repository for patient CRUD operations
public interface PatientDao extends CrudRepository<Patient, Long> {

	List<Patient> findAll();
}
