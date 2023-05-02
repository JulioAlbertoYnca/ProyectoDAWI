package com.matriculas.entity;

import java.time.LocalDate;
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
@Table(name="inscripcion")
public class Inscripcion {
	
	@Id
	@Column(name="idInscripcion")
	private String codigo_Ins;
	
	@Column(name="fec_Inscripcion")
	private LocalDate fechaInscripcion;
	
	@Column(name="estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="DNI")
	private Alumno tbAlumno;
	@ManyToOne
	@JoinColumn(name="id_Carrera")
	private Carrera tbCarrera;
	
	@OneToMany(mappedBy = "tbInscripcion")
	@JsonIgnore
	private List<ComprobantePago> comprobantePago;
	
	
	
	

}
