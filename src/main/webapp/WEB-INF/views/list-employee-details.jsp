<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href='https://css.gg/pen.css' rel='stylesheet'>
<link href='https://css.gg/arrow-left-r.css' rel='stylesheet'>
<style>
<%@include file="/WEB-INF/CSS/listforms.css"%>
</style>
</head>
<body>
<em class="gg-arrow-left-r" onclick="history.back()"></em>
	<div>
		<table>
		<caption></caption>
		<tr></tr>
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
		    <td><a href="updateemployeedetailsform?employeeid=${emp.employeeId}"><button title="edit"><em class="gg-pen"></em></button></a></td>
		    <td><a href="deleteemployeedetails?employeeid=${emp.employeeId}"><button title="delete"><em class="fafa-trash"></em></button></a></td>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>