package org.ticketson.controller;

import org.ticketson.model.entity.User;
import org.ticketson.view.form.UserForm;

public interface UserManager {

	public void saveUser(UserForm userForm);
	public User getUserByLogin(String login);
}