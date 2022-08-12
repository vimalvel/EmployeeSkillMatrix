<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find Employee Details By Id</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="post"
				modelAttribute="getemployeedetails">
				<div>
					<label for="employeeId"> Employee Id</label>
					<div>
						<form:input path="employeeId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="firstName"> First Name</label>
					<div>
						<form:input path="firstName" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="lastName"> Last Name</label>
					<div>
						<form:input path="lastName" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="gender"> Gender</label>
					<div>
						<form:input path="gender" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="dob"> Date Of Birth</label>
					<div>
						<form:input path="dob" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="email"> Email</label>
					<div>
						<form:input path="email" readonly="true" />
					</div>
				</div>
				<div>
					<label for="address"> Address</label>
					<div>
						<form:input path="address" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="phoneNumber"> Phone Number</label>
					<div>
						<form:input path="phoneNumber" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="designation"> Designation</label>
					<div>
						<form:input path="designation" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="employeeManager"> Employee Manager</label>
					<div>
						<form:input path="employeeManager" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="salary"> Salary</label>
					<div>
						<form:input path="salary" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="password"> Password</label>
					<div>
						<form:input path="password" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>