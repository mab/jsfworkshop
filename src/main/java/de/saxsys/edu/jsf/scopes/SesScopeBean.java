package de.saxsys.edu.jsf.scopes;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean
@SessionScoped
public class SesScopeBean extends Dated {

	private static final long serialVersionUID = -2568171695419682216L;
	
	public void reset() {
		HttpSession session = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		session.invalidate();
	}

}
