package archy.soft.quizter.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.google.common.base.Optional;

import archy.soft.quizter.model.Rol;

public interface RolDAO extends CrudRepository<Rol, Integer>{

	List<Rol> findAll();
	Optional<Rol> findById(int id);
	@SuppressWarnings("unchecked")
	Rol save(Rol p);
	void delete(Rol p);
	Rol deleteById(int id);
}
