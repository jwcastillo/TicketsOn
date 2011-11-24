package org.ticketson.controller;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.ticketson.model.dao.UserDao;
import org.ticketson.model.entity.User;
import org.ticketson.view.form.UserForm;

public class UserManagerImpl implements UserManager {
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void saveUser(UserForm userForm) {
		
		User user = new User();
		
		try {
			BeanUtils.copyProperties(user, userForm);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		userDao.saveUser(user);
	}
}