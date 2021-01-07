package archy.soft.quizter.service;

import java.util.List;


import archy.soft.quizter.model.users;


public interface UsersService {

	List<users> listar();
	users listarId(int id);
	users add(users p);
	users edit(users p);
	void delete(int id);
}
