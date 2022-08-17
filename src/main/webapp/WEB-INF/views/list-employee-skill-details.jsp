<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>List Skill Details</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href='https://css.gg/pen.css' rel='stylesheet'>
<style>
<%@include file="/WEB-INF/CSS/listforms.css"%>
</style>
</head>
<body>
	<div>
		<table>
		<caption></caption>
		<tr></tr>
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
									title="edit">
									<em class="gg-pen"></em>
								</button></a></td>
						<td><a
							href="deleteemployeeskilldetails?id=${skill.employeeId}&sid=${skill.skillId}&eid=${skill.examId}"><button
									title="delete">
									<em class="fa fa-trash"></em>
								</button></a></td>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>