<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
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
						<form:input path="examId"  required="true"  placeholder="Enter Exam Id"/>
					</div>
					<form:errors path="examId" cssClass="text-danger" />
				</div>
				<div>
					<label for="examDate">Exam Date</label>
					<div>
						<form:input path="examDate" type = "date"  />
					</div>
					<form:errors path="examDate" cssClass="text-danger" />
				</div>
				<div>
					<label for="testId">Test Id</label>
					<div>
						<form:input path="testId"  required="true"  placeholder="Enter Test Id"/>
					</div>
					<form:errors path="testId" cssClass="text-danger" />
				</div>
				<div>
					<label for="startTime">Start Time</label>
					<div>
						<form:input path="startTime" type = "time" />
					</div>
					<form:errors path="startTime" cssClass="text-danger" />
				</div>
				<div>
					<label for="endTime">End Time</label>
					<div>
						<form:input path="endTime" type = "time" />
					</div>
					<form:errors path="endTime" cssClass="text-danger" />
				</div>
				<div>
					<label for="examMode">Exam Mode</label>
					<div>
						<form:input path="examMode" required="true" placeholder="Enter Exam Mode" />
					</div>
					<form:errors path="examMode" cssClass="text-danger" />
				</div>
				<div>
					<label for="totalParticipation">Total Particpation</label>
					<div>
						<form:input path="totalParticipation" required="true" placeholder="Enter Total Participation" />
					</div>
					<form:errors path="totalParticipation" cssClass="text-danger" />
				</div>
				<div>
					<label for="supervicer">Supervicer</label>
					<div>
						<form:input path="supervicer" required="true" placeholder="Enter Supervicer"/>
					</div>
					<form:errors path="supervicer" cssClass="text-danger" />
				</div>
				<div>
					<label for="numberOfPassed">Number Of Passed</label>
					<div>
						<form:input path="numberOfPassed" required="true" placeholder="Enter Number Of Passed"/>
					</div>
					<form:errors path="numberOfPassed" cssClass="text-danger" />
				</div>
				<div>
					<form:button>Update Exam Details</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>