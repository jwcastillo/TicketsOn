package org.ticketson.model.dao;

import org.ticketson.model.entity.User;

public interface UserDao {

	public User getUserByID(final long id);
}