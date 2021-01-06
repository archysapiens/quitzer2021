package archy.soft.quizter.service;

import java.util.List;

import com.google.common.base.Optional;

import archy.soft.quizter.model.Respuestas;

public interface RespuestaService {
	
	List<Respuestas> listar();
	Optional<Respuestas> listarId(int id);
	Respuestas add(Respuestas p);
	Respuestas edit(Respuestas p);
	Respuestas delete(Respuestas p);
	Respuestas deleteId(int id);

}
