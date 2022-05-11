package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.CitasDAO;
import com.example.demo.Entities.Cita;

@Service
public class Cita_Impl implements Cita_Service{

	@Autowired
	CitasDAO citasDao;

	@Override
	public List<Cita> findAll() {
		return (List<Cita>) citasDao.findAll();
	}

	@Override
	public Cita findById(Long id) {
		return citasDao.findById(id).orElse(null);
	}

	@Override
	public void agendarCitas(Cita cita) {
		citasDao.save(cita);
	}

	@Override
	public void estadoCitas(Long id, Cita cita) {
		if(citasDao.existsById(id)) {
			cita.setId_Cita(id);
			citasDao.save(cita);
		} 	
	}

	@Override
	public void eliminarCitas(Long id) {
		if(citasDao.existsById(id)) {
			citasDao.deleteById(id);
		}
	}
}
