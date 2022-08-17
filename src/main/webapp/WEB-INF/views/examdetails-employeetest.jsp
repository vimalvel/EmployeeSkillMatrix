<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="gettestid">
				<div>
					<label for="testId">Test Id</label>
					<div>
						<form:input path="testId" />
					</div>
				</div>
				<div>
					<label for="testName">Test Name</label>
					<div>
						<form:input path="testName" />
					</div>
				</div>
				<div>
					<label for="maxMark">Max Mark</label>
					<div>
						<form:input path="maxMark" />
					</div>
				</div>
				<div>
					<label for="passMark">PassMark</label>
					<div>
						<form:input path="passMark" />
					</div>
				</div>
				<div>
					<label for="subject">Subject</label>
					<div>
						<form:input path="subject" />
					</div>
				</div>
				<div>
					<form:button>Add Test</form:button>
				</div>
			</form:form>
		</div>
	</div>
	<div id="table root">
		<table>
		<caption></caption>
			<tr></tr>
			<thead>
			<tr>
			<th>Exam Id</th>
			<th>Exam Date</th>
			<th>Test Id</th>
			<th>Start Time</th>
			<th>End Time</th>
			<th>Exam Mode</th>
			<th>Total Participation</th>
			<th>Supervicer</th>
			<th>Number of Passed</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var = "ex" items = "${testidlist}">
			<tr>
			<td>${ex.examId}</td>
			<td>${ex.examDate}</td>
			<td>${ex.testId}</td>
			<td>${ex.startTime}</td>
		    <td>${ex.endTime}</td>
		    <td>${ex.examMode}</td>
		    <td>${ex.totalParticipation}</td>
		    <td>${ex.supervicer}</td>
		    <td>${ex.numberOfPassed}</td>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>