<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Add user</h1>
	<html:form action="/addUser.do">
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
				<td>
					<html:reset>
						<bean:message key="form.create.user.label.button.reset" />
					</html:reset>
				</td>
			</tr>
		</table>
		<html:hidden property="method" value="addUser" />
	</html:form>
</body>
</html>