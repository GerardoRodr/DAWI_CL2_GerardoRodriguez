package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cibertec.model.Libro;
import com.cibertec.model.LibroTema;
import com.cibertec.repository.ILibroTemaRepository;
import com.cibertec.repository.ITemaRepository;

import jakarta.transaction.Transactional;

@Controller
public class LibroController {

	@Autowired
	private ITemaRepository temaRepo;
	
	@Autowired
	private ILibroTemaRepository libtemrepo;
	
	//PROCEDIMIENTO ALMACENADO QUE AUTOMATICAMENTE REEMPLAZA EL ID DEL TEMA POR EL NOMBRE
	@GetMapping("/")
	@Transactional
	public String listadoLibros (Model m) {
		List<LibroTema> rs = libtemrepo.sp_getLibros();
		m.addAttribute("lstLibros", rs);
		return "index";
	}
	
	@GetMapping("/registrarLibro")
	public String registrarLibro (Model m) {
		m.addAttribute("tema", temaRepo.findAll());
		m.addAttribute("libro", new Libro());
		return "registrarLibro";
	}
}