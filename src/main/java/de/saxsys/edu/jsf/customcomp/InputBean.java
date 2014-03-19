package de.saxsys.edu.jsf.customcomp;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;

/**
 * A sample bean communicating to a view using a custom component.
 * 
 * @author matthias.baumgart
 *
 */
@ManagedBean
public class InputBean implements Serializable {

	private static final long serialVersionUID = -768590778253159128L;

	private String name;
	
	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public String save() {
		return null;
	}
	
	public String getValue() {
		return String.format("%s wurde am %s geboren.", name, date);
	}
	
	
}
