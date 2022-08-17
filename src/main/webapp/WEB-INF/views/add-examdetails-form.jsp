<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Exam Details</title>
<style>
<%@include file="/WEB-INF/CSS/forms.css" %>
</style>
</head>
<body>
	<form:form action="addnewexamdetails" method="post"
		modelAttribute="addexamdetails">
		<div class="form">
			<table>
			<caption></caption>
			<tr><th></th></tr>
				<tbody>
					<tr>
						<td><label for="examDate">Exam Date</label></td>
						<td><form:input path="examDate" type="date" /></td>
						<form:errors path="examDate" cssClass="text-danger" />
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
					<tr>
						<td><label for="startTime">Start Time</label></td>
						<td><form:input path="startTime" type="time" /></td>
						<form:errors path="startTime" cssClass="text-danger" />
					</tr>
					<tr>
						<td><label for="endTime">End Time</label></td>
						<td><form:input path="endTime" type="time" /></td>
						<form:errors path="endTime" cssClass="text-danger" />
					</tr>
					<tr>
						<td><label for="examMode">Exam Mode</label></td>
						<td><form:input path="examMode" required="true"
								placeholder="Enter Exam Mode" /></td>
						<form:errors path="examMode" cssClass="text-danger" />
					</tr>
					<tr>
						<td><label for="totalParticipation">Total
								Particpation</label></td>
						<td><form:input path="totalParticipation" required="true"
								placeholder="Enter Total Participation" /></td>
						<form:errors path="totalParticipation" cssClass="text-danger" />
					</tr>
					<tr>
						<td><label for="supervicer">Supervicer</label></td>
						<td><form:input path="supervicer" required="true"
								placeholder="Enter Supervicer" /></td>
						<form:errors path="supervicer" cssClass="text-danger" />
					</tr>
					<tr>
						<td><label for="numberOfPassed">Number Of Passed</label></td>
						<td><form:input path="numberOfPassed" required="true"
								placeholder="Enter Number Of Passed" /></td>
						<form:errors path="numberOfPassed" cssClass="text-danger" />
					</tr>
				</tbody>
			</table>
			<form:button>Add Exam Details</form:button>
		</div>
	</form:form>
</body>

</html>