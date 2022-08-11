<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exam Details Conectivity</title>
</head>
<body>

	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="getexamsid">
				<div>
					<label for="examId">Exam Id</label>
					<div>
						<form:input path="examId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="examDate">Exam Date</label>
					<div>
						<form:input path="examDate"readonly="true" />
					</div>
				</div>
				<div>
					<label for="testId">Test Id</label>
					<div>
						<form:input path="testId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="startTime">Start Time</label>
					<div>
						<form:input path="startTime" readonly="true" />
					</div>
				</div>
				<div>
					<label for="endTime">End Time</label>
					<div>
						<form:input path="endTime" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="examMode">Exam Mode</label>
					<div>
						<form:input path="examMode" readonly="true" />
					</div>
				</div>
				<div>
					<label for="totalParticipation">Total Particpation</label>
					<div>
						<form:input path="totalParticipation" readonly="true" />
					</div>
				</div>
				<div>
					<label for="supervicer">Supervicer</label>
					<div>
						<form:input path="supervicer" readonly="true" />
					</div>
				</div>
				<div>
					<label for="numberOfPassed">Number Of Passed</label>
					<div>
						<form:input path="numberOfPassed" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>
	<div id="table root">
	<table border='2' width="80%" cell-padding='2'>
			<thead>
				<tr>
					<th>Exam Id</th>
					<th>Employee Id</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="test" items="${examsidlist}">
					<tr>
						<td>${test.examId}</td>
						<td>${test.employeeId}</td>
						<td>${test.status}</td>
						</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>