<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find Employee Skill By ID</title>
</head>
<body>
<body>
<button style="font-size: 12px; background-color: #e7e7e7; color: black; float:left; width:10% " onclick="history.back()">Go Back</button>
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="getemployeeskilldetails">
				<div>
					<label for="employeeId">Employee Id</label>
					<div>
						<form:input path="employeeId" readonly="true" />
					</div>
				</div>
				<div>
					<label for="skillId">Skill Id</label>
					<div>
						<form:input path="skillId" readonly="true" />
					</div>
				</div>
				<div>
					<label for="examId">Exam Id</label>
					<div>
						<form:input path="examId" readonly="true" />
					</div>
				</div>
				<div>
					<label for="markScore">MarkScore</label>
					<div>
						<form:input path="markScore" readonly="true" />
					</div>
				</div>
				<div>
					<label for="grade">Grade</label>
					<div>
						<form:input path="grade" readonly="true" />
					</div>
				</div>
				<div>
					<label for="employeeLevel">Employee Level</label>
					<div>
						<form:input path="employeeLevel" readonly="true" />
					</div>
					</div>
			</form:form>
		</div>
	</div>
</body>
</body>
</html>