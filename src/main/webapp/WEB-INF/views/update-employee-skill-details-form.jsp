<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Skill</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action = "updatenewemployeeskilldetails" method = "post" modelAttribute = "updateemployeeskilldetails">
			<div>
					<label for="employeeId">Employee ID</label>
					<div>
						<form:input path="employeeId" />
					</div>
				</div>
				<div>
					<label for="skillId">Skill Id</label>
					<div>
						<form:input path="skillId" />
					</div>
				</div>
				<div>
					<label for="examId">Exam Id</label>
					<div>
						<form:input path="examId" />
					</div>
				</div>
				<div>
					<label for="markScore">Mark Score</label>
					<div>
						<form:input path="markScore" />
					</div>
				</div>
				<div>
					<label for="grade">Grade</label>
					<div>
						<form:input path="grade" />
					</div>
				</div>
				<div>
					<form:button>Update Skill Details</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>