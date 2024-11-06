package com.sena.horizontes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.horizontes.entities.Municipio;
import com.sena.horizontes.repository.MunicipioRepository;

@Service
public class MunicipioService {

	@Autowired
	private MunicipioRepository repository;

	public List<Municipio> listarMunicipiosPorDepartamento(int departamentoId) {
		return repository.findByDepartamentoId(departamentoId);
	}
}
