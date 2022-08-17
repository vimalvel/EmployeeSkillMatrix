<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>List Exam Details</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href='https://css.gg/pen.css' rel='stylesheet'>
<style>
<%@include file="/WEB-INF/CSS/listforms.css"%>
</style>
</head>
<body>
<div>
		<table>
		<caption></caption>
		<tr></tr>
			<thead>
			<tr>
			<th>Exam Id</th>
			<th>Exam Date</th>
			<th>Test Id</th>
			<th>Start Time</th>
			<th>End Time</th>
			<th>Exam Mode</th>
			<th>Total Participation</th>
			<th>Supervicer</th>
			<th>Number of Passed</th>
			<th>Edit</th>
			<th>Delete</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var = "ex" items = "${allexamdetails}">
			<tr>
			<td>${ex.examId}</td>
			<td>${ex.examDate}</td>
			<td>${ex.testId}</td>
			<td>${ex.startTime}</td>
		    <td>${ex.endTime}</td>
		    <td>${ex.examMode}</td>
		    <td>${ex.totalParticipation}</td>
		    <td>${ex.supervicer}</td>
		    <td>${ex.numberOfPassed}</td>
		    <td><a href="updateexamdetailsform?id=${ex.examId}"><button title="edit"><em class="gg-pen"></em></button></a></td>
		    <td><a href="deleteexamdetails?id=${ex.examId}"><button title="delete"><em class="fa fa-trash"></em></button></a></td>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>