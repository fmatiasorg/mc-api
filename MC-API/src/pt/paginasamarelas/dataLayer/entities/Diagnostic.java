package pt.paginasamarelas.dataLayer.entities;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_DEFAULT)

public class Diagnostic {
	
	private String type;
	private String key;
	private String code;
	private String message;
	private String[] path;
	private String stacktrace;
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String[] getPath() {
		return path;
	}
	public void setPath(String[] path) {
		this.path = path;
	}
	public String getStacktrace() {
		return stacktrace;
	}
	public void setStacktrace(String pStacktrace) {
		this.stacktrace = pStacktrace;
	}
	

}
