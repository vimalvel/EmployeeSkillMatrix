<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EmployeeDetailsAndEmployeeSkillDetails</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="getemployeeid">
				<div>
					<label for="employeeId">Employee Id</label>
					<div>
						<form:input path="employeeId" />
					</div>
				</div>
				<div>
					<label for="firstName">First Name</label>
					<div>
						<form:input path="firstName" />
					</div>
				</div>
				<div>
					<label for="lastName">Last Name</label>
					<div>
						<form:input path="lastName" />
					</div>
				</div>
				<div>
					<label for="gender">Gender</label>
					<div>
						<form:input path="gender" />
					</div>
				</div>
				<div>
					<label for="dob">Date Of Birth</label>
					<div>
						<form:input path="dob" />
					</div>
				</div>
				<div>
					<label for="email">Email</label>
					<div>
						<form:input path="email" />
					</div>
				</div>
				<div>
					<label for="address">Address</label>
					<div>
						<form:input path="address" />
					</div>
				</div>
				<div>
					<label for="phoneNumber">Phone Number</label>
					<div>
						<form:input path="phoneNumber" />
					</div>
				</div>
				<div>
					<label for="designation ">Designation</label>
					<div>
						<form:input path="designation" />
					</div>
				</div>
				<div>
					<label for="employeeManager">Employee Manager</label>
					<div>
						<form:input path="employeeManager" />
					</div>
				</div>
				<div>
					<label for="salary">Salary</label>
					<div>
						<form:input path="salary" />
					</div>
				</div>
				<div>
					<label for="password">Password</label>
					<div>
						<form:input path="password" />
					</div>
				</div>
				<div>
					<form:button>Add Employee</form:button>
				</div>
			</form:form>
		</div>
		<div id="employeeidlist">
		<table>
			<thead>
			<tr>
			<th>Employee Id</th>
			<th>Skill Id</th>
			<th>Exam Id</th>
			<th>Mark Scored</th>
			<th>Grade</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var = "skill" items = "${employeeidlist}">
			<tr>
			<td>${skill.employeeId}</td>
			<td>${skill.skillId}</td>
			<td>${skill.examId}</td>
			<td>${skill.markScore}</td>
		    <td>${skill.grade}</td>
			</c:forEach>
			</tbody>
		</table>
	</div>
	</div>
</body>
</html>