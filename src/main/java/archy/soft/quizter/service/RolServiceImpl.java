package archy.soft.quizter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;

import archy.soft.quizter.dao.RolDAO;
import archy.soft.quizter.model.Rol;


@Service
public class RolServiceImpl implements RolService{

	@Autowired
	RolDAO dao;
	@Override
	public List<Rol> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Optional<Rol> listarId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public Rol add(Rol p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Rol edit(Rol p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Rol delete(Rol p) {
		// TODO Auto-generated method stub
		dao.delete(p);
		return null;
	}

	@Override
	public Rol deleteId(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		return null;
	}

}
