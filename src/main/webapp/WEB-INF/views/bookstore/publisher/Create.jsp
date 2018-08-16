<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Publisher</title>
</head>
<body>
	<div id="content-body" align="center">
		<form method="post">
			<table>
				<tr>
					<td><label>Name:</label></td>
					<td><input type="text" id="name"></td>
				</tr>
				<tr>
					<td><label>Description:</label></td>
					<td><textarea rows="3" cols="22" id="description"></textarea>
				</tr>
				<tr>			
					<td><input type="submit" id="create"></td>
					<td><input type="reset"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>