package com.iue.controlador;

import java.net.URI;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.iue.entidad.Agenda;
import com.iue.entidad.Agenda;
import com.iue.repositorio.AgendaRepositorio;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path="/agendaAPI")
public class AgendaControlador {
			
	@Autowired
		    private AgendaRepositorio agendaRepositorio;

		    //***Api Final Front
		    @PostMapping(path= "/addagenda", consumes = "application/json", produces = "application/json")
			public Agenda addNewAgendaApi(@RequestBody Agenda agenda) {
		        //add resource
		     	agenda = agendaRepositorio.save(agenda);
				return agenda;
			}
		    
		    //***Api Final Para FRONT
		    @GetMapping(path= "/agendagetall", produces = "application/json")
		    public Agenda getAllAgendaApi() 
		    {
				Agenda response = new Agenda();
				ArrayList<Agenda> list = new ArrayList<>();
				agendaRepositorio.findAll().forEach(e -> list.add(e));
				response.setAgendaList(list);
		        return response;
		    }
		       
		    //***Api Final Front
		    @PostMapping(path= "/updateagenda", consumes = "application/json", produces = "application/json")
			public Agenda saveAgendaApi(@RequestBody Agenda agenda) {
		        //add resource
		     	agendaRepositorio.save(agenda);
				return agenda;
			}
		    //***Api Final Front
			@PostMapping(path = "/agendaremove", consumes = "application/json")
			public @ResponseBody ResponseEntity<String> deleteAgendaApi(@RequestBody Agenda agenda) {
				agendaRepositorio.deleteById(agenda.getId());
				return new ResponseEntity<String>(HttpStatus.OK);
			}
		    
		    
		    
		    
		    
			
			/* Otras Formas  pero Bajo jUnit Testing*/
			@GetMapping(path="/agenda", produces = "application/json")
		    public Agenda getAgenda() 
		    {
				Agenda response = new Agenda();
				ArrayList<Agenda> list = new ArrayList<>();
				agendaRepositorio.findAll().forEach(e -> list.add(e));
				response.setAgendaList(list);
		        return response;
		    }
		    
		    @PostMapping(path= "/agenda", consumes = "application/json", produces = "application/json")
		    public ResponseEntity<Object> addAgenda(@RequestBody Agenda agenda) {       
		                
		        //add resource
		    	agenda = agendaRepositorio.save(agenda);
		        
		        //Create resource location
		        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
		                                    .path("/{id}")
		                                    .buildAndExpand(agenda.getId())
		                                    .toUri();

		        //Send location in response
		        return ResponseEntity.created(location).build();
		    }
		   
		    
		    
			/* Otras Formas  pero sin jUnit Testing*/   

			@GetMapping(path = "/getallagenda")
			public @ResponseBody Iterable<Agenda> getAllAgenda() {
				return agendaRepositorio.findAll();
			}

			@GetMapping(path = "/addagenda")
			public @ResponseBody String addNewAgenda(@RequestParam String ls_mes, @RequestParam int ls_dia, @RequestParam int ls_año, @RequestParam int ls_hora) {
		       agendaRepositorio.save(new Agenda((long)0,ls_mes, ls_dia, ls_año, ls_hora));
				return "Saved";
			}

			@PostMapping(path = "/updatagenda")
			public @ResponseBody ResponseEntity<String> updateNewVehicle(@RequestBody Agenda agenda) {
				agendaRepositorio.save(agenda);
				return new ResponseEntity<String>(HttpStatus.OK);
			}

			@PostMapping(path = "/removeagenda")
			public @ResponseBody ResponseEntity<String> removeVehicle(@RequestBody Agenda agenda) {
				agendaRepositorio.delete(agenda);
				return new ResponseEntity<String>(HttpStatus.OK);
			}

			 @GetMapping(path = "/getagendabydocumento")
			public @ResponseBody Iterable<Agenda> getByMes(@RequestParam String mes) {
				return agendaRepositorio.findByMes(mes);
				
			 }

			@GetMapping(path = "/findByagendadocumentocontaining")
			public @ResponseBody Iterable<Agenda> findByMesContaining(@RequestParam String mes) {
				return agendaRepositorio.findByMesContaining(mes);

			} 
		    
		    
		    
		    
		    
		}

