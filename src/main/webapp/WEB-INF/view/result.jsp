<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validator</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/bootstrap-4.3.1/css/bootstrap.min.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/styles.css">
</head>
<body>
	<div class="container">
		<h2><spring:message code="result.title" /></h2>
		<span class="subtitle"><spring:message code="result.result" />:</span> ${result}<br>
		<span class="subtitle"><spring:message code="result.name" />:</span> ${calc.user} <br>
		<span class="subtitle"><spring:message code="result.date" />:</span> ${date} <br>
	</div>
</body>
</html>