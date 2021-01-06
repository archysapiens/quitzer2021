package archy.soft.quizter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Optional;

import archy.soft.quizter.model.Rol;
import archy.soft.quizter.service.RolService;

@RestController
@RequestMapping("/rol")
public class RolController {
	
	@Autowired
	RolService service;
	@GetMapping("/listar")
	public List<Rol> listar(){
		return service.listar();
	}
	
	@GetMapping("/listarId/{id}")
	public ResponseEntity<?> listarId(@PathVariable int id) {
		Optional<Rol> op = service.listarId(id);
		if(!op.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(op.get());
		
	}
	
	@PostMapping
	public Rol agregar(@RequestBody Rol p) {
		
		return service.add(p);
	}
	
	@PutMapping
	public Rol edit(@RequestBody Rol p) {
		
		return service.edit(p);
		
	}
	
	@DeleteMapping("/delete")
	public Rol borrar(@RequestBody Rol p) {
		
		return service.delete(p);
		
	}
	
	@DeleteMapping("/deleteId")
	public Rol borrarId(@RequestBody int id) {
		
		return service.deleteId(id);
	}

}
