package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.model.Pessoa;
import com.example.demo.repository.dao.spring.PessoaSpringDAO;
import com.example.demo.util.Constantes;


@Qualifier(Constantes.AMBIENTE_REPOSTORY_SPRING)
@Component
public class PessoaRepositorySpring implements PessoaRepository {
	
	@Autowired
	private PessoaSpringDAO dao;

	@Override
	public List<Pessoa> listarTodos() {
		return dao.findAll();
	}

	@Override
	public Pessoa inserir(Pessoa p) {
		return dao.save(p);
	}

	@Override
	public Pessoa alterar(Pessoa p) {
		return dao.save(p);
	}

	@Override
	public Boolean existe(Long id) {
		return dao.existsById(id);
	}

	@Override
	public void excluir(Long id) {
		dao.deleteById(id);
	}
	 
}

