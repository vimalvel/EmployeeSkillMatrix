<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Admin login page</title>
<style media="screen">
*, *:before, *:after {
	padding: 0;
	margin: 0;
	box-sizing: border-box;
}

body {
	background-image:
		url(https://2e8ram2s1li74atce18qz5y1-wpengine.netdna-ssl.com/wp-content/uploads/2017/08/shutterstock_583803589.jpg);
	background-size: 1366px 768px;
	background-color: black;
}

.background {
	width: 430px;
	height: 520px;
	position: absolute;
	transform: translate(-50%, -50%);
	left: 50%;
	top: 50%;
}

form {
	height: 450px;
	width: 350px;
	background-color: rgba(255, 255, 255, 0.13);
	position: absolute;
	transform: translate(-50%, -50%);
	top: 50%;
	left: 50%;
	border-radius: 10px;
	backdrop-filter: blur(10px);
	border: 2px solid #7b8ab5;
	box-shadow: 0 0 40px rgba(8, 7, 16, 0.6);
	padding: 50px 35px;
}

form * {
	font-family: "Sofia", sans-serif;
	font-style: oblique;
	color: black;
	letter-spacing: 0.5px;
	outline: none;
	border: none;
}

form h1 {
	font-size: 40px;
	font-weight: 700;
	line-height: 42px;
	text-align: center;
}

label {
	display: inline;
	margin-top: 20px;
	font-size: 20px;
	font-weight: 400;
}

input {
	display: block;
	height: 40px;
	width: 80%;
	background-color: rgba(255, 255, 255, 0.07);
	border-radius: 3px;
	padding: 0 10px;
	margin-top: 8px;
	font-size: 12px;
	font-weight: 200;
}

::placeholder {
	color: #000000;
}

button {
	margin-top: 50px;
	width: 50%;
	background-color: #ffffff;
	color: #080710;
	padding: 10px 0;
	font-size: 18px;
	font-weight: 600;
	border-radius: 5px;
	cursor: pointer;
	border: none;
	outline: none;
	color: rgb(255, 255, 255);
	background: #111;
	cursor: pointer;
	position: relative;
	z-index: 0;
	border-radius: 10px;
	user-select: none;
	-webkit-user-select: none;
	touch-action: manipulation;
}
button:before{
content: "";
  background: linear-gradient(
    45deg,
    #ff0000,
    #ff7300,
    #fffb00,
    #48ff00,
    #00ffd5,
    #002bff,
    #7a00ff,
    #ff00c8,
    #ff0000
  );
  position: absolute;
  top: -2px;
  left: -2px;
  background-size: 400%;
  z-index: -1;
  filter: blur(5px);
  -webkit-filter: blur(5px);
  width: calc(100% + 4px);
  height: calc(100% + 4px);
  animation: glowing-button-85 20s linear infinite;
  transition: opacity 0.3s ease-in-out;
  border-radius: 10px;
}
@keyframes glowing-button{
0% {
    background-position: 0 0;
  }
  50% {
    background-position: 400% 0;
  }
  100% {
    background-position: 0 0;
  }
}
button:after{
 z-index: -1;
  content: "";
  position: absolute;
  width: 100%;
  height: 100%;
  background: #222;
  left: 0;
  top: 0;
  border-radius: 10px;
}
</style>
</head>
<body>
	<button style="font-size: 12px; background-color: #e7e7e7; color: black; float:left; width:10% " onclick="history.back()">Go Back</button>
	<form:form action="checkadminloginform" method="post"
		modelAttribute="adminlogin">
		<label for="adminId">Admin ID : </label>
		<form:input id="adminid" path="adminId"
			placeholder="Enter Your Admin ID" />



		<label for="password"> Password : </label>
		<form:input id="password" path="password"
			placeholder="Enter Admin Password" type="password" />
		<form:button>SignIn</form:button>
		<form:button type="reset" value="Clear">Reset</form:button><br>
		${result}
	</form:form>
</body>
</html>