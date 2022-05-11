package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entities.Cita;

public interface Cita_Service {
	public List<Cita> findAll();
	public Cita findById(Long id);
	public void agendarCitas(Cita cita);
	public void estadoCitas(Long id, Cita cita);
	public void eliminarCitas(Long id);
}
