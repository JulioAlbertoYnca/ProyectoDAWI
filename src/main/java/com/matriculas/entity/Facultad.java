package com.matriculas.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="facultad")
public class Facultad {
	
	@Id
	@Column(name="codFacultad")
	private int codigo;
	
	@Column(name="nomFacultad")
	private String nombre;
	
	@OneToMany(mappedBy = "tbFacultad")
	@JsonIgnore
	private List<Carrera> carrera;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Carrera> getCarrera() {
		return carrera;
	}

	public void setCarrera(List<Carrera> carrera) {
		this.carrera = carrera;
	}
	
	
	
	
	
	
}
