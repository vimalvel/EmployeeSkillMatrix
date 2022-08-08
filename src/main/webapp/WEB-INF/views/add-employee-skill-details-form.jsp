<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee Skill</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="addnewemployeeskilldetails" method="post" modelAttribute="addemployeeskilldetails">
				<div>
					<label for="employeeId">Employee Id</label>
					<div>
						<form:input path="employeeId" title="minimum 1 value should be inizialize"
						pattern="^[0-9]+$" required="true" />
					</div>
					<form:errors path="employeeId" cssClass="text-danger" />
				</div>
				<div>
					<label for="skillId">Skill Id</label>
					<div>
						<form:input path="skillId" title="minimum 1 value should be inizialize"
						pattern="^[0-9]+$" required="true" />
					</div>
					<form:errors path="skillId" cssClass="text-danger" />
				</div>
				<div>
					<label for="examId">Exam Id</label>
					<div>
						<form:input path="examId" title="minimum 1 value should be inizialize"
						pattern="^[0-9]+$" required="true" />
					</div>
					<form:errors path="examId" cssClass="text-danger" />
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
					<form:button>Add Employee Skill</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>