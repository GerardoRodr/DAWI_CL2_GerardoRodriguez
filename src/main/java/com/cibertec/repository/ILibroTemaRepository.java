package com.cibertec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import com.cibertec.model.LibroTema;

public interface ILibroTemaRepository extends JpaRepository<LibroTema, Integer> {
	@Procedure(name = "sp_getLibros")
	List<LibroTema> sp_getLibros();
}
