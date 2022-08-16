<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Skill</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action = "updatenewskill" method = "post" modelAttribute = "updateskill">
			<div>
					<label for="skillId">Skill Id</label>
					<div>
						<form:input path="skillId"  required="true" placeholder="Skill Id" />
					</div>
					<form:errors path="skillId" cssClass="text-danger" />
				</div>
				<div>
					<label for="skillName">Skill Name</label>
					<div>
						<form:input path="skillName" required="true" placeholder="SkillName"/>
					</div>
					<form:errors path="skillName" cssClass="text-danger" />
				</div>
				<div>
					<label for="skillType">Skill Type</label>
					<div>
						<form:input path="skillType" required="true"/>
					</div>
					<form:errors path="skillType" cssClass="text-danger" />
				</div>
				<div>
					<label for="testId">Test Id</label>
					<div>
						<form:input path="testId" required="true"/>
					</div>
					<form:errors path="testId" cssClass="text-danger" />
				</div>
				<div>
					<form:button>Update Skills</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>