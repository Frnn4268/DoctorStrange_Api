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

import com.example.demo.Entities.Poliza;
import com.example.demo.Service.Poliza_Service;

@RestController
@RequestMapping("/poliza")
public class Controllers_Poliza {

	@Autowired
	Poliza_Service polizaService;
	
	@GetMapping
	public List<Poliza> listarPolizas(){
		return polizaService.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Poliza buscarPoliza(@PathVariable Long id) {
		return polizaService.findById(id);
	}
	
	@PostMapping
	public void crearPoliza(@RequestBody Poliza poliza) {
		polizaService.crearPoliza(poliza);
	}
	
	@PutMapping("/{id}")
	public void editarPoliza(@PathVariable Long id, @RequestBody Poliza poliza) {
		polizaService.editarPoliza(id, poliza);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarPoliza(@PathVariable Long id) {
		polizaService.eliminarPoliza(id);
	}

}
