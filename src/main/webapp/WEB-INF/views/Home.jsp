<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style>
*{margin: 0;
padding: 0;
}
body
{
    background-image:
        url("https://img.freepik.com/premium-vector/skills-concept-education-training-improvement-people-get-knowledge-build-career-illustration_277904-4760.jpg?w=2000");
    height: 768px;
    width: 1366px;
    background-position: center top;
    background-repeat: no-repeat;
    background-size: cover;
    background-attachment: fixed;
    position: fixed;
}
.menu{
width: 400px;
float: left;
height: 70px;
}
ul{
float: left;
display: flex;
justify-content: center;
align-items: center;
}
ul li{
list-style: none;
margin-left: 62px;
margin-top: 27px;
font-size: 20px; 
}
ul li a{
text-decoration: none;
color: black;
font-family: Arial;
font-weight: bold;
transition: 0.4s ease-in-out;
}
ul li a:hover{
color:#d4eb7a;
}
</style>
</head>
<body>
<div class = "menu">
<ul>
<li><a href="/adminlogins/adminloginform">Admin Login</a></li>
<li><a href="/employeedetails/employeeloginform">Employee Login</a></li>
</ul>
</div>
</body>
</html>