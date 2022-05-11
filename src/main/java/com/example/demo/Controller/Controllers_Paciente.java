package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Paciente;
import com.example.demo.Service.Paciente_Service;

@RestController
@RequestMapping("/paciente")
public class Controllers_Paciente {
	
	@Autowired
	Paciente_Service pacienteService;
	
	@GetMapping
	public List<Paciente> listarPacientes(){
		return pacienteService.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Paciente buscarPaciente(@PathVariable Long id) {
		return pacienteService.findById(id);
	}
	
	@PostMapping
	public void crearPaciente(@RequestBody Paciente paciente) {
		pacienteService.crearPaciente(paciente);
	}
	
	@PutMapping("/{id}")
	public void editarPaciente(@PathVariable Long id, @RequestBody Paciente paciente) {
		pacienteService.editarPaciente(id, paciente);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarPaciente(@PathVariable Long id) {
		pacienteService.eliminarPaciente(id);
	}
	
}
