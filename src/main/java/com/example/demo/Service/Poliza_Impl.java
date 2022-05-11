package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.PolizasDAO;
import com.example.demo.Entities.Poliza;

@Service
public class Poliza_Impl implements Poliza_Service {
	
	@Autowired
	PolizasDAO polizaDao;
	
	@Override
	public List<Poliza> findAll() {
		return (List<Poliza>) polizaDao.findAll();
	}

	@Override
	public Poliza findById(Long id) {
		return polizaDao.findById(id).orElse(null);	
	}

	@Override
	public void crearPoliza(Poliza poliza) {
		polizaDao.save(poliza);
	}

	@Override
	public void editarPoliza(Long id, Poliza poliza) {
		if(polizaDao.existsById(id)) {
			poliza.setId_poliza(id);
			polizaDao.save(poliza);
		}
	}

	@Override
	public void eliminarPoliza(Long id) {
		if(polizaDao.existsById(id)) {
			polizaDao.deleteById(id);
		}	
	}
}
