package de.saxsys.edu.jsf.validation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class PersonBean implements Serializable {

	private static final long serialVersionUID = -3545522231789456975L;
	
	private List<Person> persons = new ArrayList<>();
	private Person person = new Person();

	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public void save() {
		persons.add(person);
		
		final FacesMessage fc = new FacesMessage();
		fc.setSummary("Saved!");
		fc.setDetail(person.getName() + " was saved successfully!");
		fc.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance().addMessage("test", fc);
		
		person = new Person();

	}
	
}
