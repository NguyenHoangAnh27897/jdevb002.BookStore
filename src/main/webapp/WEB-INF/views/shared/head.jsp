<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<spring:url var="css" value="/resources/css" />
<spring:url var="fonts" value="/resources/fonts" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<spring:url var="img" value="/resources/img" />

<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
 	<title>ACADEMY-SHOP</title>
 	<!-- Google font -->
	<link href="https://fonts.googleapis.com/css?family=Hind:400,700" rel="stylesheet">
 	<!-- Bootstrap -->
	<link type="text/css" rel="stylesheet" href="${css}/bootstrap.min.css" />
 	<!-- Slick -->
	<link type="text/css" rel="stylesheet" href="${css}/slick.css" />
	<link type="text/css" rel="stylesheet" href="${css}/slick-theme.css" />
 	<!-- nouislider -->
	<link type="text/css" rel="stylesheet" href="${css}/nouislider.min.css" />
 	<!-- Font Awesome Icon -->
	<link type="text/css" rel="stylesheet" href="${css}/font-awesome.min.css">
 	<!-- Custom stlylesheet -->
	<link type="text/css" rel="stylesheet" href="${css}/style.css" />
	<!-- common Custom stlylesheet -->
	<link type="text/css" rel="stylesheet" href="${css}/common.css" />
	<script src="${js}/jquery.min.js"></script>
	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
 </head>
 <body>
	<div class="se-pre-con"></div> 