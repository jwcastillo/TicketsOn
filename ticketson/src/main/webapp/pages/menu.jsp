<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div align="center" style="background:rgba(249,247,237,0.4) ; width: 99.9%;height=1px;border: solid 1px #356AA0;">
<html:link action="/homePage.do">
		<bean:message key="page.menu.link.home" />
</html:link> &nbsp;|&nbsp; 

<html:link action="/addUserPage.do">
		<bean:message key="page.menu.link.addUser" />
</html:link> &nbsp;|&nbsp; 

<logic:present name="SignInUser">
	<bean:message key="page.menu.youLoggedIn" /> &nbsp; 
	<b><bean:write name="SignInUser" /></b> 
	<html:link action="/logout.do?method=logout">
		(	<bean:message key="page.menu.link.logout" />)
	</html:link>&nbsp;|&nbsp; 
</logic:present>

<logic:notPresent name="SignInUser">
	<html:link action="/showLoginPage.do">
			<bean:message key="page.menu.link.login" />
	</html:link> &nbsp;|&nbsp; 
</logic:notPresent>

 <html:link action="/showAddNews.do">
		<bean:message key="page.menu.link.showAddNews" />
</html:link> &nbsp;|&nbsp; 

<html:link action="/showNews.do?method=showNews">
		<bean:message key="page.menu.link.showNews" />
</html:link>
</div>