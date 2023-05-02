package com.matriculas.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="carrera")
public class Carrera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idCarrera")
	private int codigo;
	
	@Column(name="nom_Carrera")
	private String nombre;
	
	@Column(name="ciclo")
	private String ciclo;
	
	@Column(name="creditos")
	private String credito;
	
	@ManyToOne
	@JoinColumn(name="codFacultad")
	private Facultad tbFacultad;
	
	@OneToMany(mappedBy = "tbCarrera")
	@JsonIgnore
	private List<Curso> curso;
	
	@OneToMany(mappedBy = "tbCarrera")
	@JsonIgnore
	private List<Inscripcion> inscripcion;
}
