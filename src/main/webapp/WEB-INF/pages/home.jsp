<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>HOME PAGE</h1>

	<form:form modelAttribute="contact" action="scontact">
		<table>
			<tr>
				<td></td>
				<td><form:hidden path="contId" /></td>
			</tr>

			<tr>
				<td>Name:</td>
				<td><form:input path="contName" /></td>
			</tr>

			<tr>
				<td>EMAIL:</td>
				<td><form:input path="contEmail" /></td>
			</tr>

			<tr>
				<td>MOBILE:</td>
				<td><form:input path="contMobile" /></td>
			</tr>

			<tr>
				<td>GENDER:</td>
				<td><form:input path="gender" /></td>
			</tr>

			<tr>
				<td>ADDRESS:</td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="REGISTER"></td>
				<td><input type="reset" value="RESET"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>