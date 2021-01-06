package archy.soft.quizter.service;
  
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import archy.soft.quizter.dao.Usuariosv1DAO;
import archy.soft.quizter.model.Usuariov1;

@Service
public class Usuariov1ServiceImpl implements Usuariov1Service{
	
	@Autowired
	private Usuariosv1DAO dao;

	@Override
	public List<Usuariov1> listar() {
		// TODO Auto-generated method stub
		List<Usuariov1> list = new ArrayList<>();
		dao.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public Usuariov1 listarById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public Usuariov1 agregar(Usuariov1 u) {
		// TODO Auto-generated method stub
		return dao.save(u);
	}

	@Override
	public Usuariov1 editar(Usuariov1 u) {
		// TODO Auto-generated method stub
		return dao.save(u);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dao.delete(listarById(id));
	}
}
