<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find Test By Id</title>
</head>
<body>
<button style="font-size: 12px; background-color: #e7e7e7; color: black; float:left; width:10% " onclick="history.back()">Go Back</button>
<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="getemployeetest">
				<div>
					<label for="testId">Test Id</label>
					<div>
						<form:input path="testId" readonly="true" />
					</div>
				</div>
				<div>
					<label for="testName">Test Name</label>
					<div>
						<form:input path="testName" readonly="true" />
					</div>
				</div>
				<div>
					<label for="maxMark">Max Mark</label>
					<div>
						<form:input path="maxMark" readonly="true" />
					</div>
				</div>
				<div>
					<label for="passMark">PassMark</label>
					<div>
						<form:input path="passMark" readonly="true" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>