<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Skill</title>
<link href='https://css.gg/arrow-left-r.css' rel='stylesheet'>
<style>
<%@include file="/WEB-INF/CSS/forms.css"%>
</style>
</head>
<body>
<em class="gg-arrow-left-r" onclick="history.back()"></em>
			<form:form action = "updatenewskill" method = "post" modelAttribute = "updateskill">
			<div class="form">
			<table>
				<caption></caption>
				<tr>
					<th></th>
				</tr>
				<tbody>
					<tr>
						<td><label for="skillName">Skill Name</label></td>
						<td><form:select path="skillName">
								<form:option value="Algorithms">Algorithms</form:option>
								<form:option value="Analytical Skills">Analytical Skills</form:option>
								<form:option value="Big Data">Big Data</form:option>
								<form:option value="Calculating">Calculating</form:option>
								<form:option value="Compiling Statistics">Compiling Statistics</form:option>
								<form:option value="Data Analytics">Data Analytics</form:option>
								<form:option value="Applications">Applications</form:option>
								<form:option value="Coding">Coding</form:option>
								<form:option value="Adaptability">Adaptability</form:option>
								<form:option value="Collaboration">Collaboration</form:option>
								<form:option value="Communication">Communication</form:option>
								<form:option value="Time management">Time management</form:option>
								<form:option value="Organization">Organization</form:option>
								<form:option value="Task Management">Task Management</form:option>
								<form:option value="Technical Writing">Technical Writing</form:option>
								<form:option value="Technical Documentation">Technical Documentation</form:option>
							</form:select></td>
					</tr>
					<tr>
						<td><label for="skillType">Skill Type</label></td>
						<td><form:select path="skillType">
								<form:option value="Technical Skill">Technical Skill</form:option>
								<form:option value="Non Technical skill">Non Technical skill</form:option>
							</form:select></td>
					</tr>
					<tr>
						<td><label for="testId">Test Name</label></td>
						<td><form:select path="testId">
								<c:forEach var="test" items="${employeetest}">
									<form:option value="${test.testId}" label="${test.testName}" />
								</c:forEach>
							</form:select></td>
					</tr>
				</tbody>
			</table>
			<form:button>Update Skills</form:button>
		</div>
	</form:form>
</body>
</html>