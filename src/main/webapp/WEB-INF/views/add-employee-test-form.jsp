<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Test</title>
<style>
<%@include file="/WEB-INF/CSS/forms.css" %>
</style>
</head>
<body>
	<form:form action="addnewemployeetest" method="post"
		modelAttribute="addemployeetest">
		<div class="form">
			<table>
			<caption></caption>
			<tr><th></th></tr>
				<tbody>
					<tr>
						<td><label for="testName">Test Name</label></td>
						<td><form:select path="testName">
								<form:option value="Big Data Analysis">Big Data Analysis</form:option>
								<form:option value="Coding and Programming">Coding and Programming</form:option>
								<form:option value="Project Management">Project Management</form:option>
								<form:option value="Social Media Management & Digital Marketing">Social Media Management & Digital Marketing</form:option>
								<form:option value="Technical Writing">Technical Writing</form:option>
							</form:select></td>
						<form:errors path="testName" cssClass="text-danger" />
					</tr>
					<tr>
						<td><label for="maxMark">Max Mark</label></td>
						<td><form:input path="maxMark" required="true"
								placeholder="MaxMark" /></td>
						<form:errors path="maxMark" cssClass="text-danger" />
					</tr>
					<tr>
						<td><label for="passMark">PassMark</label></td>
						<td><form:input path="passMark" required="true"
								placeholder="PassMark" /></td>
						<form:errors path="passMark" cssClass="text-danger" />
					</tr>
				</tbody>
			</table>
			<form:button>Add Test</form:button>
		</div>
	</form:form>
</body>
</html>