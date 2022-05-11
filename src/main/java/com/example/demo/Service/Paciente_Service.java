package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entities.Paciente;

public interface Paciente_Service {
	public List<Paciente> findAll();
	public Paciente findById(Long id);
	public void crearPaciente(Paciente paciente);
	public void editarPaciente(Long id, Paciente paciente);
	public void eliminarPaciente(Long id);
}
