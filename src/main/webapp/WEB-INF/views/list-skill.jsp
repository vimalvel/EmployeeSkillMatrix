<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en"><head>
<meta charset="ISO-8859-1">
<title>List Skill</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href='https://css.gg/pen.css' rel='stylesheet'>
<style>
<%@include file="/WEB-INF/CSS/listforms.css"%>
</style>
</head>
<body>
<button style="font-size: 12px; background-color: #e7e7e7; color: black; float:left; width:10% " onclick="history.back()">Go Back</button>
	<div>
		<table>
		<caption></caption>
		<tr></tr>
			<thead>
				<tr>
					<th>Skill Id</th>
					<th>Skill Name</th>
					<th>Skill Type</th>
					<th>Test Id</th>
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
						<td>${skill.testId}</td>
						<td><a href="updateskillsform?id=${skill.skillId}"><button title="edit"><em class="gg-pen"></em></button></a></td>
						<td><a href="deleteskill?id=${skill.skillId}"><button title="delete"><em class="fafa-trash"></em></button></a></td>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>