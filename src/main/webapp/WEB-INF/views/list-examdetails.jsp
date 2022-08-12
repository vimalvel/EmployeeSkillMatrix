<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>List Exam Details</title>
</head>
<body>
<div id="table root">
		<table border='2' width="80%" cell-padding='2'>
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
		    <td><a href="updateexamdetailsform?id=${ex.examId}"><button class = "button">Edit</button></a></td>
		    <td><a href="deleteexamdetails?id=${ex.examId}"><button class = "button">Delete</button></a></td>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>