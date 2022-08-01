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
			<form:form action = "updateskill" method = "post" modelAttribute = "updateempskilldetails">
			<div>
					<label for="EMPLOYEE_ID">Employee ID</label>
					<div>
						<form:input path="EMPLOYEE_ID" />
					</div>
				</div>
				<div>
					<label for="SKILL_ID">Skill Id</label>
					<div>
						<form:input path="SKILL_ID" />
					</div>
				</div>
				<div>
					<label for="EXAM_ID">Exam Id</label>
					<div>
						<form:input path="EXAM_ID" />
					</div>
				</div>
				<div>
					<label for="MARK_SCORED">Mark Score</label>
					<div>
						<form:input path="MARK_SCORED" />
					</div>
				</div>
				<div>
					<label for="GRADE">Grade</label>
					<div>
						<form:input path="GRADE" />
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