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
			<form:form action="add" method="post" modelAttribute="addemptest">
				<div>
					<label for="TEST_ID">Test Id</label>
					<div>
						<form:input path="TEST_ID" />
					</div>
				</div>
				<div>
					<label for="TEST_NAME">Test Name</label>
					<div>
						<form:input path="TEST_NAME" />
					</div>
				</div>
				<div>
					<label for="MAX_MARK">Max Mark</label>
					<div>
						<form:input path="MAX_MARK" />
					</div>
				</div>
				<div>
					<label for="PASSMARK">Password</label>
					<div>
						<form:input path="PASSMARK" />
					</div>
				</div>
				<div>
					<label for="SUBJECT">Subject</label>
					<div>
						<form:input path="SUBJECT" />
					</div>
				</div>
				<div>
					<form:button>Add Test</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>