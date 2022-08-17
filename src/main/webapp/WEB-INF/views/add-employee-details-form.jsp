<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Employee Details</title>
<style>
<%@include file="/WEB-INF/CSS/forms.css"%>
</style>
<script>
		var firstnameCheck = function() {
			var nameRegex = new RegExp("^[a-z A-Z]+$");
			if (!document.form.firstname.value.match(nameRegex)) {
				if (alert("Name can't be empty & must contain only alphabets")) {
					document.form.firstname.focus();
				} else
					document.activeElement.blur();
			} else {
				return false;
			}

		}
		var lastnameCheck = function() {
			var nameRegex = new RegExp("^[a-z A-Z]+$");
			if (!document.form.lastname.value.match(nameRegex)) {
				if (alert("Must contain only alphabets")) {
					document.form.lastname.focus();
				} else
					document.activeElement.blur();
			} else {
				return false;
			}

		}
		var lastnameCheck = function() {
			var nameRegex = new RegExp("^[a-z A-Z]+$");
			if (!document.form.lastname.value.match(nameRegex)) {
				if (alert("Must contain only alphabets")) {
					document.form.lastname.focus();
				} else
					document.activeElement.blur();
			} else {
				return false;
			}

		}
	</script>
</head>
<body>
	<form:form action="addnewemployeedetails" method="post"
		modelAttribute="addemployeedetails" name="form">
		<div class="form">
			<table>
			<caption>
			</caption>
			<tr><th></th></tr>
				<tbody>
					<tr>
						<td><label for="firstName">First Name</label></td>
						<td><form:input path="firstName" name="firstName"
								placeholder="Enter First Name" onblur="firstnameCheck();" /></td>
					</tr>
					<tr>
						<td><label for="lastName">Last Name</label></td>
						<td><form:input path="lastName" name="lastname"
								placeholder="Enter Last Name" onblur="lastnameCheck();" /></td>
					</tr>
					<tr>
						<td><label for="gender">Gender</label></td>
						<td><form:select path="gender">
								<form:option value="Male">Male</form:option>
								<form:option value="Female">Female</form:option>
							</form:select></td>
					</tr>
					<tr>
						<td><label for="dob">Date Of Birth</label></td>
						<td><form:input path="dob" type="date" /></td>
					</tr>
					<tr>
						<td><label for="email">Email</label></td>
						<td><form:input path="email" placeholder="Enter a Email"
								required="true" /></td>
					</tr>
					<tr>
						<td><label for="address">Address</label></td>
						<td><form:input path="address" placeholder="Enter Address"
								required="true" /></td>
					</tr>
					<tr>
						<td><label for="phoneNumber">Phone Number</label></td>
						<td><form:input path="phoneNumber"
								placeholder="Enter Phone Number" required="true" /></td>
					</tr>
					<tr>
						<td><label for="designation">Designation</label></td>
						<td><form:select path="designation">
								<form:option value="Software Developer">Software Developer</form:option>
								<form:option value="Senior test engineer">Senior test engineer</form:option>
								<form:option value="Programmer">Programmer</form:option>
								<form:option value="Senior Programmer">Senior Programmer</form:option>
								<form:option value="Technology Lead">Technology Lead</form:option>
								<form:option value="Technical Lead">Technical Lead</form:option>
								<form:option value="QA lead">QA lead</form:option>
								<form:option value="Test Manager">Test Manager</form:option>
								<form:option value="Technical Manager">Technical Manager</form:option>
								<form:option value="Architect-Technology">Architect-Technology</form:option>
								<form:option value="Senior Software Engineer">Senior Software Engineer</form:option>
							</form:select></td>
					</tr>
					<tr>
						<td><label for="employeeManager">Employee Manager</label></td>
						<td><form:input path="employeeManager"
								placeholder="Employee Manager" required="true" /></td>
					</tr>
					<tr>
						<td><label for="salary">Salary</label></td>
						<td><form:input path="salary" placeholder="Salary"
								required="true" /></td>
					</tr>
					<tr>
						<td><label for="password">Password</label></td>
						<td><form:input path="password" placeholder="Enter Password"
								type="password" required="true" /></td>
					</tr>
				</tbody>
			</table>
			<form:button>Add Employee</form:button>
		</div>
	</form:form>
</body>
</html>