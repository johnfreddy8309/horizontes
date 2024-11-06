
package com.sena.horizontes.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

	@Id
	@Column(name = "identificacion")
	private String identificacion;

	@Column(name = "tipo_identificacion_id")
	private String tipoIdentificacionId;

	@Column(name = "nombre_completo")
	private String nombreCompleto;

	@Column(name = "telefono")
	private int telefono;

	@Column(name = "celular")
	private int celular;

	@Column(name = "correo_electronico")
	private String correoElectronico;

	@Column(name = "contrasena")
	private String contrasena;

	@Column(name = "direccion")
	private String direccion;

	@Column(name = "departamento_id")
	private int departamentoId;

	@Column(name = "municipio_id")
	private int municipioId;
	
	@Column(name = "estado")
	private int estado;
	
	public Usuario() {
		
	}
	
	/**
	 * @param identificacion
	 * @param tipoIdentificacionId
	 * @param nombreCompleto
	 * @param telefono
	 * @param celular
	 * @param correoElectronico
	 * @param contrasena
	 * @param direccion
	 * @param departamentoId
	 * @param municipio
	 * @param estado
	 */
	public Usuario(String identificacion, String tipoIdentificacionId, 
			String nombreCompleto, int telefono, int celular,
			String correoElectronico, String contrasena, 
			String direccion, int departamentoId, int municipioId,
			int estado) {
		super();
		this.identificacion = identificacion;
		this.tipoIdentificacionId = tipoIdentificacionId;
		this.nombreCompleto = nombreCompleto;
		this.telefono = telefono;
		this.celular = celular;
		this.correoElectronico = correoElectronico;
		this.contrasena = contrasena;
		this.direccion = direccion;
		this.departamentoId = departamentoId;
		this.municipioId = municipioId;
		this.estado = estado;
	}

	/**
	 * @return the identificacion
	 */
	public String getIdentificacion() {
		return identificacion;
	}

	/**
	 * @param identificacion the identificacion to set
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	/**
	 * @return the tipoIdentificacionId
	 */
	public String getTipoIdentificacionId() {
		return tipoIdentificacionId;
	}

	/**
	 * @param tipoIdentificacionId the tipoIdentificacionId to set
	 */
	public void setTipoIdentificacionId(String tipoIdentificacionId) {
		this.tipoIdentificacionId = tipoIdentificacionId;
	}

	/**
	 * @return the nombreCompleto
	 */
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	/**
	 * @param nombreCompleto the nombreCompleto to set
	 */
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the celular
	 */
	public int getCelular() {
		return celular;
	}

	/**
	 * @param celular the celular to set
	 */
	public void setCelular(int celular) {
		this.celular = celular;
	}

	/**
	 * @return the correoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * @param correoElectronico the correoElectronico to set
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * @param contrasena the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the departamentoId
	 */
	public int getDepartamentoId() {
		return departamentoId;
	}

	/**
	 * @param departamentoId the departamentoId to set
	 */
	public void setDepartamentoId(int departamentoId) {
		this.departamentoId = departamentoId;
	}

	/**
	 * @return the municipio
	 */
	public int getMunicipioId() {
		return municipioId;
	}

	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipioId(int municipioId) {
		this.municipioId = municipioId;
	}

	/**
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}
}
