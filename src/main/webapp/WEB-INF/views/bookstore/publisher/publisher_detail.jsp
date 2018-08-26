<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PUBLISHER LIST</title>
<style>
h1 {
    <!--color: blue;-->
    font-size: 300%;
}
</style>
<script>
$(document).ready(function(){
    $("a").click(function(){
        alert("Delete successfully.");
    });
});
</script>
</head>
<body>
<h1>DETAIL</h1>
<a href="<c:url value='/publisher/list' />">BACK TO LIST</a>
<form>
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">
      <div class="shadow p-2 mb-0 bg-white rounded" STYLE="width: 150px;">
      PUBLISHER_ID
      </div>
      </th>
      
      <th scope="col">
      <div class="shadow p-2 mb-0 bg-white rounded" STYLE="width: 150px;">
      NAME
      </div>
      </th>
      
      <th scope="col">
      <div class="shadow p-2 mb-0 bg-white rounded" STYLE="width: 150px;">
      CREATE_USERID
      </div>
      </th>
      
      <th scope="col">
            <div class="shadow p-2 mb-0 bg-white rounded" STYLE="width: 150px;">
      CREATE_DATE
      </div>
      </th>
      
      <TH>
      <div class="shadow p-2 mb-0 bg-white rounded" STYLE="width: 150px;">
      DISCRIPTION
      </div>
      </TH>
    </tr>
    <tr>
                    
                    <td>${publisher.publishID}</td>
                    <td>${publisher.name}</td>
                    <td>${publisher.createdUserID}</td>
                    <td>${publisher.createdDate}</td>
                    <td>${publisher.description}</td>
                     <td>
                     <a href="<c:url value='/publisher/delete/${publisher.publishID}'/>"> Delete</a>
                     </td>  
    </tr>
  </thead>
  
</table>
</form>
</body>
</html>