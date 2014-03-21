package de.saxsys.edu.jsf.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.apache.commons.validator.routines.UrlValidator;


@FacesConverter("de.saxsys.URLConverter")
public class URLConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		String HTTP = "http://";
		StringBuilder url = new StringBuilder();
		
		if (!value.startsWith(HTTP)) {
			url.append(HTTP);
		}
		
		url.append(value);
		
		UrlValidator urlValidator = new UrlValidator();
		if (!urlValidator.isValid(url.toString())) {
			
		}
		
		URLBookmark bookmark = new URLBookmark(url.toString());
		return bookmark;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return value.toString();
	}

}
