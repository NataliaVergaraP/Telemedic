package com.iue.repositorio;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.iue.entidad.Pacientes;

@Repository
public interface PacientesRepositorio extends CrudRepository <Pacientes, Long>
{

		List<Pacientes> findByDocumento(int documento);	
		List<Pacientes> findByDocumentoContaining(int documento);
	
}
