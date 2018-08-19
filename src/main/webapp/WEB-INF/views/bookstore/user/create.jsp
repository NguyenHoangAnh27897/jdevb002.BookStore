<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register User</title>
</head>
<body>
	<div id="content-body" align="center">
		<h1><label><b>Register User</b></label></h1>
		<div id="content">
			<form id="frmRegister" action="user-save" method="POST">
				<table>
					<tr>
						<td><label>Username : </label></td>
						<td><input type="text" id="userName" name="userName"/></td>
					</tr>
					<tr>
						<td><label>Password : </label></td>
						<td><input type="password" id="password" name="password"/></td>
					</tr>
					<tr>
						<td><label>Full Name : </label></td>
						<td><input type="text" id="fullName" name="fullName"/></td>
					</tr>
					<tr>
						<td><button type="submit" id="save">Save</button></td>
						<td><button type="reset" id="reset">Reset Form</button></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>