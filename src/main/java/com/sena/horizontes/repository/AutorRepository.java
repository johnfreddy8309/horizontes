package com.sena.horizontes.repository;


import com.sena.horizontes.entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, String> {
    
    
}
