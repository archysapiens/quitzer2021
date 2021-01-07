package archy.soft.quizter.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import archy.soft.quizter.model.Domicilio;



public interface DomicilioDao extends CrudRepository<Domicilio, Integer>{
	
	List<Domicilio> findAll();
	Domicilio findById(int  id);
	@SuppressWarnings("unchecked")
	Domicilio save(Domicilio p);
	void delete(Domicilio p);

}
