package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entities.Paciente;

public interface PacientesDAO extends CrudRepository<Paciente, Long>{

}
