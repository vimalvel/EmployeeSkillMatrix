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
		<table>
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
			</tr>
			</thead>
			<tbody>
			<c:forEach var = "emp" items = "${allemp}">
			<tr>
			<td>${emp.EMPLOYEE_ID}</td>
			<td>${emp.FIRST_NAME}</td>
			<td>${emp.LAST_NAME}</td>
			<td>${emp.GENDER}</td>
		    <td>${emp.DOB}</td>
		    <td>${emp.EMAIL}</td>
		    <td>${emp.ADDRESS }</td>
		    <td>${emp.PHONE_NUMBER }</td>
		    <td>${emp.DESIGNATION}</td>
		    <td>${emp.EMPLOYEE_MANAGER }</td>
		    <td>${emp.SALARY }</td>
		    <td>${emp.PASSWORD }</td>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>