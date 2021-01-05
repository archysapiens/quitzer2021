package archy.soft.quizter.dao;
  
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import archy.soft.quizter.model.Tema;

public interface TemaDAO extends CrudRepository<Tema , Integer>{
	List<Tema> findAll();
	Tema findById(int  id);
	@SuppressWarnings("unchecked")
	Tema save(Tema u);
	void delete(Tema u);
	
}
