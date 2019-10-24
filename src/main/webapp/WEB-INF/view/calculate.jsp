<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
		<h2><spring:message code="calc.title" /></h2>
		<form:form action="result" modelAttribute="calc">
			<div class="form-group row">
				<form:label path="limit" class="col-sm-2 col-form-label"><spring:message code="calc.limit" />:</form:label>
				<div class="col-sm-10">
					<form:input path="limit" class="form-control" />
				</div>
				<div class="form-error">
					<form:errors path="limit" />
				</div>
			</div>

			<div class="form-group row">
				<form:label path="user" class="col-sm-2 col-form-label"><spring:message code="calc.user" />:</form:label>
				<div class="col-sm-10">
					<form:input path="user" class="form-control" />
				</div>
				<div class="form-error">
					<form:errors path="user" />
				</div>
			</div>

			<div class="form-group row">
				<div class="col-sm-10">
					<button type="submit" class="btn btn-primary"><spring:message code="calc.submit" /></button>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>