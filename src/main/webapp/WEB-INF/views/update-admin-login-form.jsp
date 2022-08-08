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
						<form:input path="adminId" title="minimum 1 value should be inizialize"
						pattern="^[0-9]+$" required="true" />
					</div>
					<form:errors path="adminId" cssClass="text-danger" />
				</div>
				<div>
					<label for="adminEmail">Admin Email</label>
					<div>
						<form:input path="adminEmail" title="example@45gmail.com" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" required = "true" />
					</div>
					<form:errors path="adminEmail" cssClass="text-danger" />
				</div>
				<div>
					<label for="password">Password</label>
					<div>
						<form:input path="password" type = "password" title="Welcomeee@123" pattern="^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$" required = "true"/>
					</div>
					<form:errors path="password" cssClass="text-danger" />
				</div>
				
				<div>
					<form:button>Update Admin Login</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>