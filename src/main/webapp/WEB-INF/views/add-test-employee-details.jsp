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
<button style="font-size: 12px; background-color: #e7e7e7; color: black; float:left; width:10% " onclick="history.back()">Go Back</button>
	<form:form action="addnewtestemployeedetails" method="post"
		modelAttribute="addtestemployeedetails">
		<div class="form">
			<table>
			<caption></caption>
			<tr><th></th></tr>
				<tbody>
					<tr>
						<td><label for="examId">Exam Id</label></td>
						<td><form:select path="examId">
								<c:forEach var="exam" items="${examid}">
									<form:option value="${exam.examId}"
										label="${exam.examId}" />
								</c:forEach>
							</form:select></td>
					<tr>
						<td><label for="employeeId">Employee Id</label></td>
						<td><form:select path="employeeId">
								<c:forEach var="emp" items="${employeeid}">
									<form:option value="${emp.employeeId}" 
									label="${emp.employeeId}"/>
								</c:forEach>
							</form:select> /></td>
					</tr>
					<tr>
						<td><label for="status">Status</label></td>
						<td><form:select path="status" required="true">
								<form:option value="Pending">Pending</form:option>
								<form:option value="Completed">Completed</form:option>
								<form:option value="Yet TOO Start">Yet TOO Start</form:option>
							</form:select> /></td>
					</tr>
				</tbody>
			</table>
			<form:button>Add Test Details</form:button>
		</div>
	</form:form>
</body>
</html>