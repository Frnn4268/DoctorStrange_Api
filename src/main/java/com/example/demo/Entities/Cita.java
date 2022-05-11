package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cita")
public class Cita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Cita;
	
	@Column(name="fecha")
	private String fecha;
	
	@Column(name="hora")
	private String hora;
	
	@Column(name="idpoliza")
	private Long id_Poliza;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="observaciones")
	private String observaciones;

	public Long getId_Cita() {
		return id_Cita;
	}

	public void setId_Cita(Long id_Cita) {
		this.id_Cita = id_Cita;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Long getId_Poliza() {
		return id_Poliza;
	}

	public void setId_Poliza(Long id_Poliza) {
		this.id_Poliza = id_Poliza;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
