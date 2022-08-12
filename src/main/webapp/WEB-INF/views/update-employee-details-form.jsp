<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
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
						<form:input path="employeeId" placeholder = "Enter Employee Id" readonly="true"/>
					</div>
					<form:errors path="employeeId" cssClass="text-danger" />
				</div>
				<div>
					<label for="firstName">First Name</label>
					<div>
						<form:input path="firstName"   pattern="^[a-z A-Z]+$" title="Please Enter Charactor Only"  placeholder = "Enter First Name" readonly="true"/>
					</div>
					<form:errors path="firstName" cssClass="text-danger" />
				</div>
				<div>
					<label for="lastName">Last Name</label>
					<div>
						<form:input path="lastName"  pattern="^[a-z A-Z]+$" title="Please Enter Charactor Only" placeholder = "Enter Last Name" readonly="true"/>
					</div>
					<form:errors path="firstName" cssClass="text-danger" />
				</div>
				<div>
					<label for="gender">Gender</label>
					<div>
						<form:select path="gender">
                                <form:option value="Male">Male</form:option>
                            </form:select>
                            <form:select path="gender">
                                <form:option value="Female">Female</form:option>
                            </form:select>
					</div>
					<form:errors path="gender" cssClass="text-danger" />
				</div>
				<div>
					<label for="dob">Date Of Birth</label>
					<div>
						<form:input path="dob" readonly="true"/>
					</div>
					<form:errors path="dob" cssClass="text-danger" />
				</div>
				<div>
					<label for="email">Email</label>
					<div>
						<form:input path="email" pattern="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" title ="Enter a valid email welcome03@gmail.com" placeholder = "Enter a Email" readonly="true"/>
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
						<form:input path="designation" placeholder = "Enter Designation" required = "true"/>
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
					<form:button>Update Employee</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>