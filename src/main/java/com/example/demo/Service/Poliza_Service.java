package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entities.Poliza;

public interface Poliza_Service {
	public List<Poliza> findAll();
	public Poliza findById(Long id);
	public void crearPoliza(Poliza poliza);
	public void editarPoliza(Long id, Poliza poliza);
	public void eliminarPoliza(Long id);
}
