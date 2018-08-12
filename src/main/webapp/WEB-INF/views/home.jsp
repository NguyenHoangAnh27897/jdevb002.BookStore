<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	    <meta charset="utf-8">
        <meta name="viewport" content="height=device-height,width=device-width,initial-scale=1.0,maximum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        
         <link href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
         <link href="<c:url value="/resources/vendor/fontawesome/css/fontawesome.min.css" />" rel="stylesheet">
         <link href="<c:url value="/resources/css/common.css" />" rel="stylesheet">
   
</head>

<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

 <script src="<c:url value="/resources/vendor/jquery/jquery-3.3.1.min.js" />"></script>
    <script src="<c:url value="/resources/vendor/bootstrap/bootstrap.min.js" />"></script>
</body>
</html>
