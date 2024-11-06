
package com.sena.horizontes.repository;

import com.sena.horizontes.entities.TipoIdentificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoIdentificacionRepository  extends JpaRepository<TipoIdentificacion, String> {
    
}
