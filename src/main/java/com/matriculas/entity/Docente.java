package com.matriculas.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="docente")
public class Docente {
	
	@Id
	@Column(name="idDocente")
	private int codigo;
	
	@Column(name="nombreDocente")
	private String nombre;
	
	@Column(name="apellidoDocente")
	private String apellido;
	
	@Column(name="dni")
	private String dni;
	
	@Column(name="estadoCivil")
	private String estado;
	
	@Column(name="genero")
	private String genero;
	
	@OneToMany(mappedBy = "tbDocente")
	private List<Curso> ListAlumno;
	

}
