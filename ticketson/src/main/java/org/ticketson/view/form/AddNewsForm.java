package org.ticketson.view.form;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class AddNewsForm extends ActionForm {

	
	private long id;
	private String subject;
	private String body;
	private String author;
	private Date date;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public ActionErrors validate (ActionMapping mapping, HttpServletRequest request)
	{
		ActionErrors errors = new ActionErrors();
		if(date == null)
		{
			String currentDate=(new java.text.SimpleDateFormat("yyyy-MM-dd")).format(java.util.Calendar.getInstance ().getTime());
			date = Date.valueOf(currentDate);
			System.out.println("DATE IS:" +date);
		}
		
		return errors;
	}

}
