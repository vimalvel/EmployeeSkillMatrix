<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Test List</title>
</head>
<body>
<div id="table root">
		<table border='2' width="80%" cell-padding='2'>
			<thead>
			<tr>
			<th>Test Id</th>
			<th>Test Name</th>
			<th>Max Mark</th>
			<th>PassMark</th>
			<th>Edit</th>
			<th>Delete</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var = "test" items = "${allemployeetest}">
			<tr>
			<td>${test.testId}</td>
			<td>${test.testName}</td>
			<td>${test.maxMark}</td>
			<td>${test.passMark}</td>
			<td><a href="updateemployeetestform?id=${test.testId}"><button class = "button">Edit</button></a></td>
			<td><a href="deleteexamdetails?id=${test.testId}"><button class = "button">Delete</button></a></td>
			</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>