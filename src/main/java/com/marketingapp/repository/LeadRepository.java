package com.marketingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.marketingapp.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

	void save(int i);

	
		// TODO Auto-generated method stub
		
	}


