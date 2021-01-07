package archy.soft.quizter.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import archy.soft.quizter.model.Dcontacto;


public interface ContactoDao extends CrudRepository<Dcontacto, Integer> {
	
	List<Dcontacto> findAll();
	Dcontacto findById(int  id);
	@SuppressWarnings("unchecked")
	Dcontacto save(Dcontacto p);
	void delete(Dcontacto p);

}
