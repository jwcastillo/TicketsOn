package org.ticketson.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.ticketson.model.dao.NewsDao;
import org.ticketson.model.entity.News;
import org.ticketson.view.form.AddNewsForm;

public class NewsManagerImpl implements NewsManager {

	private NewsDao newsDao;
	
	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}

	public List<News> getNews() {
		
		return newsDao.getNews();
	}

	public void addNews(AddNewsForm addNewsForm) {
		// TODO Auto-generated method stub
		News news = new News();
		
		try {
			BeanUtils.copyProperties(news, addNewsForm);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		newsDao.addNews(news);
		
	}

}
