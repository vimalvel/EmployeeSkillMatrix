<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Skill Details</title>
</head>
<body>
	<div id="table root">
		<table border='2' width="80%" cell-padding='2'>
			<thead>
				<tr>
					<th>Employee Id</th>
					<th>Skill Id</th>
					<th>Exam Id</th>
					<th>Mark Scored</th>
					<th>Grade</th>
					<th>Employee Level</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="skill" items="${allemployeeskilldetails}">
					<tr>
						<td>${skill.employeeId}</td>
						<td>${skill.skillId}</td>
						<td>${skill.examId}</td>
						<td>${skill.markScore}</td>
						<td>${skill.grade}</td>
						<td>${skill.employeeLevel}</td>
						<td><a
							href="updateemployeeskilldetailsform?id=${skill.employeeId}&sid=${skill.skillId}&eid=${skill.examId}"><button
									class="button">Edit</button></a></td>
						<td><a
							href="deleteemployeeskilldetails?id=${skill.employeeId}&sid=${skill.skillId}&eid=${skill.examId}"><button
									class="button">Delete</button></a></td>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>