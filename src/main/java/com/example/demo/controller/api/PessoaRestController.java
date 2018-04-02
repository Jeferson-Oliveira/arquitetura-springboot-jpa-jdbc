package com.example.demo.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.BaseController;
import com.example.demo.model.Pessoa;
import com.example.demo.service.PessoaService;
import com.example.demo.util.ApiUrls;
import com.fasterxml.jackson.databind.ObjectWriter.GeneratorSettings;

@RestController
@RequestMapping(ApiUrls.PESSOA)
public class PessoaRestController extends BaseController {
	
	@Autowired
	private PessoaService service;
	
	@GetMapping
	public List<Pessoa> listar() {
		return getService().listarTodos();
	}
	
	@PostMapping
	public Pessoa inserir(@RequestBody Pessoa p) {
		return getService().inserir(p);
	}
	
	@PutMapping("{id}")
	public Pessoa alterar(@PathVariable Long id, @RequestBody Pessoa p) {
		if(getService().existe(id)) {
			return getService().alterar(p);
		}
		
		return new Pessoa();
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Long id) {
		if(getService().existe(id)) {
			getService().excluir(id);
		}
	}
	
	public PessoaService getService() {
		return service;
	}
	
	public void setService(PessoaService service) {
		this.service = service;
	}
}
