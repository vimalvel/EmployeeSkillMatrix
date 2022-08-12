<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Employee Details Composite Key</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="getemployeesid">
				<div>
					<label for="employeeId">Employee Id</label>
					<div>
						<form:input path="employeeId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="firstName">First Name</label>
					<div>
						<form:input path="firstName" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="lastName">Last Name</label>
					<div>
						<form:input path="lastName" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="gender">Gender</label>
					<div>
						<form:input path="gender" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="dob">Date Of Birth</label>
					<div>
						<form:input path="dob" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="email">Email</label>
					<div>
						<form:input path="email" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="address">Address</label>
					<div>
						<form:input path="address" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="phoneNumber">Phone Number</label>
					<div>
						<form:input path="phoneNumber" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="designation ">Designation</label>
					<div>
						<form:input path="designation" readonly="true" />
					</div>
				</div>
				<div>
					<label for="employeeManager">Employee Manager</label>
					<div>
						<form:input path="employeeManager" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="salary">Salary</label>
					<div>
						<form:input path="salary" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="password">Password</label>
					<div>
						<form:input path="password" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
		</div>
		<div id="table root">
		<table border='2' width="80%" cell-padding='2'>
			<thead>
				<tr>
					<th>Exam Id</th>
					<th>Employee Id</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="test" items="${employeesidlist}">
					<tr>
						<td>${test.examId}</td>
						<td>${test.employeeId}</td>
						<td>${test.status}</td>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>