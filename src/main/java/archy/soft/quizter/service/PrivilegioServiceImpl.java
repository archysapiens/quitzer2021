package archy.soft.quizter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;

import archy.soft.quizter.dao.PrivilegioDAO;
import archy.soft.quizter.model.Privilegio;

@Service
public class PrivilegioServiceImpl implements PrivilegioService{

	@Autowired
	PrivilegioDAO dao;
	@Override
	public List<Privilegio> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Optional<Privilegio> listarId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public Privilegio add(Privilegio p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Privilegio edit(Privilegio p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Privilegio delete(Privilegio p) {
		// TODO Auto-generated method stub
		dao.delete(p);
		return null;
	}

	@Override
	public Privilegio deleteId(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		return null;
	}
	
}
