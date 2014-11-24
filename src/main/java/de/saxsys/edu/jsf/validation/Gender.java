package de.saxsys.edu.jsf.validation;

public enum Gender {

	W("weiblich"),
	M("männlich");
	
	private String label;
	
	private Gender(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
		
}
