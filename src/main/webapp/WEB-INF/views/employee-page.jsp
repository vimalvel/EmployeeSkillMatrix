<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
    font-family: Arial, Helvetica, sans-serif;
}
body
{
    background-image:
        url("https://i.pinimg.com/originals/9d/42/a4/9d42a4deb737a0b757a48e0b2d635eb4.jpg");
    height: 768px;
    width: 1366px;
    background-position: center top;
    background-repeat: no-repeat;
    background-size: cover;
    background-attachment: fixed;
    position: fixed;

}
.navbar {
    overflow: hidden;
    background-color: #171ee6;
    }

.navbar a {
    float: left;
    font-size: 16px;
    color: black;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}
.dropdown {
    float: left;
    overflow: hidden;
}

.dropdown .dropbtn {
    font-size: 16px;
    border: none;
    outline: none;
    color: #e6e6df;
    padding: 14px 16px;
    background-color: inherit;
    font-family: inherit;
    margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
    background-color: #171ee6;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #099ce6;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
    z-index: 1;
}

.dropdown-content a {
    float: none;
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {
    background-color: #171ee6;
}

.dropdown:hover .dropdown-content {
    display: block;
}
</style>
</head>
<body>
<div class="navbar">
        </div>
        <div class="dropdown">
            <button class="dropbtn">
                Employee <em class="fa fa-caret-down"></em>
            </button>
             <div class="dropdown-content">
                <a href="/employeedetails/getemployeeiddetails?id=${employeeid}">Check Employee Mark</a>                             
        </div>
        </div>
         <div class="dropdown">
            <button class="dropbtn">
                Employee Test Details <em class="fa fa-caret-down"></em>
            </button>
             <div class="dropdown-content">
                <a href="/employeedetails/getemployeeidtestdetails?id=${employeeid}">Check Employee Status</a> 
        </div></div>
</body>
</html>