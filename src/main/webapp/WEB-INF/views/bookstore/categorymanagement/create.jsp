<%@include file="../../shared/templatehead.jsp"%>

<!-- 	<div id="content-body">
		<h2>
			<label><b>Category</b></label>
		</h2>
		<div id="content">
			<form id="frmCategory" action="/bookstore/categorymanagement/create"
				method="POST" commandName="categoryVO">
				<table>
					<tr>
						<td><input type="hidden" id="categoryID" name="categoryID"
							path="categoryID" disabled="true" /></td>
					</tr>
					<tr>
						<td><label>NameCategory : </label></td>
						<td><input type="text" id="name" name="Name" path="name" /></td>
					</tr>
					<tr>
						<td><label>category_parentID : </label></td>
						<td><input type="number" id="number" name="Category_ParentID"
							path="category_parentID" /></td>
					</tr>
					<tr>
						<td><label>Description : </label></td>
						<td><textarea rows="5"></textarea></td>
					</tr>
					<tr>
						<td><label>Created_UserID : </label></td>
						<td><input type="text" id="created_userID"
							name="Created_UserID" path="created_userID" /></td>
					</tr>

					<tr>
						<td><label>Created_Date : </label></td>
						<td><input type="date" id="created_date" name="Created_Date"
							path="created_date" /></td>
					</tr>

					<td><button type="submit" id="save">Create</button></td>
					<td><button type="reset" id="reset">Clear</button></td>
					</tr>
				</table>
			</form> -->


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