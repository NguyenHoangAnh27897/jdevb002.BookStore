<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<%@include file="../../shared/templatehead.jsp"%>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.13/css/bootstrap-multiselect.css" type="text/css"/>
<style type="text/css">
    .multiselect-container {
        width: 100% !important;
    }
</style>
</head>
<body>
	<div class="container">
      <h1 class="text-center">${create}</h1>
      <br>
      <form:form class="form-horizontal" action="/bookstore/book/create" commandName="book">
        <!-- Nhập thông tin -->
        <div class="form-group">
          <form:label class="control-label col-sm-2" path="image">
          <spring:message text="Image:" /></form:label>
          <div class="col-sm-10">
            <form:input type="file" class="form-control" path="image" id="img" />
          </div>
        </div>

        <!-- Thông tin -->
        <div class="form-group">
          <form:label class="control-label col-sm-2" path="title">
          <spring:message text="Title:" /></form:label>
          <div class="col-sm-10">
            <form:input type="text" class="form-control" path="title" id="title" placeholder="Enter title" />
          </div>
        </div>
        <div class="form-group">
          <form:label class="control-label col-sm-2" path="description">
          <spring:message text="Description:" />
          </form:label>
          <div class="col-sm-10">
            <form:input type="text" class="form-control" path="description" id="description" placeholder="Enter description"/>
          </div>
        </div>
        <div class="form-group">
          <label class="control-label col-sm-2">Category:</label>
          <div class="col-sm-10">
          <form:select id="multiselect" class="form-control" path="categoryId" multiple="true">
                <form:options items="${book.listCategory}" itemValue="categoryID" itemLabel="description"/>
            </form:select>
          </div>
        </div>
        <div class="form-group">
          <form:label class="control-label col-sm-2" path="author">
          <spring:message text="Author:" />
          </form:label>
          <div class="col-sm-10">
            <form:input type="text" class="form-control" path="author" id="Author" placeholder="Enter Author"/>
          </div>
        </div>
        <div class="form-group">
          <form:label class="control-label col-sm-2" path="publishID">Publishing House:</form:label>
          <div class="col-sm-10">
            <form:select class="form-control" path="publishID">
                <form:options items="${book.publish}" itemValue="publishID" itemLabel="name"/>
            </form:select>
          </div>
        </div>
        <div class="form-group">
          <form:label class="control-label col-sm-2" path="year_Publisher">Year Publish:</form:label>
          <div class="col-sm-10">
            <form:input type="date" class="form-control" path="year_Publisher" id="Year_Publish" />
          </div>
        </div>
        <div class="form-group">
          <form:label class="control-label col-sm-2" path="language">Language:</form:label>
          <div class="col-sm-10">
            <form:input type="text" class="form-control" path="language" id="language" placeholder="Enter Language" />
          </div>
        </div>
        <div class="form-group">
          <div class="col-sm-offset-2 col-sm-10 text-center">
            <a type="button" href="<c:url value='/bookstore' />" class="btn btn-default">Cancel</a>
            <button type="submit" class="btn btn-success">Save</button>
          </div>
        </div>
      </form:form>
    </div>
    
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.13/js/bootstrap-multiselect.js"></script>
<script type="text/javascript">
    $(document).ready(function() {
        $('#multiselect').multiselect({
            buttonWidth: '400px'
        });
    });
</script>
<%@include file="../../shared/templatefooter.jsp"%>