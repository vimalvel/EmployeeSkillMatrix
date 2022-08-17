<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Skill</title>
<style>
<%@include file="/WEB-INF/CSS/forms.css" %>
</style>
</head>
<body>
	<form:form action="addnewskill" method="post" modelAttribute="addskill">
		<div class="form">
			<table>
			<caption></caption>
			<tr><th></th></tr>
				<tbody>
					<tr>
						<td><label for="skillName">Skill Name</label></td>
						<td><form:input path="skillName" required="true"
								placeholder="SkillName" /></td>
						<form:errors path="skillName" cssClass="text-danger" />
					</tr>
					<tr>
						<td><label for="skillType">Skill Type</label></td>
						<td><form:select path="skillType">
								<form:option value="Technical Skill">Technical Skill</form:option>
								<form:option value="Non Technical skill">Non Technical skill</form:option>
							</form:select></td>
						<form:errors path="skillType" cssClass="text-danger" />
					</tr>
					<tr>
						<td><label for="testId">Test Name</label></td>
						<td><form:select path="testId">
								<c:forEach var="test" items="${employeetest}">
									<form:option value="${test.testId}" label="${test.testName}" />
								</c:forEach>
							</form:select></td>
						<form:errors path="testId" cssClass="text-danger" />
					</tr>
				</tbody>
			</table>
			<form:button>Add Skills</form:button>
		</div>
	</form:form>
</body>
</html>