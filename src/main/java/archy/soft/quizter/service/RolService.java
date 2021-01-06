package archy.soft.quizter.service;

import java.util.List;

import com.google.common.base.Optional;

import archy.soft.quizter.model.Rol;

public interface RolService {

	List<Rol> listar();
	Optional<Rol> listarId(int id);
	Rol add(Rol p);
	Rol edit(Rol p);
	Rol delete(Rol p);
	Rol deleteId(int id);
}
