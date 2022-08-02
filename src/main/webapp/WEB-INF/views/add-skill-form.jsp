<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Skill</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action = "addnewskill" method = "post" modelAttribute = "addskill">
			<div>
					<label for="skillId">Skill Id</label>
					<div>
						<form:input path="skillId" />
					</div>
				</div>
				<div>
					<label for="skillName">Skill Name</label>
					<div>
						<form:input path="skillName" />
					</div>
				</div>
				<div>
					<label for="skillType">Skill Type</label>
					<div>
						<form:input path="skillType" />
					</div>
				</div>
				<div>
					<label for="prerequest">Prerequest</label>
					<div>
						<form:input path="prerequest" />
					</div>
				</div>
				<div>
					<label for="testId">Test Id</label>
					<div>
						<form:input path="testId" />
					</div>
				</div>
				<div>
					<label for="passMark">PassMark</label>
					<div>
						<form:input path="passMark" />
					</div>
				</div>
				<div>
					<label for="employeeLevel">Employee Level</label>
					<div>
						<form:input path="employeeLevel" />
					</div>
				</div>
				<div>
					<form:button>Add Skills</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>