<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Test By Id</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="gettestemp">
				<div>
					<label for="examId">Exam Id</label>
					<div>
						<form:input path="examId" readonly="true" />
					</div>
				</div>
				<div>
					<label for="employeeId">Employee Id</label>
					<div>
						<form:input path="employeeId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="status">Status</label>
					<div>
						<form:input path="status" readonly="true" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>