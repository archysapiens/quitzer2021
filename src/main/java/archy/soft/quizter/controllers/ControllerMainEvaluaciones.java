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

import archy.soft.quizter.model.Evaluaciones;
import archy.soft.quizter.service.EvaluacionesService;

@RestController
@RequestMapping("Evaluaciones")
 
public class ControllerMainEvaluaciones {
	private static Logger log = LoggerFactory.getLogger(ControllerMain.class);
	
	@Autowired
	EvaluacionesService service;
	
	@GetMapping
	public List<Evaluaciones> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Evaluaciones  agregar(@RequestBody Evaluaciones p) {
		log.info("agregar {} --  {}",p.getExamen(),p.getFecha_aplicacion(),p.getFecha_evaluacion(),p.getId(), p.getInciso(),p.getPreguntas(),p.getRespuesta(),p.getRespuestas());
		return service.add(p);
	} 
	
	@PutMapping
	public Evaluaciones edit(@RequestBody Evaluaciones p) {
		return service.edit(p);
	}
	
	@DeleteMapping("/delete")
	public Evaluaciones borrarId(@RequestBody int id) {
		
		return service.delete(id);
	}

	
}
