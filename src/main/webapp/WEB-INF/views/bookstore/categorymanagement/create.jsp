<%@include file="../../shared/templatehead.jsp"%>

<h1>Create Category</h1>

<c:url var="saveCategory" value="/categorymanagement/create"></c:url>

<form:form action="${save}" commandName="categoryVO" method="POST">
	<table>
		<tr>
			<td><form:label path="name">
					<spring:message text="Name" />
				</form:label></td>
			<td><form:input type="text" path="name" /></td>
		</tr>

		<tr>
			<td><form:label path="category_parentID">
					<spring:message text="ParentID" />
				</form:label></td>
			<td><form:input type="number" path="category_parentID" /></td>
		</tr>

		<tr>
			<td><form:label path="description">
					<spring:message text="Description" />
				</form:label></td>
			<td><form:textarea row="5" path="description" /></td>
		</tr>

		<tr>
			<td><form:label path="created_userID">
					<spring:message text="Created_UserID" />
				</form:label></td>
			<td><form:input type="number" path="created_userID" /></td>
		</tr>

		<tr>
			<td><form:label path="created_date">
					<spring:message text="Created_Date" />
				</form:label></td>
			<td><form:input type="date" path="created_date" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit"
				value="<spring:message text="Create"/>" /> <input type="reset"
				value="<spring:message text="Clear"/>" /></td>
		</tr>
		<a href="${save}">Quay lai trang Create</a>
	</table>
</form:form>

<%@include file="../../shared/templatefooter.jsp"%>