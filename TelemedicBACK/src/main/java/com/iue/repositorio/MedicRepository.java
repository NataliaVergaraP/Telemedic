package com.iue.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iue.entidad.Medic;
import java.util.List;

@Repository
public interface MedicRepository extends CrudRepository <Medic, Long> 
{

}
