<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Test Details</title>
<style>
<%@include file="/WEB-INF/CSS/forms.css"%>
</style>
</head>
<body>
	<form:form action="addnewtestemployeedetails" method="post"
		modelAttribute="addtestemployeedetails">
		<div class="form">
			<table>
			<caption></caption>
			<tr><th></th></tr>
				<tbody>
					<tr>
						<td><label for="examId">Exam Id</label></td>
						<td><form:input path="examId" required="true"
								placeholder="Enter ExamId" pattern="^[0-9]+$" /></td>
						<form:errors path="examId" cssClass="text-danger" />
					<tr>
						<td><label for="employeeId">Employee Id</label></td>
						<td><form:input path="employeeId" required="true"
								placeholder="Enter EmployeeId" pattern="^[0-9]+$" /></td>
						<form:errors path="employeeId" cssClass="text-danger" />
					</tr>
					<tr>
						<td><label for="status">Status</label></td>
						<td><form:input path="status" required="true"
								placeholder="Status" /></td>
						<form:errors path="status" cssClass="text-danger" />
					</tr>
				</tbody>
			</table>
			<form:button>Add Test Details</form:button>
		</div>
	</form:form>
</body>
</html>