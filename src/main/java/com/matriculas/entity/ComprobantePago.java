package com.matriculas.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="comprobante_pago")
public class ComprobantePago {

	@Id
	@Column(name="idComPago")
	private String codigo;
	
	@Column(name="fecha_com")
	private LocalDate fechaComprobante;
	
	@Column(name="monto")
	private double monto;
	
	@Column(name="Estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="idInscripcion")
	private Inscripcion tbInscripcion;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDate getFechaComprobante() {
		return fechaComprobante;
	}

	public void setFechaComprobante(LocalDate fechaComprobante) {
		this.fechaComprobante = fechaComprobante;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Inscripcion getTbInscripcion() {
		return tbInscripcion;
	}

	public void setTbInscripcion(Inscripcion tbInscripcion) {
		this.tbInscripcion = tbInscripcion;
	}
	
	
	
	
	
}
