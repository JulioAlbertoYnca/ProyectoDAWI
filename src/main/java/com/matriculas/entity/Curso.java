package com.matriculas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="curso")
public class Curso {

	@Id
	@Column(name="idcurso")
	private String codigo;
	
	@Column(name="nombreCurso")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="vacantes")
	private int vacantes;
	
	@ManyToOne
	@JoinColumn(name="idCarrera")
	private Carrera tbCarrera;
	
	@ManyToOne
	@JoinColumn(name="idDocente")
	private Docente tbDocente;
	
}
