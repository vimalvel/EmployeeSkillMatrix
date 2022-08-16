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
</head>
<body>
	<form:form action="addnewemployeedetails" method="post"
		modelAttribute="addemployeedetails" name="form">
		<div class="form">
		<table>
		<tbody>
			<tr>
				<td><label for="firstName">First Name</label></td>
				<td><form:input path="firstName" pattern="^[a-z A-Z]+$" name="firstname" required="true"
					title="Please Enter Charactor Only" placeholder="Enter First Name" onblur="firstnameCheck();"/></td>
			<form:errors path="firstName" cssClass="text-danger" />
			</tr>
			<tr>
				<td><label for="lastName">Last Name</label></td>
				<td><form:input path="lastName" pattern="^[a-z A-Z]+$" name="lastname"
					title="Please Enter Charactor Only" placeholder="Enter Last Name" onblur="lastnameCheck();" /></td>
			<form:errors path="lastName" cssClass="text-danger" />
			</tr>
			<tr>
				<td><label for="gender">Gender</label></td>
				<td><form:select path="gender">
					<form:option value="Male">Male</form:option>
					<form:option value="Female">Female</form:option>
				</form:select></td>
			<form:errors path="gender" cssClass="text-danger" />
			</tr>
			<tr>
				<td><label for="dob">Date Of Birth</label></td>
				<td><form:input path="dob" type="date" /></td>
			<form:errors path="dob" cssClass="text-danger" />
			</tr>
			<tr>
				<td><label for="email">Email</label></td>
				<td><form:input path="email" pattern="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"
					title="Enter a valid email welcome03@gmail.com"
					placeholder="Enter a Email" required="true" /></td>
			<form:errors path="email" cssClass="text-danger" />
			</tr>
			<tr>
				<td><label for="address">Address</label></td>
				<td><form:input path="address" placeholder="Enter Address"
					required="true" /></td>
			<form:errors path="address" cssClass="text-danger" />
			</tr>
			<tr>
				<td><label for="phoneNumber">Phone Number</label></td>
				<td><form:input path="phoneNumber" pattern="[0-9]{3}[0-9]{3}[0-9]{4}"
					title="Enter 10 digits number" placeholder="Enter Phone Number"
					required="true" /></td>
			<form:errors path="phoneNumber" cssClass="text-danger" />
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
			<form:errors path="designation" cssClass="text-danger" />
			</tr>
			<tr>
				<td><label for="employeeManager">Employee Manager</label></td>
				<td><form:input path="employeeManager" placeholder="Employee Manager"
					required="true" /></td>
			<form:errors path="employeeManager" cssClass="text-danger" />
			</tr>
			<tr>
				<td><label for="salary">Salary</label></td>
				<td><form:input path="salary" placeholder="Salary" required="true" /></td>
			<form:errors path="salary" cssClass="text-danger" />
			</tr>
			<tr>
				<td><label for="password">Password</label></td>
				<td><form:input path="password" placeholder="Enter Password"
						pattern="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"
						title="Enter a valid password Welcomes@03 " type="password"
						required="true" /></td>
				<form:errors path="password" cssClass="text-danger" />
			</tr></tbody>
			</table>
				<form:button>Add Employee</form:button>
		</div>
	</form:form>
	<script type="text/javascript">
	 var firstnameCheck = function() {
         var nameRegex = new RegExp("^[a-z A-Z]+$");
         if(!document.form.firstname.value.match(nameRegex)){
                if(alert("Name can't be empty & must contain only alphabets")){ 
                     document.form.firstname.focus();
                }
                else
                    document.activeElement.blur();
            }
        else{
            return false;
        } 
       
    }
	 var lastnameCheck = function() {
         var nameRegex = new RegExp("^[a-z A-Z]+$");
         if(!document.form.lastname.value.match(nameRegex)){
                if(alert("Must contain only alphabets")){ 
                     document.form.firstname.focus();
                }
                else
                    document.activeElement.blur();
            }
        else{
            return false;
        } 
       
    }
	</script>
</body>
</html>