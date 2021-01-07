package archy.soft.quizter.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import archy.soft.quizter.model.Evaluaciones;

public interface EvaluacionesDao extends CrudRepository<Evaluaciones, Integer> {
	
	List<Evaluaciones> findAll();
	Evaluaciones findById(int  id);
	@SuppressWarnings("unchecked")
	Evaluaciones save(Evaluaciones p);
	void delete(Evaluaciones p);

}
