<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Publisher</title>
</head>
<body>
	<div id="content-body" align="center">
		<h1>Update Publisher</h1>
		<form:form action="updatePublisher" method="POST"
			commandName="publisher">
			<form:input type="hidden" id="publishID" path="publishID" />
			<table>
				<tr>
					<td><label>Name:</label></td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td><label>Description:</label></td>
					<td><form:textarea rows="3" cols="22" path="description" /></td>
				</tr>
				<tr>
					<td><input type="submit" id="update"></td>
					<td><input type="reset"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>