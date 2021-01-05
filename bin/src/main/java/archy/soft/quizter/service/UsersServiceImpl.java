package archy.soft.quizter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import archy.soft.quizter.dao.UsersDAO;
import archy.soft.quizter.model.users;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDAO dao;

	
	@Override
	public List<users> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public users listarId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public users add(users p) {
		// TODO Auto-generated method stub
		return  dao.save(p);
	}

	@Override
	public users edit(users p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public users delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
