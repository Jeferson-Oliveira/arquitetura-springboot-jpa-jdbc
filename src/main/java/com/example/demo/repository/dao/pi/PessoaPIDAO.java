package com.example.demo.repository.dao.pi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.Pessoa;

@Component
public class PessoaPIDAO {

	private Long lastID = 0L;
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public PessoaPIDAO() {
		for(Integer i = 0; i < 10; i++) {
			pessoas.add(new Pessoa(i.longValue(), "Pessoa " + i, 20 + i));
			lastID++;
		}
	}
	
	public List<Pessoa> listarTodos() {
		return pessoas;
	}
	
	public Pessoa inserir(Pessoa p) {
		p.setId(lastID);
		pessoas.add(p);
		lastID++;
		return p;
	}
	
	public Pessoa alterar(Pessoa p) {
		return pessoas.set(pessoas.indexOf(p), p);
	}

	public Boolean existe(Long id) {
		Boolean existe = Boolean.FALSE;
		for(Pessoa p: pessoas) {
			if(p.getId().equals(id)) {
				existe = Boolean.TRUE;
				break;
			}
		}
		return existe;
	}

	public void excluir(Long id) {
		//
	}

}
