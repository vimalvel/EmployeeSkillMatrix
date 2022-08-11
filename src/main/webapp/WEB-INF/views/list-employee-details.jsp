<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<div id="table root">
		<table border='2' width="80%" cell-padding='2'>
			<thead>
			<tr>
			<th>Employee Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Gender</th>
			<th>Date of Birth</th>
			<th>Email</th>
			<th>Address</th>
			<th>Phone Number</th>
			<th>Designation</th>
			<th>Employee Manager</th>
			<th>Salary</th>
			<th>Password</th>
			<th>Edit</th>
			<th>Delete</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var = "emp" items = "${allemployee}">
			<tr>
			<td>${emp.employeeId}</td>
			<td>${emp.firstName}</td>
			<td>${emp.lastName}</td>
			<td>${emp.gender}</td>
		    <td>${emp.dob}</td>
		    <td>${emp.email}</td>
		    <td>${emp.address }</td>
		    <td>${emp.phoneNumber }</td>
		    <td>${emp.designation}</td>
		    <td>${emp.employeeManager }</td>
		    <td>${emp.salary }</td>
		    <td>${emp.password }</td>
		    <td><a href="updateemployeedetailsform?employeeid=${emp.employeeId}"><button class = "button">Edit</button></a></td>
		    <td><a href="deleteemployeedetails?employeeid=${emp.employeeId}"><button class = "button">Delete</button></a></td>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>