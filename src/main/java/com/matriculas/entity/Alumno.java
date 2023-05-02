package com.matriculas.entity;

import java.time.LocalDate;
import java.util.List;

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
@Table(name ="alumno")
public class Alumno {

	@Id
	@Column(name = "DNI")
	private String dni;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "fecha_nac")
	private LocalDate fecNac;
	@Column(name = "correo")
	private String correo;
	@Column(name = "direccion")
	private String direccion;
	
	//Relacion muchos a uno
	@ManyToOne
	@JoinColumn(name = "cod_Distrito")
	private Distrito tbDistrito;
	
	@ManyToOne
	@JoinColumn(name = "cod_Pais")
	private Pais tbPais;
	
	@OneToMany(mappedBy = "tbAlumno")
	private List<Inscripcion> inscripcion;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFecNac() {
		return fecNac;
	}

	public void setFecNac(LocalDate fecNac) {
		this.fecNac = fecNac;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Distrito getTbDistrito() {
		return tbDistrito;
	}

	public void setTbDistrito(Distrito tbDistrito) {
		this.tbDistrito = tbDistrito;
	}

	public Pais getTbPais() {
		return tbPais;
	}

	public void setTbPais(Pais tbPais) {
		this.tbPais = tbPais;
	}

	

	
	
	
	
}
