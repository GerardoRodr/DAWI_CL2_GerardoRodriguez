package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.model.Tema;

public interface ITemaRepository extends JpaRepository<Tema, Integer> {
	
}
