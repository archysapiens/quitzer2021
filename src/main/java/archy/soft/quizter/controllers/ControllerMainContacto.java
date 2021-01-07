package archy.soft.quizter.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import archy.soft.quizter.model.Dcontacto;
import archy.soft.quizter.service.ContactoService;

@RestController
@RequestMapping("/Dcontacto")

public class ControllerMainContacto {
	private static Logger log = LoggerFactory.getLogger(ControllerMain.class);

	@Autowired
	ContactoService service;
	
	@GetMapping
	public List<Dcontacto> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Dcontacto agregar(@RequestBody Dcontacto p) {
		log.info("agregar {} --  {}",p.getCat_contac(), p.getContacto(), p.getEstatus(), p.getFecha_actuali(), p.getId(),p.getUsers());
		return service.add(p);
	}
	
	@PutMapping
	public Dcontacto edit(@RequestBody Dcontacto p) {
		
		return service.edit(p);
		
	}
	
	@DeleteMapping("/delete")
	public Dcontacto borrarId(@RequestBody int id) {
		
		return service.delete(id);
	}
}
