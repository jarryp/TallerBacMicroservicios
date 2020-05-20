package net.baccredomatic.getagency.model.endpoint.rest;

public class AgencyDTO {
	
	private Agency agency;

	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}

	public AgencyDTO(Agency agency) {
		this.agency = agency;
	}
	
	

}
