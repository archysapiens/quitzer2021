package archy.soft.quizter.service;

import java.util.List;

import archy.soft.quizter.model.Evaluaciones;



public interface EvaluacionesService {

	
	List<Evaluaciones> listar();
	Evaluaciones listarId(int id);
	Evaluaciones add(Evaluaciones p);
	Evaluaciones edit(Evaluaciones p);
	Evaluaciones delete(int id);
}
