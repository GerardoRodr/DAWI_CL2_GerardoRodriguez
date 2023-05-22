package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.model.Libro;

public interface ILibroRepository extends JpaRepository<Libro, Integer> {
}
