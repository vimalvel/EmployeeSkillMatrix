<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Skill</title>
<link href='https://css.gg/arrow-left-r.css' rel='stylesheet'>
<style>
<%@include file="/WEB-INF/CSS/forms.css"%>
</style>
</head>
<body>
<em class="gg-arrow-left-r" onclick="history.back()"></em>
			<form:form action="updatenewemployeeskilldetails" method="post" modelAttribute="updateemployeeskilldetails">
				<div class="form">
			<table>
			<caption></caption>
			<tr><th></th></tr>
				<tbody>
					<tr>
						<td><label for="employeeId">Employee Id</label></td>
						<td><form:select path="employeeId">
								<c:forEach var="emp" items="${employeeid}">
									<form:option value="${emp.employeeId}" 
									label="${emp.employeeId}"/>
								</c:forEach>
							</form:select></td>
					</tr>
					<tr>
						<td><label for="skillId">Skill Name</label></td>
						<td><form:select path="skillId">
								<c:forEach var="skill" items="${skills}">
									<form:option value="${skill.skillId}"
										label="${skill.skillName}" />
								</c:forEach>
							</form:select></td>

					</tr>
					<tr>
						<td><label for="examId">Exam Id</label></td>
						<td><form:select path="examId">
								<c:forEach var="exam" items="${examid}">
									<form:option value="${exam.examId}"
										label="${exam.examId}" />
								</c:forEach>
							</form:select></td>

					</tr>
					<tr>
						<td><label for="markScore">Mark Score</label></td>
						<td><form:input path="markScore" id="markScore" onchange="gradeCalculation();" placeholder="MarkScore"
								required="true" /></td>

					</tr>
					<tr>
						<td><label for="grade">Grade</label></td>
						<td><form:input path="grade" id="grade" onchange="gradeCalculation();" placeholder="Grade"
								required="true" /></td>

					</tr>
					<tr>
						<td><label for="employeeLevel">Employee Level</label></td>
						<td><form:input path="employeeLevel" id="employeeLevel" onchange="gradeCalculation(this.form);"
								placeholder="Employee Level" required="true" /></td>

					</tr>
				</tbody>
			</table>

		</div>
		<form:button>Update Employee Skill</form:button>
	</form:form>

</body>
</html>