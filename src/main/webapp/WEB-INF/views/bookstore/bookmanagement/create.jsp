<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>${create}</title>
<link href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/vendor/fontawesome/css/fontawesome.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/common.css" />" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.13/css/bootstrap-multiselect.css" type="text/css"/>
</head>
<body>
	<div class="container">
      <h1 class="text-center">${create}</h1>
      <br>
      <form class="form-horizontal" action="" method="post">
        <!-- Nhập thông tin -->
        <div class="form-group">
          <label class="control-label col-sm-2" for="img">Image:</label>
          <div class="col-sm-10">
            <input type="file" class="form-control" id="img">
          </div>
        </div>
        <div class="form-group">
          <label class="control-label col-sm-2" for="file">File:</label>
          <div class="col-sm-10">
            <input type="file" class="form-control" id="file">
          </div>
        </div>
        <!-- Thông tin -->
        <div class="form-group">
          <label class="control-label col-sm-2" for="title">Title:</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="title" placeholder="Enter title">
          </div>
        </div>
        <div class="form-group">
          <label class="control-label col-sm-2" for="pwd">Description:</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="description" placeholder="Enter description">
          </div>
        </div>
        <div class="form-group">
          <label class="control-label col-sm-2" for="pwd">Category:</label>
          <div class="col-sm-10">
            <select id="multiselect" class="form-control" multiple="multiple">
                <option value="1">A</option>
                <option value="2">O</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
            </select>
          </div>
        </div>
        <div class="form-group">
          <label class="control-label col-sm-2" for="pwd">Author:</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="Author" placeholder="Enter Author">
          </div>
        </div>
        <div class="form-group">
          <label class="control-label col-sm-2" for="pwd">Publishing House:</label>
          <div class="col-sm-10">
            <select class="form-control">
                <option value="" disabled selected>Choose your publishing house</option>
                <option value="1">A</option>
                <option value="2">O</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
            </select>
          </div>
        </div>
        <div class="form-group">
          <label class="control-label col-sm-2" for="pwd">Year Publish:</label>
          <div class="col-sm-10">
            <input type="date" class="form-control" id="Year_Publish">
          </div>
        </div>
        <div class="form-group">
          <label class="control-label col-sm-2" for="language">Language:</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="language" placeholder="Enter Language">
          </div>
        </div>
        <div class="form-group">
          <div class="col-sm-offset-2 col-sm-10 text-center">
            <a type="button" href="#" class="btn btn-default">Cancel</a>
            <button type="submit" class="btn btn-success">Save</button>
          </div>
        </div>
      </form>
    </div>
<script src="<c:url value="/resources/vendor/jquery/jquery-3.3.1.min.js" />"></script>
<script src="<c:url value="/resources/vendor/bootstrap/js/bootstrap.min.js" />"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.13/js/bootstrap-multiselect.js"></script>
<script type="text/javascript">
    $(document).ready(function() {
        $('#multiselect').multiselect({
            buttonWidth: '400px'
        });
    });
</script>
<style type="text/css">
    .multiselect-container {
        width: 100% !important;
    }
</style>
</body>
</html>