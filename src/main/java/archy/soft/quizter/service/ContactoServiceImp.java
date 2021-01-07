package archy.soft.quizter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import archy.soft.quizter.dao.ContactoDao;
import archy.soft.quizter.model.Dcontacto;

@Service
public class ContactoServiceImp implements ContactoService {

	
	@Autowired
	private ContactoDao dao;
	
	
	@Override
	public List<Dcontacto> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Dcontacto listarId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public Dcontacto add(Dcontacto p) {
		// TODO Auto-generated method stub
		return  dao.save(p);
	}

	@Override
	public Dcontacto edit(Dcontacto p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Dcontacto delete(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		return null;
	}

}
