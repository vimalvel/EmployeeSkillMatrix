<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Test</title>
<link href='https://css.gg/arrow-left-r.css' rel='stylesheet'>
<style>
<%@include file="/WEB-INF/CSS/forms.css"%>
</style>
</head>
<body>
<em class="gg-arrow-left-r" onclick="history.back()"></em>
			<form:form action = "updatenewemployeetest" method = "post" modelAttribute = "updateemployeetest">
			<div class="form">
			<table>
			<caption></caption>
			<tr><th></th></tr>
				<tbody>
					<tr>
						<td><label for="testName">Test Name</label></td>
						<td><form:select path="testName" required="true">
								<form:option value="Big Data Analysis">Big Data Analysis</form:option>
								<form:option value="Coding and Programming">Coding and Programming</form:option>
								<form:option value="Project Management">Project Management</form:option>
								<form:option value="Social Media Management & Digital Marketing">Social Media Management & Digital Marketing</form:option>
								<form:option value="Technical Writing">Technical Writing</form:option>
							</form:select></td>
					</tr>
					<tr>
						<td><label for="maxMark">Max Mark</label></td>
						<td><form:input path="maxMark" pattern="^[0-9]+$" required="true"
								placeholder="MaxMark" /></td>
					</tr>
					<tr>
						<td><label for="passMark">PassMark</label></td>
						<td><form:input path="passMark" pattern="^[0-9]+$" required="true"
								placeholder="PassMark" /></td>
					</tr>
				</tbody>
			</table>
			<form:button>Update Test</form:button>
		</div>
	</form:form>
</body>
</html>