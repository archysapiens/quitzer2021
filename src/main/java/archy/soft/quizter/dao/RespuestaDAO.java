package archy.soft.quizter.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.google.common.base.Optional;

import archy.soft.quizter.model.Respuestas;

public interface RespuestaDAO extends CrudRepository<Respuestas, Integer>{
	List<Respuestas> findAll();
	Optional<Respuestas> findById(int id);
	@SuppressWarnings("unchecked")
	Respuestas save(Respuestas p);
	void delete(Respuestas p);
	Respuestas deleteById(int id);

}
