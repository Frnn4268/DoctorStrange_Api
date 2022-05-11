package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="poliza")
public class Poliza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_poliza;
	
	@Column(name="id_cliente")
	private Long id_cliente;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="fecha_inicio")
	private String fecha_Inicio;
	
	@Column(name="fecha_fin")
	private String fecha_Fin;

	public Long getId_poliza() {
		return id_poliza;
	}

	public void setId_poliza(Long id_poliza) {
		this.id_poliza = id_poliza;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFecha_Inicio() {
		return fecha_Inicio;
	}

	public void setFecha_Inicio(String fecha_Inicio) {
		this.fecha_Inicio = fecha_Inicio;
	}

	public String getFecha_Fin() {
		return fecha_Fin;
	}

	public void setFecha_Fin(String fecha_Fin) {
		this.fecha_Fin = fecha_Fin;
	}
	
}
