package archy.soft.quizter.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import archy.soft.quizter.model.users;

public interface UsersDAO extends CrudRepository<users, Integer>{

	List<users> findAll();
	users findById(int  id);
	@SuppressWarnings("unchecked")
	users save(users p);
	void delete(users p);
	
}
