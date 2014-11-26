package de.saxsys.edu.jsf.dynamicform;

import java.io.Serializable;
import java.util.Date;

public class Data implements Serializable {

	private static final long serialVersionUID = 1507732314106713761L;
	
	private Date date;
	
	public Data() {
		this.date = new Date();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Data [date=" + date + "]";
	}
	
}
