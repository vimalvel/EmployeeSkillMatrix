<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee details </title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action = "updatenewemployeedetails" method = "post" modelAttribute = "updateemployeedetails">
			<div>
					<label for="employeeId">Employee Id</label>
					<div>
						<form:input path="employeeId" title="minimum 1 value should be inizialize"
						pattern="^[0-9]+$" required="true" />
					</div>
					<form:errors path="employeeId" cssClass="text-danger" />
				</div>
				<div>
					<label for="firstName">First Name</label>
					<div>
						<form:input path="firstName" title ="name must be in alpabet"  pattern="[a-zA-Z]+\\.?"/>
					</div>
					<form:errors path="firstName" cssClass="text-danger" />
				</div>
				<div>
					<label for="lastName">Last Name</label>
					<div>
						<form:input path="lastName" />
					</div>
				</div>
				<div>
					<label for="gender">Gender</label>
					<div>
						<form:input path="gender"/>
					</div>
					<form:errors path="gender" cssClass="text-danger" />
				</div>
				<div>
					<label for="dob">Date Of Birth</label>
					<div>
						<form:input path="dob" required = "true" />
					</div>
					<form:errors path="gender" cssClass="text-danger" />
				</div>
				<div>
					<label for="email">Email</label>
					<div>
						<form:input path="email" title="example@123gmail.com" required="true" />
					</div>
					<form:errors path="email" cssClass="text-danger" />
				</div>
				<div>
					<label for="address">Address</label>
					<div>
						<form:input path="address" required="true" />
					</div>
					<form:errors path="address" cssClass="text-danger" />
				</div>
				<div>
					<label for="phoneNumber">Phone Number</label>
					<div>
						<form:input path="phoneNumber" title="it must be 10 digit number" pattern="^[0-9]{10}$" required="true" />
					</div>
					<form:errors path="phoneNumber" cssClass="text-danger" />
				</div>
				<div>
					<label for="designation ">Designation</label>
					<div>
						<form:input path="designation" required = "true"/>
					</div>
					<form:errors path="designation" cssClass="text-danger" />
				</div>
				<div>
					<label for="employeeManager">Employee Manager</label>
					<div>
						<form:input path="employeeManager" required="true"/>
					</div>
					<form:errors path="employeeManager" cssClass="text-danger" />
				</div>
				<div>
					<label for="salary">Salary</label>
					<div>
						<form:input path="salary" required="true" />
					</div>
					<form:errors path="salary" cssClass="text-danger" />
				</div>
				<div>
					<label for="password">Password</label>
					<div>
						<form:input path="password" title="Welcomeee@123" pattern="^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$" required="true" />
					</div>
					<form:errors path="password" cssClass="text-danger" />
				</div>
				<div>
					<form:button>Update Employee</form:button>
				</div>
			</form:form>
		</div>
</body>
</html>