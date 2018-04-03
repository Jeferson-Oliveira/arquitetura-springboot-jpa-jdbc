package com.example.demo.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.controller.BaseController;
import com.example.demo.model.Pessoa;
import com.example.demo.service.PessoaService;
import com.example.demo.util.WebUrls;

@Controller
@RequestMapping(WebUrls.PESSOA)
public class PessoaWebController extends BaseController {
	
	@Autowired
	private PessoaService service;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listarPessoas");
		modelAndView.addObject("pessoas",getService().listarTodos());
		modelAndView.addObject(new Pessoa());

		return modelAndView;
	}
	
	@PostMapping
	public String adicionar(Pessoa pessoa) {
		getService().inserir(pessoa);
		System.out.println("MERDA");
		return "redirect:" + WebUrls.PESSOA;
	}
	
	public PessoaService getService() {
		return service;
	}
	
	public void setService(PessoaService service) {
		this.service = service;
	}
	
}
