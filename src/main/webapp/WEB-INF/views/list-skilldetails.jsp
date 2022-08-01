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
		<table>
			<thead>
			<tr>
			<th>Employee Id</th>
			<th>Skill Id</th>
			<th>Exam Id</th>
			<th>Mark Scored</th>
			<th>Grade</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var = "skill" items = "${allskill}">
			<tr>
			<td>${skill.EMPLOYEE_ID}</td>
			<td>${skill.SKILL_ID}</td>
			<td>${skill.EXAM_ID}</td>
			<td>${skill.MARK_SCORED}</td>
		    <td>${skill.GRADE}</td>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>