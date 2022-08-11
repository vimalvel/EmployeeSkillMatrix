<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Test Details</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action = "addnewtestemployeedetails" method = "post" modelAttribute = "addtestemployeedetails">
			<div>
					<label for="examId">Exam Id</label>
					<div>
						<form:input path="examId" required="true" placeholder="Enter ExamId" pattern="^[0-9]+$"/>
					</div>
					<form:errors path="examId" cssClass="text-danger" />
				</div>
				<div>
					<label for="employeeId">Employee Id</label>
					<div>
						<form:input path="employeeId"  required="true" placeholder="Enter EmployeeId" pattern="^[0-9]+$"/>
					</div>
					<form:errors path="employeeId" cssClass="text-danger" />
				</div>
				<div>
					<label for="status">Status</label>
					<div>
						<form:input path="status" required="true" placeholder="Status"/>
					</div>
					<form:errors path="status" cssClass="text-danger" />
				</div>
				
				<div>
					<form:button>Add Test Details</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>