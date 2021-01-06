package archy.soft.quizter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;

import archy.soft.quizter.dao.RespuestaDAO;
import archy.soft.quizter.model.Respuestas;

@Service
public class RespuestaServiceImpl implements RespuestaService{

	@Autowired
	RespuestaDAO dao;
	@Override
	public List<Respuestas> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Optional<Respuestas> listarId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public Respuestas add(Respuestas p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Respuestas edit(Respuestas p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Respuestas delete(Respuestas p) {
		// TODO Auto-generated method stub
		dao.delete(p);
		return null;
	}

	@Override
	public Respuestas deleteId(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		return null;
	}

}
