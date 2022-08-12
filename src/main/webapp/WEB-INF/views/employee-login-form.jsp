<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Employee Login Form</title>
</head>
<body>
	<div id="root">
		<div id="form" align="center">
			<form:form action="checkemployeeloginform" method="post"
				modelAttribute="employeelogin">
				<div>
					<h1 align="center">Employee Login</h1>
				</div>
				<div>
					<label for="employeeId">Employee Id</label>
					<div>
						<form:input path="employeeId" />
					</div>
				</div>
				<div>
					<label for="password">Password</label>
					<div>
						<form:input path="password" type = "password"/>
					</div>
				</div>
				<div>
				<form:button value ="SignIn">SignIn</form:button>
				<form:button> <a href="/employeedetails/addemployeedetailsform">Signup</a> ></form:button>
				<form:button type = "reset" value = "Clear">Reset</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>