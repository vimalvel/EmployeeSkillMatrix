<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Employee Id</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="post"
				modelAttribute="getemp">
				<div>
					<label for="EMPLOYEE_ID"> Employee Id</label>
					<div>
						<form:input path="EMPLOYEE_ID" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="FIRST_NAME"> First Name</label>
					<div>
						<form:input path="FIRST_NAME" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="LAST_NAME"> Last Name</label>
					<div>
						<form:input path="LAST_NAME" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="GENDER"> Gender</label>
					<div>
						<form:input path="GENDER" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="DOB"> Date Of Birth</label>
					<div>
						<form:input path="DOB" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="EMAIL"> Email</label>
					<div>
						<form:input path="EMAIL" readonly="true" />
					</div>
				</div>
				<div>
					<label for="ADDRESS"> Address</label>
					<div>
						<form:input path="ADDRESS" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="PHONE_NUMBER"> Phone Number</label>
					<div>
						<form:input path="PHONE_NUMBER" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="DESIGNATION"> Designation</label>
					<div>
						<form:input path="DESIGNATION" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="EMPLOYEE_MANAGER"> Employee Manager</label>
					<div>
						<form:input path="EMPLOYEE_MANAGER" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="SALARY"> Salary</label>
					<div>
						<form:input path="SALARY" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="PASSWORD"> Password</label>
					<div>
						<form:input path="PASSWORD" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>