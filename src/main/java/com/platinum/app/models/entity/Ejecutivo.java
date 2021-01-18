package com.platinum.app.models.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


/**
 * The persistent class for the ejecutivo database table.
 * 
 */
@Entity
public class Ejecutivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEjecutivo;
	
	@NotEmpty
	private String departamento;

	@NotEmpty
	private String nombre;

	public Ejecutivo() {
	}

	public Integer getIdEjecutivo() {
		return this.idEjecutivo;
	}

	public void setIdEjecutivo(Integer idEjecutivo) {
		this.idEjecutivo = idEjecutivo;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Ejecutivo [idEjecutivo=" + idEjecutivo + ", departamento=" + departamento + ", nombre=" + nombre
				+ ", ctacorrientes=" + "" + "]";
	}


}