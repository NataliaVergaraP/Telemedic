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

import  com.iue.entidad.Corporationr;
import  com.iue.entidad.Corporantionsr;
import com.iue.repositorio.CorporationRepositoryr;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path="/CorporatioAPI")
public class CorporationControllerr 
{
	@Autowired
    private CorporationRepositoryr corporationRepository;

    //***Api Final Front
    @PostMapping(path= "/addcorporation", consumes = "application/json", produces = "application/json")
	public Corporationr addNewCorpApi(@RequestBody Corporationr corporationr) {
        //add resource
    	corporationr = corporationRepository.save(corporationr);
		return corporationr;
	}
    
    //***Api Final Para FRONT
	@GetMapping(path="/corps", produces = "application/json")
    public Corporantionsr getCorporations() 
    {
		Corporantionsr response = new Corporantionsr();
		ArrayList<Corporationr> list = new ArrayList<>();
		corporationRepository.findAll().forEach(e -> list.add(e));
		response.setMedicList(list);
        return response;
    }
    
    @PostMapping(path= "/employees", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Corporationr corp) {       
                
        //add resource
    	corp = corporationRepository.save(corp);
        
        //Create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(corp.getId())
                                    .toUri();

        //Send location in response
        return ResponseEntity.created(location).build();
    } 
    //***Api Final Front
    @PostMapping(path= "/updatecorporation", consumes = "application/json", produces = "application/json")
	public Corporationr saveCorpApi(@RequestBody Corporationr corporationr) {
        //add resource
     	corporationRepository.save(corporationr);
		return corporationr;
	}
    //***Api Final Front
	@PostMapping(path = "/corporationremove", consumes = "application/json")
	public @ResponseBody ResponseEntity<String> deleteCorpeApi(@RequestBody Corporationr corporationr) {
		corporationRepository.deleteById(corporationr.getId());
		return new ResponseEntity<String>(HttpStatus.OK);
	}
    
    
    
    
    
    
	/* Otras Formas  pero sin jUnit Testing*/   

	@GetMapping(path = "/getallcorp")
	public @ResponseBody Iterable<Corporationr> getAllEmployee() {
		return corporationRepository.findAll();
	}

	@GetMapping(path = "/addcorp")
	public @ResponseBody String addNewCorporation(@RequestParam String ls_firstName, @RequestParam String ls_lastName, @RequestParam String ls_email) {
       corporationRepository.save(new Corporationr((long)0,ls_firstName,ls_lastName,ls_email, ls_email, ls_email, 0));
		return "Saved";
	}

	@PostMapping(path = "/updatcorp")
	public @ResponseBody ResponseEntity<String> updateNewVehicle(@RequestBody Corporationr employe) {
		corporationRepository.save(employe);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@PostMapping(path = "/removecorp")
	public @ResponseBody ResponseEntity<String> removeVehicle(@RequestBody Corporationr employe) {
		corporationRepository.delete(employe);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
