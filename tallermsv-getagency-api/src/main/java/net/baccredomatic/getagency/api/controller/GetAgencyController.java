package net.baccredomatic.getagency.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.baccredomatic.getagency.model.endpoint.rest.Agency;
import net.baccredomatic.getagency.service.GenericService;

@RestController
public class GetAgencyController {
	
	@Autowired
	private GenericService genericService;
	
	@GetMapping("/list/agencies")
	public List<Agency> getAllAgencies(){
		return genericService.getListAgencies();
	}

}
