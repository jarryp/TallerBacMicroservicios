package net.baccredomatic.getagency.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.baccredomatic.getagency.model.endpoint.rest.Agency;
import net.baccredomatic.getagency.service.GenericService;

@Service
public class GenericServiceImpl implements GenericService {
	
	@Autowired private RestTemplate clienteRest;

	@Override
	public List<Agency> getListAgencies() {
		List<Agency> agencies;
		agencies = Arrays.asList(
					clienteRest.getForObject("http://tallermsv-agency-api/agency/all", Agency[].class)
				);
		
		return agencies.stream().map(a -> new Agency(a.getId(), 
				                                     a.getNameAgency(), 
				                                     a.getAddress(),
				                                     a.getPhoneNumber())).collect(Collectors.toList()); 
	}
	
}
