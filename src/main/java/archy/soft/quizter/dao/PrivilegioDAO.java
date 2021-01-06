package archy.soft.quizter.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.google.common.base.Optional;

import archy.soft.quizter.model.Privilegio;

public interface PrivilegioDAO extends CrudRepository<Privilegio, Integer>{

	List<Privilegio> findAll();
	Optional<Privilegio> findById(int id);
	@SuppressWarnings("unchecked")
	Privilegio save(Privilegio p);
	void delete(Privilegio p);
	Privilegio deleteById(int id);
}
