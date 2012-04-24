package org.ticketson.model.dao;

import java.util.List;

import org.ticketson.model.entity.News;

public interface NewsDao {
	
	public List<News> getNews();
	public void addNews(News news);

}
