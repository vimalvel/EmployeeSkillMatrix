<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Admin List</title>
<link href='https://css.gg/arrow-left-r.css' rel='stylesheet'>
</head>
<body>
<em class="gg-arrow-left-r" onclick="history.back()"></em>
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