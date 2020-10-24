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

import com.iue.entidad.Medic;
import com.iue.entidad.Medics;
import com.iue.repositorio.MedicRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path="/medicAPI")
public class MedicController 
{
	@Autowired
    private MedicRepository medicRepository;

    //***Api Final Front
    @PostMapping(path= "/addmedic", consumes = "application/json", produces = "application/json")
	public Medic addNewEmployeeApi(@RequestBody Medic medic) {
        //add resource
    	medic = medicRepository.save(medic);
		return medic;
	}
    @PostMapping(path= "/medics", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Medic ca) {       
                
        //add resource
    	ca = medicRepository.save(ca);
        
        //Create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(ca.getId())
                                    .toUri();

        //Send location in response
        return ResponseEntity.created(location).build();
    }
    //***Api Final Para FRONT
    @GetMapping(path= "/medicgetall", produces = "application/json")
    
    public Medics getAllMedicsApi() 
    {
    	Medics response = new Medics();
		ArrayList<Medic> list = new ArrayList<>();
		medicRepository.findAll().forEach(e -> list.add(e));
		response.setMedicList(list);
        return response;
    }
    
    @GetMapping(path = "/getallmedic")
	public @ResponseBody Iterable<Medic> getAllMedic() {
		return medicRepository.findAll();
	}

	@PostMapping(path = "/updatemedic")
	public @ResponseBody ResponseEntity<String> updateNewMedic(@RequestBody Medic medic) {
		medicRepository.save(medic);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@PostMapping(path = "/removemedic")
	public @ResponseBody ResponseEntity<String> removeMedic(@RequestBody Medic medic) {
		medicRepository.delete(medic);
		return new ResponseEntity<String>(HttpStatus.OK);
	}


}
