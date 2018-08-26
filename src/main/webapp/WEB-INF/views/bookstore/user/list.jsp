<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User List</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid content">
		<div class="row content">

			<div class="col-sm-10 ">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>User ID</th>
							<th>Username</th>
							<th>Password</th>
							<th>Fullname</th>
							<th>Role</th>
							<th>Created UserId</th>
							<th>Created Date</th>
							<th></th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:if test="${!empty listUser}">
							<c:forEach items="${listUser}" var="user">
								<tr>
									<td>${user.id}</td>
									<td>${user.userName}</td>
									<td>${user.password}</td>
									<td>${user.fullName}</td>
									<td>${user.role}</td>
									<td>${user.createdUserId}</td>
									<td>${user.createdDate}</td>
									<td><a href="<c:url value='user/edit/${user.id}'/>">Detail</a></td>
									<td><a href="<c:url value='user/detail/${user.id}'/>">Edit</a></td>
								</tr>
							</c:forEach>
						</c:if>

					</tbody>
				</table>

			</div>
		</div>
	</div>
</body>
</html>