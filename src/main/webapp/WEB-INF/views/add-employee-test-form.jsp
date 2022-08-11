<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Test</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="addnewemployeetest" method="post" modelAttribute="addemployeetest">
				<div>
					<label for="testId">Test Id</label>
					<div>
						<form:input path="testId" required="true" placeholder="Enter Test Id" />
					</div>
					<form:errors path="testId" cssClass="text-danger" />
				</div>
				<div>
					<label for="testName">Test Name</label>
					<div>
						<form:input path="testName" required="true" placeholder="TestName" />
					</div>
					<form:errors path="testName" cssClass="text-danger" />
				</div>
				<div>
					<label for="maxMark">Max Mark</label>
					<div>
						<form:input path="maxMark" required="true" placeholder="MaxMark"/>
					</div>
					<form:errors path="maxMark" cssClass="text-danger" />
				</div>
				<div>
					<label for="passMark">PassMark</label>
					<div>
						<form:input path="passMark" required="true" placeholder="PassMark"/>
					</div>
					<form:errors path="passMark" cssClass="text-danger" />
				</div>
				<div>
					<form:button>Add Test</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>