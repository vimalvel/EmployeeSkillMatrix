<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Employee Skill By ID</title>
</head>
<body>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="getempskill">
				<div>
					<label for="EMPLOYEE_ID">Employee Id</label>
					<div>
						<form:input path="EMPLOYEE_ID" readonly="true" />
					</div>
				</div>
				<div>
					<label for="SKILL_ID">Skill Id</label>
					<div>
						<form:input path="SKILL_ID" readonly="true" />
					</div>
				</div>
				<div>
					<label for="EXAM_ID">Exam Id</label>
					<div>
						<form:input path="EXAM_ID" readonly="true" />
					</div>
				</div>
				<div>
					<label for="MARK_SCORED">MarkScore</label>
					<div>
						<form:input path="MARK_SCORED" readonly="true" />
					</div>
				</div>
				<div>
					<label for="GRADE">Grade</label>
					<div>
						<form:input path="GRADE" readonly="true" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</body>
</html>