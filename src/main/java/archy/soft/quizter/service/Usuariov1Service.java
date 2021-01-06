package archy.soft.quizter.service;
  
import java.util.List;


import archy.soft.quizter.model.Usuariov1;

public interface Usuariov1Service {
	List<Usuariov1> listar();
	Usuariov1 listarById(int id);
	Usuariov1 agregar(Usuariov1 u);
	Usuariov1 editar(Usuariov1 u);
	void delete(int id);
}
