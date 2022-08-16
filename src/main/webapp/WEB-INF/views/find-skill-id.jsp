<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find Skill</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="getskill">
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
					<div>
					<label for="testId">Test Id</label>
					<div>
						<form:input path="testId" required="true"/>
					</div>
					<form:errors path="testId" cssClass="text-danger" />
				</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>