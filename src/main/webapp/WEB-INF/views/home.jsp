<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="css_vendor" value="/resources/vendor" />
<spring:url var="js_vendor" value="/resources/vendor" />
<spring:url var="images" value="/resources/images" />
<html>
<head>
	<title>Home</title>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="">
		<meta name="author" content="">

         <link href="${css_vendor}/bootstrap/css/bootstrap.min.css" rel="stylesheet">
         <link href="${css_vendor}/fontawesome/css/fontawesome.min.css" rel="stylesheet">
         <link href="${css}/common.css" rel="stylesheet">
   
</head>

<body class="">
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
    
    
    
    
    
    		<!-- jQuery -->
		<script src="${js}/jquery.min.js"></script>
	
		<script src="${js}/jquery.validate.min.js"></script>

		<!-- Bootstrap Core JavaScript -->
		<script src="${js_js_vendor}/bootstrap/bootstrap.min.js"></script>
		
		<!-- Self coded javascript -->
		<script src="${js}/common.js"></script>
</body>
</html>
