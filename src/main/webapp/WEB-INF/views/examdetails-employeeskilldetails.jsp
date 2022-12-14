<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Exam Details And Employee Skill Details</title>
</head>
<body>
<button style="font-size: 12px; background-color: #e7e7e7; color: black; float:left; width:10% " onclick="history.back()">Go Back</button>
<div id="root">
		<div id="form">
			<form:form action = "" method = "post" modelAttribute = "getexamid">
			<div>
					<label for="examId">Exam Id</label>
					<div>
						<form:input path="examId" />
					</div>
				</div>
				<div>
					<label for="examDate">Exam Date</label>
					<div>
						<form:input path="examDate" />
					</div>
				</div>
				<div>
					<label for="testId">Test Id</label>
					<div>
						<form:input path="testId" />
					</div>
				</div>
				<div>
					<label for="startTime">Start Time</label>
					<div>
						<form:input path="startTime" />
					</div>
				</div>
				<div>
					<label for="endTime">End Time</label>
					<div>
						<form:input path="endTime" />
					</div>
				</div>
				<div>
					<label for="examMode">Exam Mode</label>
					<div>
						<form:input path="examMode" />
					</div>
				</div>
				<div>
					<label for="totalParticipation">Total Particpation</label>
					<div>
						<form:input path="totalParticipation" />
					</div>
				</div>
				<div>
					<label for="supervicer">Supervicer</label>
					<div>
						<form:input path="supervicer" />
					</div>
				</div>
				<div>
					<label for="numberOfPassed">Number Of Passed</label>
					<div>
						<form:input path="numberOfPassed" />
					</div>
				</div>
				<div>
					<form:button>Add Exam Details</form:button>
				</div>
			</form:form>
		</div>
	</div>
<div id="examidlist">
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
			<c:forEach var = "skill" items = "${examidlist}">
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