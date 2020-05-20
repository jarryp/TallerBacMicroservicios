package net.baccredomatic.agency.api.controller;

import java.util.Collection;

import javax.servlet.ServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.baccredomatic.agency.model.Agency;
import net.baccredomatic.agency.service.AgencyService;

@RestController
@RequestMapping(value="/agency", produces = "application/json")
public class AgencyController {
	
	@Autowired private AgencyService service;
	@Autowired private ServletRequest servletRequest;
	
	@Value("${server.port}")
	private Integer port;
	
	@GetMapping("/saludo")
	public String saludo() {
		return "Hola desde Controlador!";
	}
	
	@GetMapping("/all")
	public Collection<Agency> getAll(){
		System.out.println("Se ejecuta en puerto: "+servletRequest.getLocalPort());
		return service.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Agency agency) {
		service.add(agency);
	}

}
