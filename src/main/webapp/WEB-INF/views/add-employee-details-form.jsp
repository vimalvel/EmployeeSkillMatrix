<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Employee Details</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="addnewemployeedetails" method="post" modelAttribute="addemployeedetails">
				<%-- <div>
					<label for="employeeId">Employee Id</label>
					<div>
						<form:input path="employeeId" placeholder = "Enter Employee Id" />
					</div>
					<form:errors path="employeeId" cssClass="text-danger" />
				</div> --%>
				<div>
					<label for="firstName">First Name</label>
					<div>
						<form:input path="firstName"   pattern="^[a-z A-Z]+$" title="Please Enter Charactor Only"  placeholder = "Enter First Name"/>
					</div>
					<form:errors path="firstName" cssClass="text-danger" />
				</div>
				<div>
					<label for="lastName">Last Name</label>
					<div>
						<form:input path="lastName"  pattern="^[a-z A-Z]+$" title="Please Enter Charactor Only" placeholder = "Enter Last Name" />
					</div>
					<form:errors path="firstName" cssClass="text-danger" />
				</div>
				<div>
					<label for="gender">Gender</label>
					<div>
						<form:select path="gender">
                                <form:option value="Male">Male</form:option>
                                <form:option value="Female">Female</form:option>
                            </form:select>
					</div>
					<form:errors path="gender" cssClass="text-danger" />
				</div>
				<div>
					<label for="dob">Date Of Birth</label>
					<div>
						<form:input path="dob" type="date"/>
					</div>
					<form:errors path="dob" cssClass="text-danger" />
				</div>
				<div>
					<label for="email">Email</label>
					<div>
						<form:input path="email" pattern="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" title ="Enter a valid email welcome03@gmail.com" placeholder = "Enter a Email" required="true"/>
					</div>
					<form:errors path="email" cssClass="text-danger" />
				</div>
				<div>
					<label for="address">Address</label>
					<div>
						<form:input path="address" placeholder = "Enter Address" required="true" />
					</div>
					<form:errors path="address" cssClass="text-danger" />
				</div>
				<div>
					<label for="phoneNumber">Phone Number</label>
					<div>
						<form:input path="phoneNumber" pattern="[0-9]{3}[0-9]{3}[0-9]{4}" title="Enter 10 digits number" placeholder = "Enter Phone Number" required="true"/>
					</div>
					<form:errors path="phoneNumber"  cssClass="text-danger" />
				</div>
				<div>
					<label for="designation">Designation</label>
					<div>
						<form:select path="designation">
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
                            </form:select>
					</div>
					<form:errors path="designation" cssClass="text-danger" />
				</div>
				<div>
					<label for="employeeManager">Employee Manager</label>
					<div>
						<form:input path="employeeManager" placeholder="Employee Manager" required="true"/>
					</div>
					<form:errors path="employeeManager" cssClass="text-danger" />
				</div>
				<div>
					<label for="salary">Salary</label>
					<div>
						<form:input path="salary" placeholder="Salary" required="true" />
					</div>
					<form:errors path="salary" cssClass="text-danger" />
				</div>
				<div>
					<label for="password">Password</label>
					<div>
						<form:input path="password" placeholder = "Enter Password" pattern="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" title="Enter a valid password Welcomes@03 " type="password" required="true"/>
					</div>
					<form:errors path="password"  cssClass="text-danger" />
				</div>
				<div>
					<form:button>Add Employee</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>