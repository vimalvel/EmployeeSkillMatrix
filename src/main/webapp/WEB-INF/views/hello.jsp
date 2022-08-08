<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
    <div id="form" align="center">
        <form:form action="index" method="post">
            <h1 align="center">Welcome to Employee Skill Matrix</h1>
            <div>
                <h2 align="center"><a href="/adminlogins/adminloginform">ADMIN Login</a></h2>
            </div>
            <div>
                <h2 align="center"><a href="/employeedetails/employeeloginform">EMPLOYEE Login</a></h2>
            </div>
        </form:form>
    </div>
</body>
</html>