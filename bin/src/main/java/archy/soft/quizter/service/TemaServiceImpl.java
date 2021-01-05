package archy.soft.quizter.service;
  
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import archy.soft.quizter.dao.TemaDAO;
import archy.soft.quizter.model.Tema;

@Service
public class TemaServiceImpl implements TemaService{
	
	@Autowired
	private TemaDAO dao;

	@Override
	public List<Tema> listar() {
		// TODO Auto-generated method stub
		List<Tema> list = new ArrayList<>();
		dao.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public Tema listarById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public Tema agregar(Tema t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public Tema editar(Tema t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dao.delete(listarById(id));
	}




	
}
