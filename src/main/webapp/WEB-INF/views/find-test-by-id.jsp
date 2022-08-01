<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Test By Id</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="gettest">
				<div>
					<label for="TEST_ID">Test Id</label>
					<div>
						<form:input path="TEST_ID" readonly="true" />
					</div>
				</div>
				<div>
					<label for="TEST_NAME">Test Name</label>
					<div>
						<form:input path="TEST_NAME" readonly="true" />
					</div>
				</div>
				<div>
					<label for="MAX_MARK">Max Mark</label>
					<div>
						<form:input path="MAX_MARK" readonly="true" />
					</div>
				</div>
				<div>
					<label for="PASSMARK">PassMark</label>
					<div>
						<form:input path="PASSMARK" readonly="true" />
					</div>
				</div>
				<div>
					<label for="SUBJECT">Subject</label>
					<div>
						<form:input path="SUBJECT" readonly="true" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>