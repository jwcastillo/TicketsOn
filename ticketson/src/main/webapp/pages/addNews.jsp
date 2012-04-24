<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TicketsOn by ExtEdu team</title>
</head>
<body bgcolor="#C3D9FF" style="padding: 0; margin: 0; border: 0;">
<jsp:include page="/pages/menu.jsp"/>
	<h1>Add news</h1>
	<logic:notPresent name="SignInUser">
		<html:link action="/showLoginPage.do">
			<bean:message key="page.addNews.pleaseLogin" />
		</html:link>
	</logic:notPresent>
	<!-- bean:define id="author" name="SignInUser" scope="session" /-->
	
	<logic:present name="SignInUser">
	<html:form action="/addNews.do">
		<table>
			<tr>
				<td>Subject: </td>
				<td>
					<html:text property="subject"/>
					<span style="color: red;"><html:errors property="login" /></span>
				</td>
			</tr>
			<tr>
				<td>Body: </td>
				<td>
					<html:text property="body"/>
					<span style="color: red;"><html:errors property="password" /></span>
				</td>
			</tr>
			<tr>
				<td>author: </td>
				<td>
				
				<!-- html:text  name="author" readonly="true"/-->
				
				<input type="text" name="author" readonly="readonly" value="<bean:write name="SignInUser"/>" />

				</td>
			</tr>
			<tr>
				<td>
					<html:submit>
			             Add news
			        </html:submit>
			    </td>
				<td>
					<html:reset>
						Reset
					</html:reset>
				</td>
			</tr>
		</table>

		<html:hidden property="method" value="addNews" />
	</html:form>
	</logic:present>

<div align="center" style="background:rgba(249,247,237,0.4) ; width: 99.9%;height=1px;border: solid 1px #356AA0; position: absolute; bottom:0;">
&#169;<strong>ExtEdu Team</strong> 2011-2012
</div>
</body>
</html>