<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Admin Login</title>
<style>
.text-danger {
    color: #e80c4d;
    font-size: 0.9em;
}
</style>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action = "addnewadminlogin" method = "post" modelAttribute = "addadminlogin">
			 <div>
					<label for="adminId">Admin Id</label>
					<div>
						<form:input path="adminId"  placeholder = "Enter Admin Id" required="true" />
					</div>
					<form:errors path="adminId" cssClass="text-danger" />
				</div>
				<div>
					<label for="password">Password</label>
					<div>
						<form:input path="password" placeholder = "Password" type = "password"  required = "true"/>
					</div>
					<form:errors path="password" cssClass="text-danger" />
				</div>
				
				<div>
					<form:button>Add Admin Login</form:button>
				</div>
		</form:form>
		</div>
	</div>
</body>
</html>