<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Test Details</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action = "updatenewtestemployeedetails" method = "post" modelAttribute = "updatetestemployeedetails">
			<div>
					<label for="examId">Exam Id</label>
					<div>
						<form:input path="examId" />
					</div>
				</div>
				<div>
					<label for="employeeId">Employee Id</label>
					<div>
						<form:input path="employeeId" />
					</div>
				</div>
				<div>
					<label for="status">Status</label>
					<div>
						<form:input path="status" />
					</div>
				</div>
				
				<div>
					<form:button>Update Test Details</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>