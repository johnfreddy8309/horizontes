
package com.sena.horizontes.service;

import com.sena.horizontes.entities.TipoIdentificacion;
import com.sena.horizontes.repository.TipoIdentificacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoIdentificacionService {

	@Autowired
	private TipoIdentificacionRepository repository;

	public List<TipoIdentificacion> listarTodosIdentificacion() {
		return repository.findAll();
	}
}
