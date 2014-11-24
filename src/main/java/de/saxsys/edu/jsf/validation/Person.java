package de.saxsys.edu.jsf.validation;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Person implements Serializable {

	private static final long serialVersionUID = -4884680103356520851L;

	@NotEmpty(message = "Pflichtfeld: Bitte Vorname angeben!")
	@Length(min = 2, message = "Pflichtfeld: Bitte Vorname mit mindestens 2 Zeichen angeben!")
	private String firstname;
	
	@NotEmpty(message = "Pflichtfeld: Bitte Vorname angeben!")
	@Length(min = 2)
	private String lastname;
	
	@NotNull
	@Past
	private Date birthday;
	
	private Gender gender;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getName() {
		return firstname + " " + lastname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
