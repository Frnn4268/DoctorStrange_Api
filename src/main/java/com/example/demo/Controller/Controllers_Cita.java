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

import com.example.demo.Entities.Cita;
import com.example.demo.Service.Cita_Service;

@RestController
@RequestMapping("/cita")
public class Controllers_Cita {

	@Autowired
	Cita_Service citaService;
	
	@GetMapping
	public List<Cita> listarCitas(){
		return citaService.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Cita buscarCita(@PathVariable Long id) {
		return citaService.findById(id);
	}
	
	@PostMapping
	public void agendarCitas(@RequestBody Cita cita) {
		citaService.agendarCitas(cita);
	}
	
	@PutMapping("/{id}")
	public void estadoCitas(@PathVariable Long id, @RequestBody Cita cita) {
		citaService.estadoCitas(id, cita);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCitas(@PathVariable Long id) {
		citaService.eliminarCitas(id);
	}
	
}
