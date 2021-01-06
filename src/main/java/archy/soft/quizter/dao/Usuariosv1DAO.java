package archy.soft.quizter.dao;
  
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import archy.soft.quizter.model.Usuariov1;

public interface Usuariosv1DAO  extends CrudRepository<Usuariov1, Integer>{
	List<Usuariov1> findAll();
	Usuariov1 findById(int id);
	@SuppressWarnings("unchecked")
	Usuariov1 save(Usuariov1 u);
	void delete(Usuariov1 u);

}
