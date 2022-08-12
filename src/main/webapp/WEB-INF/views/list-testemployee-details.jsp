<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>List Test Details</title>
</head>
<body>
	<div id="table root">
		<table border='2' width="80%" cell-padding='2'>
			<thead>
				<tr>
					<th>Exam Id</th>
					<th>Employee Id</th>
					<th>Status</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="test" items="${alltestemployeedetails}">
					<tr>
						<td>${test.examId}</td>
						<td>${test.employeeId}</td>
						<td>${test.status}</td>
						<td><a href="updatetestemployeedetailsform?examid=${test.examId}&employeeid=${test.employeeId}"><button class = "button">Edit</button></a></td>
						<td><a href="deletetestemployeedetails?examid=${test.examId}&employeeid=${test.employeeId}"><button class = "button">Delete</button></a></td>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>