<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Admin List</title>
</head>
<body>
<button style="font-size: 12px; background-color: #e7e7e7; color: black; float:left; width:10% " onclick="history.back()">Go Back</button>
<div id="table root">
		<table>
		<caption></caption>
		<tr></tr>
			<thead>
			<tr>
			<th>Admin Id</th>
			<th>Password</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var = "admin" items = "${alladmin}">
			<tr>
			<td>${admin.adminId}</td>
			<td>${admin.password}</td>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>