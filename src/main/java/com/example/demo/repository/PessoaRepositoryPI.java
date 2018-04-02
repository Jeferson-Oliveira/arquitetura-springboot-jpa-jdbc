package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.model.Pessoa;
import com.example.demo.repository.dao.pi.PessoaPIDAO;
import com.example.demo.util.Constantes;

@Qualifier(Constantes.AMBIENTE_REPOSTORY_PI)
@Component
public class PessoaRepositoryPI implements PessoaRepository {

	@Autowired
	private PessoaPIDAO dao;
	
	@Override
	public List<Pessoa> listarTodos() {
		return dao.listarTodos();
	}

	@Override
	public Pessoa inserir(Pessoa p) {
		return dao.inserir(p);
	}

	@Override
	public Pessoa alterar(Pessoa p) {
		return dao.alterar(p);
	}

	@Override
	public Boolean existe(Long id) {
		return dao.existe(id);
	}

	@Override
	public void excluir(Long id) {
		dao.excluir(id);
	}

	
	
}
