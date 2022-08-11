<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Skill</title>
</head>
<body>
	<div id="table root">
		<table border='2' width="80%" cell-padding='2'>
			<thead>
				<tr>
					<th>Skill Id</th>
					<th>Skill Name</th>
					<th>Skill Type</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="skill" items="${allskill}">
					<tr>
						<td>${skill.skillId}</td>
						<td>${skill.skillName}</td>
						<td>${skill.skillType}</td>
						<td><a href="updateskillsform?id=${skill.skillId}"><button class = "button">Edit</button></a></td>
						<td><a href="deleteskill?id=${skill.skillId}"><button class = "button">Delete</button></a></td>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>