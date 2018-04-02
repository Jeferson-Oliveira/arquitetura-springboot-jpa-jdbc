package com.example.demo.repository.dao.spring;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Pessoa;

public interface PessoaSpringDAO extends JpaRepository<Pessoa, Long> {}
