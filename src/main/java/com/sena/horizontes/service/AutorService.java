package com.sena.horizontes.service;


import com.sena.horizontes.entities.Autor;
import com.sena.horizontes.repository.AutorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    
    @Autowired
    private AutorRepository repository;
    
    public List<Autor> listarTodosAutores() {
        return repository.findAll();
        
    }
    
}
