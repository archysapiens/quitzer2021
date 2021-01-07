package archy.soft.quizter.service;

import java.util.List;

import archy.soft.quizter.model.Domicilio;

public interface DomicilioService {

	List<Domicilio> listar();
	Domicilio listarId(int id);
	Domicilio add(Domicilio p);
	Domicilio edit(Domicilio p);
	Domicilio delete(int id);
}
