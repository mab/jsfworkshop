package de.saxsys.edu.jsf.scopes;

import java.io.Serializable;
import java.util.Date;

abstract class Dated implements Serializable {

	private static final long serialVersionUID = 3289377954311978780L;

	private Date date = new Date();

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
