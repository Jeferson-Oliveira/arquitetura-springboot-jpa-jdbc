package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.model.Pessoa;

@Component
public interface PessoaRepository {
	public List<Pessoa> listarTodos();

	public Pessoa inserir(Pessoa p);

	public Pessoa alterar(Pessoa p);

	public Boolean existe(Long id);

	public void excluir(Long id);
}
