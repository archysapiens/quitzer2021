package archy.soft.quizter.service;

import java.util.List;

import com.google.common.base.Optional;

import archy.soft.quizter.model.Privilegio;

public interface PrivilegioService {
	
	List<Privilegio> listar();
	Optional<Privilegio> listarId(int id);
	Privilegio add(Privilegio p);
	Privilegio edit(Privilegio p);
	Privilegio delete(Privilegio p);
	Privilegio deleteId(int id);

}
