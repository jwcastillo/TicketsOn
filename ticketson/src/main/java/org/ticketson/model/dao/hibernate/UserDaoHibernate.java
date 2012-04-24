package org.ticketson.model.dao.hibernate;

import java.util.List;

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

	public User getUserByLogin(String login) {
		List list = getHibernateTemplate().find("from User u where u.login = ?",login);
		return list.isEmpty()?null:(User) list.get(0);
	}
}