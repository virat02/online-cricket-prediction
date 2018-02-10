<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />



<!doctype html>
<html lang="en" class="no-js">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<link href='https://fonts.googleapis.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="${css}/reset.css"> <!-- CSS reset -->
	<link rel="stylesheet" href="${css}/style.css"> <!-- Resource style -->
	<script src="${js}/modernizr.js"></script> <!-- Modernizr -->
  	
	<title>Online Cricket Prediction -  ${title}</title>
	</head>
	
	
  <body>

    <!-- Navigation -->
   <%@include file="./shared/navbar.jsp" %>
   
   <!-- Page content -->
   <c:if test="${userClickHome == true }" >
   		<%@include file="home.jsp" %>
   </c:if>
   
   <!--  Load only when user clicks about -->
   <c:if test="${userClickAbout == true }" >
   		<%@include file="about.jsp" %>
   </c:if>
   
    <!--  Load only when user clicks contact -->
   <c:if test="${userClickContact == true }" >
   		<%@include file="contact.jsp" %>
   </c:if>
   
    <!--  Footer -->
    <%@include file="./shared/footer.jsp" %>
    
    <!-- Javascript -->
    <script src="${js}/jquery-2.1.1.js"></script>
	<script src="${js}/main.js"></script> <!-- Resource jQuery -->
	<script>
	(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  	(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  	m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  	})(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  	ga('create', 'UA-48014931-1', 'codyhouse.co');
  	ga('send', 'pageview');

  	jQuery(document).ready(function($){
  		$('.close-carbon-adv').on('click', function(event){
  			event.preventDefault();
  			$('#carbonads-container').hide();
  		});
  	});
	</script>

  </body>

</html>
