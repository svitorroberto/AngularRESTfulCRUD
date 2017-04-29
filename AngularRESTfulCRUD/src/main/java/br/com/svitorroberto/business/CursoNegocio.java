package br.com.svitorroberto.business;

import java.util.Collection;

import br.com.svitorroberto.dao.CursoDao;
import br.com.svitorroberto.modelo.Curso;

public class CursoNegocio {
	
	public void salvar(Curso curso){
		CursoDao cursoDao = new CursoDao();
		cursoDao.salvarCurso(curso);
	}
	
	public Curso recuperarPorId(Curso curso){
		CursoDao cursoDao = new CursoDao();
		return cursoDao.getCursoById(curso.getId());
	}

	public Collection<Curso> recuperarTodos() {
		CursoDao cursoDao = new CursoDao();
		return cursoDao.getAll();
	}

}
