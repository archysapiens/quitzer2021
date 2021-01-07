package archy.soft.quizter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import archy.soft.quizter.dao.DomicilioDao;
import archy.soft.quizter.model.Domicilio;

@Service
public class DomicilioServiceImp implements DomicilioService{

	@Autowired
	private DomicilioDao dao;
	
	@Override
	public List<Domicilio> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Domicilio listarId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public Domicilio add(Domicilio p) {
		// TODO Auto-generated method stub
		return  dao.save(p);
	}

	@Override
	public Domicilio edit(Domicilio p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Domicilio delete(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		return null;
	}

}
