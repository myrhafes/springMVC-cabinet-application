package com.mvc.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{
	public Page<Patient> findByNameContains(String mc,Pageable pageable);
}
