package archy.soft.quizter.controllers;

  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import archy.soft.quizter.model.Tema;
import archy.soft.quizter.service.TemaService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/tema")
public class ControllerTema {
	private static Logger log = LoggerFactory.getLogger(ControllerTema.class);
	
	@Autowired
	TemaService service;
	
	@GetMapping("tema/{id}")
	public Tema  listarById(@PathVariable("id") Integer id) {
		Tema tem = service.listarById(id);
		return tem;
	}
	
	@GetMapping
	public List<Tema> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Tema agregar(@RequestBody Tema t) {
		
		log.info("agregar {} --  {}",t.getId(), t.getTema());
		
		return service.agregar(t);
		
	}
	
	@PutMapping
	public Tema editar(@RequestBody Tema tem) {
		return service.editar(tem);
	}
	
	@DeleteMapping("tema/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}
