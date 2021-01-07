package archy.soft.quizter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import archy.soft.quizter.dao.EvaluacionesDao;
import archy.soft.quizter.model.Evaluaciones;

@Service
public class EvaluacionesServiceImp implements EvaluacionesService{

	@Autowired
	private EvaluacionesDao dao;
	
	@Override
	public List<Evaluaciones> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Evaluaciones listarId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public Evaluaciones add(Evaluaciones p) {
		// TODO Auto-generated method stub
		return  dao.save(p);
	}

	@Override
	public Evaluaciones edit(Evaluaciones p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Evaluaciones delete(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		return null;
	}

}
