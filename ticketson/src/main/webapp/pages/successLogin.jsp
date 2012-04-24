<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TicketsOn by ExtEdu team</title>
</head>
<body bgcolor="#C3D9FF" style="padding: 0; margin: 0; border: 0;">
<jsp:include page="/pages/menu.jsp"/>
	SUCCESS! =) <br/>
	You logged as: &nbsp;
	<bean:write name="SignInUser" />, your role is: &nbsp;
	<bean:write name="UserRole" />
	
<div align="center" style="background:rgba(249,247,237,0.4) ; width: 99.9%;height=1px;border: solid 1px #356AA0; position: absolute; bottom:0;">
&#169;<strong>ExtEdu Team</strong> 2011-2012
</div>
</body>
</html>