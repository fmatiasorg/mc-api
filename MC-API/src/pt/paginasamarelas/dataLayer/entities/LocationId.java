package pt.paginasamarelas.dataLayer.entities;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_DEFAULT)
public class LocationId {
	
	private int ripId;
	private String externalId;
	
	
	public int getRipId() {
		return ripId;
	}
	public void setRipId(int ripId) {
		this.ripId = ripId;
	}
	public String getExternalId() {
		return externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

}
