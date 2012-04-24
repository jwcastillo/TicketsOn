package org.ticketson.controller;

import java.util.List;

import org.ticketson.model.entity.News;
import org.ticketson.view.form.AddNewsForm;

public interface NewsManager {

	public List<News> getNews();
	public void addNews(AddNewsForm  addNewsForm);
}
