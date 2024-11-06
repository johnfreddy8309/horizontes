package com.sena.horizontes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.horizontes.entities.Departamento;
import com.sena.horizontes.repository.DepartamentoRepository;

@Service
public class DepartamentoService {
	
	@Autowired
	private DepartamentoRepository repository;
	
	public List<Departamento> listarTodosDepartamento() {
		return repository.findAll();
	}
}
