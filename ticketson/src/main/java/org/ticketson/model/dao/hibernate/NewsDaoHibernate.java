package org.ticketson.model.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.ticketson.model.dao.NewsDao;
import org.ticketson.model.entity.News;

public class NewsDaoHibernate extends HibernateDaoSupport implements NewsDao {

	public List<News> getNews() {
		List news = getHibernateTemplate().find("from News");
		return news;
	}

	public void addNews(News news) {
		getHibernateTemplate().saveOrUpdate(news);
	}

}
