package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paciente")
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="primer_nombre")
	private String primer_Nombre;
	
	@Column(name="segundo_nombre")
	private String segundo_Nombre;
	
	@Column(name="primer_apellido")
	private String primer_Apellido;
	
	@Column(name="segundo_apellido")
	private String segundo_Apellido;
	
	@Column(name="edad")
	private int edad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrimer_Nombre() {
		return primer_Nombre;
	}

	public void setPrimer_Nombre(String primer_Nombre) {
		this.primer_Nombre = primer_Nombre;
	}

	public String getSegundo_Nombre() {
		return segundo_Nombre;
	}

	public void setSegundo_Nombre(String segundo_Nombre) {
		this.segundo_Nombre = segundo_Nombre;
	}

	public String getPrimer_Apellido() {
		return primer_Apellido;
	}

	public void setPrimer_Apellido(String primer_Apellido) {
		this.primer_Apellido = primer_Apellido;
	}

	public String getSegundo_Apellido() {
		return segundo_Apellido;
	}

	public void setSegundo_Apellido(String segundo_Apellido) {
		this.segundo_Apellido = segundo_Apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
