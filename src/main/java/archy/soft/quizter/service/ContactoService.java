package archy.soft.quizter.service;

import java.util.List;

import archy.soft.quizter.model.Dcontacto;



public interface ContactoService {

	List<Dcontacto> listar();
	Dcontacto listarId(int id);
	Dcontacto add(Dcontacto p);
	Dcontacto edit(Dcontacto p);
	Dcontacto delete(int id);
}
