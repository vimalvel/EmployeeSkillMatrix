<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Skill</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="updatenewemployeeskilldetails" method="post" modelAttribute="updateemployeeskilldetails">
				<div>
					<label for="employeeId">Employee Id</label>
					<div>
						<form:input path="employeeId" placeholder="Employee Id" required="true" />
					</div>
					<form:errors path="employeeId" cssClass="text-danger" />
				</div>
				<div>
					<label for="skillId">Skill Id</label>
					<div>
						<form:input path="skillId" placeholder="Skill ID" required="true" />
					</div>
					<form:errors path="skillId" cssClass="text-danger" />
				</div>
				<div>
					<label for="examId">Exam Id</label>
					<div>
						<form:input path="examId" placeholder="Exam ID" required="true" />
					</div>
					<form:errors path="examId" cssClass="text-danger" />
				</div>
				<div>
					<label for="markScore">Mark Score</label>
					<div>
						<form:input path="markScore" placeholder="MarkScore"  required="true"/>
					</div>
					<form:errors path="markScore" cssClass="text-danger" />
				</div>
				<div>
					<label for="grade">Grade</label>
					<div>
						<form:input path="grade" placeholder="Grade"  required="true"/>
					</div>
					<form:errors path="grade" cssClass="text-danger" />
				</div>
				<div>
					<label for="employeeLevel">Employee Level</label>
					<div>
						<form:input path="employeeLevel" placeholder="Employee Level"  required="true"/>
					</div>
					<form:errors path="employeeLevel" cssClass="text-danger" />
				</div>
				<div>
					<form:button>Update Employee Skill</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>