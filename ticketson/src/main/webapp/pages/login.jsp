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
	<h1>Login</h1>
	<html:form action="/login.do">
		<span style="color: red;"><html:errors property="loginError" /></span>
		<table>
			<tr>
				<td><bean:message key="form.create.user.label.name" />: </td>
				<td>
					<html:text property="login" maxlength="50"/>
					<span style="color: red;"><html:errors property="login" /></span>
				</td>
			</tr>
			<tr>
				<td><bean:message key="form.create.user.label.password" />: </td>
				<td>
					<html:password property="password" maxlength="50"/>
					<span style="color: red;"><html:errors property="password" /></span>
				</td>
			</tr>
		
			<tr>
				<td>
					<html:submit>
			             <bean:message key="form.create.user.label.button.submit" />
			        </html:submit>
			    </td>
			</tr>
		</table>
		<html:hidden property="method" value="login" />
	</html:form>
<div align="center" style="background:rgba(249,247,237,0.4) ; width: 99.9%;height=1px;border: solid 1px #356AA0; position: absolute; bottom:0;">
&#169;<strong>ExtEdu Team</strong> 2011-2012
</div>
</body>
</html>