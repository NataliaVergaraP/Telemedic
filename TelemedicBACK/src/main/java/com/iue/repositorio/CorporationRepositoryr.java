package com.iue.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iue.entidad.Corporationr;

import java.util.List;

@Repository
public interface CorporationRepositoryr extends CrudRepository <Corporationr, Long> 
{

}
