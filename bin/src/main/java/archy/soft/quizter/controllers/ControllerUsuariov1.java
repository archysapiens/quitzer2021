package archy.soft.quizter.controllers;
  
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import archy.soft.quizter.model.Usuariov1;
import archy.soft.quizter.service.Usuariov1Service;

@RestController
@RequestMapping("/usuariov1")
public class ControllerUsuariov1 {
	private static Logger log = LoggerFactory.getLogger(ControllerTema.class);
	
	@Autowired
	Usuariov1Service service;
	
	@GetMapping("usuariov1/{id}")
	public Usuariov1 listarById(@PathVariable("id") Integer id) {
		Usuariov1 user = service.listarById(id);
		return user;
	}
	
	@GetMapping
	public List<Usuariov1> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Usuariov1 agregar(@RequestBody Usuariov1 u) {
		log.info("agregar {} --  {}",u.getId(), u.getNombre());
		return service.agregar(u);
	}
	
	@PutMapping Usuariov1 edit(@RequestBody Usuariov1 user) {
		return service.editar(user);
	}
	
	@DeleteMapping("usuariov1/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}
