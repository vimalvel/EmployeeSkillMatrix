<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Test</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action = "update" method = "post" modelAttribute = "updatetest">
			<div>
					<label for="testId">Test Id</label>
					<div>
						<form:input path="testId" />
					</div>
				</div>
				<div>
					<label for="testName">Test Name</label>
					<div>
						<form:input path="testName" />
					</div>
				</div>
				<div>
					<label for="maxMark">Max Mark</label>
					<div>
						<form:input path="maxMark" />
					</div>
				</div>
				<div>
					<label for="passMark">PassMark</label>
					<div>
						<form:input path="passMark" />
					</div>
				</div>
				<div>
					<label for="subject">Subject</label>
					<div>
						<form:input path="subject" />
					</div>
				</div>
				<div>
					<form:button>Update Test</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>