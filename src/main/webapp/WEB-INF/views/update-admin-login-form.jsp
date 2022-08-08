<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Admin Login</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action = "updatenewadminlogin" method = "post" modelAttribute = "updateadminlogin">
			<div>
					<label for="adminId">Admin Id</label>
					<div>
						<form:input path="adminId" />
					</div>
				</div>
				<div>
					<label for="adminEmail">Admin Email</label>
					<div>
						<form:input path="adminEmail" />
					</div>
				</div>
				<div>
					<label for="password">Password</label>
					<div>
						<form:input path="password" />
					</div>
				</div>
				
				<div>
					<form:button>Update Admin Login</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>