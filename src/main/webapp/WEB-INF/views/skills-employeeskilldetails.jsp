<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Skill EmployeeSkillDetails</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action = "" method = "post" modelAttribute = "getskillid">
			<div>
					<label for="skillId">Skill Id</label>
					<div>
						<form:input path="skillId" />
					</div>
				</div>
				<div>
					<label for="skillName">Skill Name</label>
					<div>
						<form:input path="skillName" />
					</div>
				</div>
				<div>
					<label for="skillType">Skill Type</label>
					<div>
						<form:input path="skillType" />
					</div>
				</div>
							</form:form>
		</div>
		<div id="table root">
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
			</tr>
			</thead>
			<tbody>
			<c:forEach var = "skill" items = "${skillidlist}">
			<tr>
			<td>${skill.employeeId}</td>
			<td>${skill.skillId}</td>
			<td>${skill.examId}</td>
			<td>${skill.markScore}</td>
		    <td>${skill.grade}</td>
		    <td>${skill.employeeLevel}</td>
			</c:forEach>
			</tbody>
		</table>
	</div>
	</div>
</body>
</html>