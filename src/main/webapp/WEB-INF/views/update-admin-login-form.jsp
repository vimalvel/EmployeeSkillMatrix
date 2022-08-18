<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en"><head>
<meta charset="ISO-8859-1">
<title>Update Admin Login</title>
</head>
<body>
<button style="font-size: 12px; background-color: #e7e7e7; color: black; float:left; width:10% " onclick="history.back()">Go Back</button>
<div id="root">
		<div id="form">
			<form:form action = "updatenewadminlogin" method = "post" modelAttribute = "updateadminlogin">
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
					<form:button>Update Admin Login</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>