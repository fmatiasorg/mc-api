package pt.paginasamarelas.dataLayer.entities;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)

public class GeographicTarget {
	
	private PointRadius[] pointRadii;
	private PostalCodeRadius[] postalCodeRadii;
	private EngineGeoTarget[] engineGeoTarget;	
	
	public PointRadius[] getPointRadii() {
		return pointRadii;
	}
	public void setPointRadii(PointRadius[] pointRadii) {
		this.pointRadii = pointRadii;
	}
	public PostalCodeRadius[] getPostalCodeRadii() {
		return postalCodeRadii;
	}
	public void setPostalCodeRadii(PostalCodeRadius[] postalCodeRadii) {
		this.postalCodeRadii = postalCodeRadii;
	}
	public EngineGeoTarget[] getEngineGeoTarget() {
		return engineGeoTarget;
	}
	public void setEngineGeoTarget(EngineGeoTarget[] engineGeoTarget) {
		this.engineGeoTarget = engineGeoTarget;
	}
	
	
	
	
	

	
	
	
}
