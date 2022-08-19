<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find Employee Details By Id</title>
<style>
<%@include file="/WEB-INF/CSS/forms.css"%>
</style>
</head>
<body>
	<button
		style="font-size: 12px; background-color: #e7e7e7; color: black; float: left; width: 10%"
		onclick="history.back()">Go Back</button>
	<form:form action="" method="post" modelAttribute="getemployeedetails">
		<div class="form">
			<table>
			<caption></caption>
			<tr><th></th></tr>
				<tbody>
					<tr>
						<td><label for="employeeId"> Employee Id</label></td>
						<td><form:input path="employeeId" readonly="true" /></td>
					</tr>
					<tr>
						<td><label for="firstName"> First Name</label></td>
						<td><form:input path="firstName" readonly="true" /></td>
					</tr>
					<tr>
						<td><label for="lastName"> Last Name</label></td>
						<td><form:input path="lastName" readonly="true" /></td>
					</tr>
					<tr>
						<td><label for="gender"> Gender</label></td>
						<td><form:input path="gender" readonly="true" /></td>
					</tr>
					<tr>
						<td><label for="dob"> Date Of Birth</label></td>
						<td><form:input path="dob" readonly="true" /></td>
					</tr>
					<tr>
						<td><label for="email"> Email</label></td>
						<td><form:input path="email" readonly="true" /></td>
					</tr>
					<tr>
						<td><label for="address"> Address</label></td>
						<td><form:input path="address" readonly="true" /></td>
					</tr>
					<tr>
						<td><label for="phoneNumber"> Phone Number</label></td>
						<td><form:input path="phoneNumber" readonly="true" /></td>
					</tr>
					<tr>
						<td><label for="designation"> Designation</label></td>
						<td><form:input path="designation" readonly="true" /></td>
					</tr>
					<tr>
						<td><label for="employeeManager"> Employee Manager</label></td>
						<td><form:input path="employeeManager" readonly="true" /></td>
					</tr>
					<tr>
						<td><label for="salary"> Salary</label></td>
						<td><form:input path="salary" readonly="true" /></td>
					</tr>
					<tr>
						<td><label for="password"> Password</label></td>
						<td><form:input path="password" readonly="true" /></td>
					</tr>
				</tbody>
			</table>
		</div>
		<tr>
		</tr>
	</form:form>
	<a href="/employeedetails/employeeloginform">
			<button>Go To Login Page</button>
		</a>
</body>
</html>