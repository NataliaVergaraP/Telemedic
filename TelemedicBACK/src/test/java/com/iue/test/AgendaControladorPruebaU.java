package com.iue.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.iue.controlador.AgendaControlador;
import com.iue.entidad.Agenda;
import com.iue.repositorio.AgendaRepositorio;

@ExtendWith(MockitoExtension.class)
public class AgendaControladorPruebaU
{ 
	@InjectMocks
	AgendaControlador agendaControlador;
	
	@Mock
	AgendaRepositorio agendaRepositorio;
	
	@Test
	public void testAddAgenda() 
	{
		
		// Given Algun Contexto de Variables
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		Agenda agenda = new Agenda();
		agenda.setId((long) 1);

		// When alguna Accion Requerida Entonces.... 
		when(agendaRepositorio.save(any(Agenda.class))).thenReturn(agenda);
		
		// Entonces Realizo la prueba si es verdadera
		Agenda agendaToAdd = new Agenda(0, "Octubre", 20, 2020, 12);
		ResponseEntity<Object> responseEntity = agendaControlador.addAgenda(agendaToAdd);
		
		assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);
		assertThat(responseEntity.getHeaders().getLocation().getPath()).isEqualTo("/1");
	}
	
	@Test
	public void testFindAll() 
	{
		// given
		Agenda agenda1 = new Agenda(0, "Octubre", 20, 2020, 12);
		Agenda agenda2 = new Agenda(1, "Octubre", 20, 2020, 1);
		List<Agenda> list = new ArrayList<Agenda>();
		list.addAll(Arrays.asList(agenda1, agenda2));

		when(agendaRepositorio.findAll()).thenReturn(list);

		// when
		Agenda result = agendaControlador.getAgenda();

		// then
		assertThat(result.getAgendaList().size()).isEqualTo(2);
		
		assertThat(((Agenda) result.getAgendaList().get(0)).getMes())
						.isEqualTo(agenda1.getMes());
		
		assertThat(((Agenda) result.getAgendaList().get(1)).getMes())
						.isEqualTo(agenda2.getMes());
	}
}

