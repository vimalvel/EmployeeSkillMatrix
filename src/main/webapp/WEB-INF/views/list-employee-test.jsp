<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test List</title>
</head>
<body>
<div id="table root">
		<table>
			<thead>
			<tr>
			<th>Test Id</th>
			<th>Test Name</th>
			<th>Max Mark</th>
			<th>PassMark</th>
			<th>Subject</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var = "test" items = "${allemployeetest}">
			<tr>
			<td>${test.testId}</td>
			<td>${test.testName}</td>
			<td>${test.maxMark}</td>
			<td>${test.passMark}</td>
		    <td>${test.subject}</td>
			</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>