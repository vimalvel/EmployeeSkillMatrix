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
		<table>
			<thead>
			<tr>
			<th>Skill Id</th>
			<th>Skill Name</th>
			<th>Skill Type</th>
			<th>Prerequest</th>
			<th>Test Id</th>
			<th>PassMark</th>
			<th>Employee Level</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var = "skill" items = "${allskill}">
			<tr>
			<td>${skill.SKILL_ID}</td>
			<td>${skill.SKILL_NAME}</td>
			<td>${skill.SKILL_TYPE}</td>
			<td>${skill.PREREQUEST}</td>
		    <td>${skill.TEST_ID}</td>
		     <td>${skill.PASSMARK}</td>
		      <td>${skill.EMPLOYEE_LEVEL}</td>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>