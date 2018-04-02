package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pessoa;
import com.example.demo.repository.PessoaRepository;
import com.example.demo.repository.PessoaRepositorySpring;
import com.example.demo.util.Constantes;

@Service
public class PessoaService {
	
	@Autowired
	@Qualifier(Constantes.AMBIENTE_REPOSTORY_ATUAL)
	private PessoaRepository pessoaRepository;

	public List<Pessoa> listarTodos() {
		return pessoaRepository.listarTodos();
	}

	public Pessoa inserir(Pessoa p) {
		return pessoaRepository.inserir(p);
	}
	
	public Pessoa alterar(Pessoa p) {
		return pessoaRepository.alterar(p);
	}
	
	public Boolean existe(Long id) {
		return pessoaRepository.existe(id);
	}

	public void excluir(Long id) {
		pessoaRepository.excluir(id);
	}

}
