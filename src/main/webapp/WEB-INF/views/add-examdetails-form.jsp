<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Exam Details</title>
<link href='https://css.gg/arrow-left-r.css' rel='stylesheet'>
<style>
<%@include file="/WEB-INF/CSS/forms.css" %>
</style>
<script>
<%@include file="/WEB-INF/Script/examdetails.js" %>   
</script>
</head>
<body>
<em class="gg-arrow-left-r" onclick="history.back()"></em>
	<form:form action="addnewexamdetails" method="post"
		modelAttribute="addexamdetails" name="myForm">
		<div class="form">
			<table>
			<caption></caption>
			<tr><th></th></tr>
				<tbody>
					<tr>
						<td><label for="examDate">Exam Date</label></td>
						<td><form:input path="examDate" type="date" name="examDate" onblur="checkExamDate();"/></td>
					</tr>
					<tr>
						<td><label for="testId">Test Name</label></td>
						<td><form:select path="testId">
								<c:forEach var="test" items="${employeetest}">
									<form:option value="${test.testId}" label="${test.testName}" />
								</c:forEach>
							</form:select></td>
					</tr>
					<tr>
						<td><label for="startTime">Start Time</label></td>
						<td><form:input  path="startTime" name="startTime" type="time" /></td>
					</tr>
					<tr>
						<td><label for="endTime">End Time</label></td>
						<td><form:input  path="endTime" name="endTime" onblur="timeCheck();" type="time" /></td>
					</tr>
					<tr>
						<td><label for="examMode">Exam Mode</label></td>
						<td><form:select path="examMode" required="true">
								<form:option value="Online">Online</form:option>
								<form:option value="Offline">Offline</form:option>
							</form:select></td>
					</tr>
					<tr>
						<td><label for="totalParticipation">Total
								Participation</label></td>
						<td><form:input path="totalParticipation" pattern="^[0-9]+$" required="true"
								placeholder="Enter Total Participation" /></td>
					</tr>
					<tr>
						<td><label for="supervicer">Superviser</label></td>
						<td><form:input path="supervicer" pattern ="^[a-z A-Z]+$" required="true"
								placeholder="Enter Supervicer" /></td>
					</tr>
					<tr>
						<td><label for="numberOfPassed">Number Of Passed</label></td>
						<td><form:input path="numberOfPassed" pattern="^[0-9]+$" required="true"
								placeholder="Enter Number Of Passed" /></td>
					</tr>
				</tbody>
			</table>
			<form:button>Add Exam Details</form:button>
		</div>
	</form:form>
</body>

</html>