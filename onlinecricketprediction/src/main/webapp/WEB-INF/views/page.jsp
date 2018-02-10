<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Online Cricket Prediction Website Using Spring MVC and Hibernate">
<meta name="author" content="Virat Goradia">
<meta name="_csrf" content="${_csrf.token}">
<meta name="_csrf_header" content="${_csrf.headerName}">

<title>Online Shopping - ${title}</title>

<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Readable Theme -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">


<!-- Bootstrap DataTables -->
<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">


<!-- Custom CSS -->
<link href="${css}/myapp.css" rel="stylesheet">

<body>
	
	<div class="se-pre-con"></div>
	<div class="wrapper">

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
   
   <!--  Load only when user clicks all games or category games -->
   <c:if test="${userClickAllGames == true or userClickCategoryGames == true}" >
   		<%@include file="listGames.jsp" %>
   </c:if>
   
   </div>
   
    <!--  Footer -->
    <%@include file="./shared/footer.jsp" %>
   
	<!-- jQuery -->
	<script src="${js}/jquery.js"></script>

	<script src="${js}/jquery.validate.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="${js}/bootstrap.min.js"></script>
	
	</div>
	
  </body>

</html>
