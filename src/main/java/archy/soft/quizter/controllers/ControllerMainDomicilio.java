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

import archy.soft.quizter.model.Domicilio;

import archy.soft.quizter.service.DomicilioService;



@RestController
@RequestMapping("/Domicilio")

public class ControllerMainDomicilio {

	
private static Logger log = LoggerFactory.getLogger(ControllerMain.class);
	
	@Autowired
	DomicilioService service;
	
	
	@GetMapping
	public List<Domicilio> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Domicilio agregar(@RequestBody Domicilio p) {
		
		log.info("agregar {} --  {}",p.getCalle(), p.getColonia(), p.getCp(), p.getEstado(), p.getEstatus(),p.getFecha_actualizacion(),p.getId(),p.getMpio(),p.getNumero(),p.getNumero_int(),p.getUsers());
		return service.add(p);
	}
	
	@PutMapping
	public Domicilio edit(@RequestBody Domicilio p) {
		return service.edit(p);
	}
	
	@DeleteMapping("/delete")
	public Domicilio borrarId(@RequestBody int id) {
		
		return service.delete(id);
	}
}
