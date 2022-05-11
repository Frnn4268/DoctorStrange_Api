package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.PacientesDAO;
import com.example.demo.Entities.Paciente;

@Service
public class Paciente_Impl implements Paciente_Service {

	@Autowired
	PacientesDAO pacienteDao;
	
	@Override
	public List<Paciente> findAll() {
		return (List<Paciente>) pacienteDao.findAll();
	}

	@Override
	public Paciente findById(Long id) {	
		return pacienteDao.findById(id).orElse(null);	
	}

	@Override
	public void crearPaciente(Paciente paciente) {
		pacienteDao.save(paciente);
	}

	@Override
	public void editarPaciente(Long id, Paciente paciente) {
		if(pacienteDao.existsById(id)) {
			paciente.setId(id);
			pacienteDao.save(paciente);
		} 	
	}

	@Override
	public void eliminarPaciente(Long id) {
		if(pacienteDao.existsById(id)) {
			pacienteDao.deleteById(id);
		}	
	}
}
