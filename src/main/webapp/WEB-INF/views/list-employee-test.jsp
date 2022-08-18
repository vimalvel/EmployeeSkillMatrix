<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Test List</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href='https://css.gg/pen.css' rel='stylesheet'>
<style>
<%@include file="/WEB-INF/CSS/listforms.css"%>
</style>
</head>
<body>
<button style="font-size: 12px; background-color: #e7e7e7; color: black; float:left; width:10% " onclick="history.back()">Go Back</button>
<div>
		<table>
		<caption></caption>
		<tr></tr>
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
			<td><a href="updateemployeetestform?id=${test.testId}"><button title="edit"><em class="gg-pen"></em></button></a></td>
			<td><a href="deleteexamdetails?id=${test.testId}"><button title="delete"><em class="fafa-trash"></em></button></a></td>
			</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>