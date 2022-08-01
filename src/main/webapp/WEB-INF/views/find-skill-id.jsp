<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Skill</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action = "" method = "post" modelAttribute = "getskill">
			<div>
					<label for="skillId">Skill Id</label>
					<div>
						<form:input path="skillId" readonly="true" />
					</div>
				</div>
				<div>
					<label for="skillName">Skill Name</label>
					<div>
						<form:input path="skillName" readonly="true" />
					</div>
				</div>
				<div>
					<label for="skillType">Skill Type</label>
					<div>
						<form:input path="skillType" readonly="true" />
					</div>
				</div>
				<div>
					<label for="prerequest">Prerequest</label>
					<div>
						<form:input path="prerequest" readonly="true" />
					</div>
				</div>
				<div>
					<label for="testId">Test Id</label>
					<div>
						<form:input path="testId" readonly="true" />
					</div>
				</div>
				<div>
					<label for="passMark">PassMark</label>
					<div>
						<form:input path="passMark" readonly="true" />
					</div>
				</div>
				<div>
					<label for="employeeLevel">Employee Level</label>
					<div>
						<form:input path="employeeLevel" readonly="true" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>