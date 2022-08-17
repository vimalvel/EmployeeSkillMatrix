<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>EmployeeTest And Skills</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="gettestid">
				<div>
					<label for="testId">Test Id</label>
					<div>
						<form:input path="testId" />
					</div>
				</div>
				<div>
					<label for="testName">Test Name</label>
					<div>
						<form:input path="testName" />
					</div>
				</div>
				<div>
					<label for="maxMark">Max Mark</label>
					<div>
						<form:input path="maxMark" />
					</div>
				</div>
				<div>
					<label for="passMark">PassMark</label>
					<div>
						<form:input path="passMark" />
					</div>
				</div>
				<div>
					<label for="subject">Subject</label>
					<div>
						<form:input path="subject" />
					</div>
				</div>
				<div>
					<form:button>Add Test</form:button>
				</div>
			</form:form>
		</div>
	</div>
	<div id="table root">
		<table>
		<caption></caption>
			<tr></tr>
			<thead>
			<tr>
			<th>Skill Id</th>
			<th>Skill Name</th>
			<th>Skill Type</th>
			<th>Prerequest</th>
			<th>Test Id</th>
			<th>PassMark</th>
			<th>Employee Level</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var = "skill" items = "${gettestlist}">
			<tr>
			<td>${skill.skillId}</td>
			<td>${skill.skillName}</td>
			<td>${skill.skillType}</td>
			<td>${skill.prerequest}</td>
		    <td>${skill.testId}</td>
		     <td>${skill.passMark}</td>
		      <td>${skill.employeeLevel}</td>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>