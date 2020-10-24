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

import com.iue.controlador.CorporationControllerr;
import com.iue.entidad.Corporationr;
import com.iue.entidad.Corporantionsr;
import com.iue.repositorio.CorporationRepositoryr;

@ExtendWith(MockitoExtension.class)
public class CorporationControllerUnitTests 
{ 
	@InjectMocks
	CorporationControllerr employeeController;
	
	@Mock
	CorporationRepositoryr employeeRepository;
	
	@Test
	public void testAddEmployee() 
	{
		
		// Given Algun Contexto de Variables
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		Corporationr employee = new Corporationr();
		employee.setId((long) 1);

		// When alguna Accion Requerida Entonces.... 
		when(employeeRepository.save(any(Corporationr.class))).thenReturn(employee);
		
		// Entonces Realizo la prueba si es verdadera
		Corporationr employeeToAdd = new Corporationr(0,"Lokesh", "Gupta", "howtodoinjava@gmail.com", null, null, 0);
		ResponseEntity<Object> responseEntity = employeeController.addEmployee(employeeToAdd);
		
		assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);
		assertThat(responseEntity.getHeaders().getLocation().getPath()).isEqualTo("/1");
	}
	
//	@Test
//	public void testFindAll() 
//	{
//		// given
//		Corporationr employee1 = new Corporationr(0,"Lokesh", "Gupta", "howtodoinjava@gmail.com", null, null, 0);
//		Corporationr employee2 = new Corporationr(1,"Alex", "Gussin", "example@gmail.com", null, null, 0);
//		List<Corporationr> list = new ArrayList<Corporationr>();
//		list.addAll(Arrays.asList(employee1, employee2));
//
//		when(employeeRepository.findAll()).thenReturn(list);
//
//		// when
//		Corporationr result = employeeController.getEmployees();
//
//		// then
//		assertThat(result.getEmployeeList().size()).isEqualTo(2);
//		
//		assertThat(result.getEmployeeList().get(0).getFirstName())
//						.isEqualTo(employee1.getFirstName());
//		
//		assertThat(result.getEmployeeList().get(1).getFirstName())
//						.isEqualTo(employee2.getFirstName());
//	}
}
