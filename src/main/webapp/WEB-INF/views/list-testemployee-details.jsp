<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Test Details</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Exam Id</th>
					<th>Employee Id</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="test" items="${testemployeedetailslist}">
					<tr>
						<td>${test.examId}</td>
						<td>${test.employeeId}</td>
						<td>${test.status}</td>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>