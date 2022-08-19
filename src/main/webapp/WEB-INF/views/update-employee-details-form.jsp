<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Employee details </title>
<link href='https://css.gg/arrow-left-r.css' rel='stylesheet'>
<style>
<%@include file="/WEB-INF/CSS/forms.css"%>
</style>
<script>
<%@include file="/WEB-INF/Script/employeedetails.js"%>
</script>
</head>
<body>
<em class="gg-arrow-left-r" onclick="history.back()"></em>
			<form:form name="form" action = "updatenewemployeedetails" method = "post" modelAttribute = "updateemployeedetails">
			<div class="form">
			<table>
			<caption>
			</caption>
			<tr><th></th></tr>
				<tbody>
					<tr>
						<td><label for="firstName">First Name</label></td>
						<td><form:input path="firstName" name="firstName" onblur="firstCheck()" pattern ="^[a-z A-Z]+$" title="Name can't be empty or must contain only alphabets" placeholder="Enter First Name" /></td>
					</tr>
					<tr>
						<td><label for="lastName">Last Name</label></td>
						<td><form:input path="lastName" name="lastName" onblur="lastCheck()" pattern ="^[a-z A-Z]+$" title="Name must be in alphabets" placeholder="Enter Last Name"  /></td>
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
						<td><form:input path="dob" type="date"/></td>
					</tr>
					<tr>
						<td><label for="email">Email</label></td>
						<td><form:input path="email" name="email" onblur="emailCheck()" pattern ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" title="email not in correct format" placeholder="Enter a Email"/></td>
					</tr>
					<tr>
						<td><label for="address">Address</label></td>
						<td><form:input path="address" name="address" onblur="addressCheck()" placeholder="Enter Address" 
								 /></td>
					</tr>
					<tr>
						<td><label for="phoneNumber">Phone Number</label></td>
						<td><form:input path="phoneNumber" name="phoneNo" onblur="phoneNoCheck()" pattern="[0-9]{10}" title="Phone number must have 10 digits" placeholder="Enter Phone Number"/></td>
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
						<td><form:input path="employeeManager" pattern="^[a-z A-Z]+$" title="Name can't be empty or must contain only alphabets"
								placeholder="Employee Manager" /></td>
					</tr>
					<tr>
						<td><label for="salary">Salary</label></td>
						<td><form:input path="salary" pattern="[0-9][1-9.]*[0-9]+[1-9]*" title="It Should be in Integer Only" placeholder="Salary"
								 /></td>
					</tr>
					<tr>
						<td><label for="password">Password</label></td>
						<td><form:input path="password" name="password" onblur="passwordCheck()" pattern="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" title="Password must begin with letter and contain atleast one number and must have atleast 8 characters" placeholder="Enter a Password" type="password" readonly="true" /></td>
					</tr>
				</tbody>
			</table>
			<form:button>Update Employee</form:button>
		</div>
	</form:form>
</body>
</html>