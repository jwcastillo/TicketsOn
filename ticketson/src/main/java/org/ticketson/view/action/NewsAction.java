package org.ticketson.view.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.ticketson.controller.NewsManager;
import org.ticketson.model.entity.News;
import org.ticketson.view.form.AddNewsForm;

public class NewsAction extends DispatchAction {
	
	private static final String SUCCESS = "success";
	private static final String ERROR = "error";
	
	private NewsManager newsManager;
	
	
	public void setNewsManager(NewsManager newsManager) {
		this.newsManager = newsManager;
	}


	public ActionForward addNews(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		
		ActionErrors errors = form.validate(mapping, request);
		if(!errors.isEmpty())
		{
			request.setAttribute(Globals.ERROR_KEY, errors);
			return mapping.findForward(ERROR);
		}
		newsManager.addNews((AddNewsForm) form);
		return mapping.findForward(SUCCESS);
		
	}
	
	public ActionForward showNews(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response)
	{
		List<News> news = newsManager.getNews();
		if(news.isEmpty())
		{
			return mapping.findForward(ERROR);
		}
		request.setAttribute("News", news);
		return mapping.findForward(SUCCESS);
	}
}
