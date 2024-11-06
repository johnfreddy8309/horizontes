
package com.sena.horizontes.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo_identificacion")
public class TipoIdentificacion {
   
    @Id
    @Column(name = "id")
    private String id;
    
    @Column(name = "nombre")
    private String nombre;

    public TipoIdentificacion() {
    }

    public TipoIdentificacion(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
