package org.ticketson.view.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class UserForm extends ActionForm {

	private long id;
	private String login;
	private String password;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		
		ActionErrors errors = new ActionErrors();
		
		if (null == login || login.trim().length() < 1) {
			errors.add("login", new ActionMessage("error.validate.create.user.login.empty"));
		}	
		if (null == password || password.trim().length() < 1) {
			errors.add("password", new ActionMessage("error.validate.create.user.password.empty"));
		}
		
		return errors;
	}
}