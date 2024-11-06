package com.sena.horizontes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.horizontes.entities.Municipio;
import java.util.List;
import org.springframework.stereotype.Repository;


@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Integer> {

    public List<Municipio> findByDepartamentoId(int departamentoId);

}
