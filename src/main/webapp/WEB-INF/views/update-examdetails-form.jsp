<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Exam Details</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action = "updatenewexamdetails" method = "post" modelAttribute = "updateexamdetails">
			<div>
					<label for="examId">Exam Id</label>
					<div>
						<form:input path="examId" />
					</div>
				</div>
				<div>
					<label for="examDate">Exam Date</label>
					<div>
						<form:input path="examDate" type = "date" />
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
						<form:input path="startTime" type = "datetime-local" />
					</div>
				</div>
				<div>
					<label for="endTime">End Time</label>
					<div>
						<form:input path="endTime" type = "datetime-local" />
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
					<form:button>Update Exam Details</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>