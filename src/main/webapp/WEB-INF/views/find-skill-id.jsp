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
					<label for="SKILL_ID">Skill Id</label>
					<div>
						<form:input path="SKILL_ID" />
					</div>
				</div>
				<div>
					<label for="SKILL_NAME">Skill Name</label>
					<div>
						<form:input path="SKILL_NAME" />
					</div>
				</div>
				<div>
					<label for="SKILL_TYPE">Skill Type</label>
					<div>
						<form:input path="SKILL_TYPE" />
					</div>
				</div>
				<div>
					<label for="PREREQUEST">Prerequest</label>
					<div>
						<form:input path="PREREQUEST" />
					</div>
				</div>
				<div>
					<label for="TEST_ID">Test Id</label>
					<div>
						<form:input path="TEST_ID" />
					</div>
				</div>
				<div>
					<label for="PASSMARK">PassMark</label>
					<div>
						<form:input path="PASSMARK" />
					</div>
				</div>
				<div>
					<label for="EMPLOYEE_LEVEL">Employee Level</label>
					<div>
						<form:input path="EMPLOYEE_LEVEL" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>