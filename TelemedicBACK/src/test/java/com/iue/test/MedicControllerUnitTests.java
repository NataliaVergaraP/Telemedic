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

import com.iue.controlador.MedicController;
import com.iue.entidad.Medic;
import com.iue.entidad.Medics;
import com.iue.repositorio.MedicRepository;

@ExtendWith(MockitoExtension.class)
public class MedicControllerUnitTests 
{ 
	@InjectMocks
	MedicController employeeController;
	
	@Mock
	MedicRepository employeeRepository;
	
	@Test
	public void testAddEmployee() 
	{
		
		// Given Algun Contexto de Variables
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		Medic employee = new Medic();
		employee.setId_paciente((int) 1);

		// When alguna Accion Requerida Entonces.... 
		when(employeeRepository.save(any(Medic.class))).thenReturn(employee);
		
		// Entonces Realizo la prueba si es verdadera
		Medic employeeToAdd = new Medic(1,2,"julian","sanchez","juliansan@outloo.com","carrera","pediatra","skype",301555040);
		ResponseEntity<Object> responseEntity = employeeController.addEmployee(employeeToAdd);
		
		assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);
		assertThat(responseEntity.getHeaders().getLocation().getPath()).isEqualTo("/1");
	}
	
	@Test
	public void testFindAll() 
	{
		// given
		Medic employee1 = new Medic(0,0, "Lokesh", "Gupta", "howtodoinjava@gmail.com", null, null, null, 0);
		Medic employee2 = new Medic(1,0, "Alex", "Gussin", "example@gmail.com", null, null, null, 0);
		List<Medic> list = new ArrayList<Medic>();
		list.addAll(Arrays.asList(employee1, employee2));

		when(employeeRepository.findAll()).thenReturn(list);

		// when
		Medics result = employeeController.getAllMedicsApi();

		// then
		assertThat(result.getMedicList().size()).isEqualTo(2);
		
		assertThat(result.getMedicList().get(0).getNombre())
						.isEqualTo(employee1.getNombre());
		
		assertThat(result.getMedicList().get(1).getNombre())
						.isEqualTo(employee2.getNombre());
	}
}
