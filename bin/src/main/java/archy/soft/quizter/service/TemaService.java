package archy.soft.quizter.service;
  
import java.util.List;

import archy.soft.quizter.model.Tema;

public interface TemaService {
	
	List<Tema> listar();
	Tema listarById(int id);
	Tema agregar(Tema t);
	Tema editar(Tema t);
	void delete(int id);

}
