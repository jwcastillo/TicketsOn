package org.ticketson.model.dao.hibernate;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.ticketson.model.dao.UserDao;
import org.ticketson.model.entity.User;

public class UserDaoHibernate extends HibernateDaoSupport implements UserDao {

	public User getUserByID(final long id) {
		return (User)getHibernateTemplate().get(User.class, id);
	}
	
	public void saveUser(final User user) {
		getHibernateTemplate().saveOrUpdate(user);
	}
}