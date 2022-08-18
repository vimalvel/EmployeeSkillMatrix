<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Exam Details</title>
<style>
<%@include file="/WEB-INF/CSS/forms.css"%>
</style>
</head>
<body>
<button style="font-size: 12px; background-color: #e7e7e7; color: black; float:left; width:10% " onclick="history.back()">Go Back</button>
			<form:form action = "updatenewexamdetails" method = "post" modelAttribute = "updateexamdetails">
			<div class="form">
			<table>
			<caption></caption>
			<tr><th></th></tr>
				<tbody>
					<tr>
						<td><label for="examDate">Exam Date</label></td>
						<td><form:input path="examDate" type="date" /></td>
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
								Particpation</label></td>
						<td><form:input path="totalParticipation" required="true"
								placeholder="Enter Total Participation" /></td>
					</tr>
					<tr>
						<td><label for="supervicer">Supervicer</label></td>
						<td><form:input path="supervicer" required="true"
								placeholder="Enter Supervicer" /></td>
					</tr>
					<tr>
						<td><label for="numberOfPassed">Number Of Passed</label></td>
						<td><form:input path="numberOfPassed" required="true"
								placeholder="Enter Number Of Passed" /></td>
					</tr>
				</tbody>
			</table>
			<form:button>Add Exam Details</form:button>
		</div>
	</form:form>
</body>
</html>