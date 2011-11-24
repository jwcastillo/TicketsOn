package org.ticketson.view.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.ticketson.controller.UserManager;
import org.ticketson.view.form.UserForm;

public class UserAction extends DispatchAction {
	
	private static final String SUCCESS = "success";
	private static final String ERROR = "error";
	
	private UserManager userManager;
	
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
		
	public ActionForward addUser (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		ActionErrors errors = form.validate(mapping, request);
		
		if (!errors.isEmpty()) {
			request.setAttribute(Globals.ERROR_KEY, errors);
			return mapping.findForward(ERROR);
		}	
		
		userManager.saveUser((UserForm)form);

		return mapping.findForward(SUCCESS);
	}
}