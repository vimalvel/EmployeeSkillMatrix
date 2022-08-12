<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Skill Page</title>
<link rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
    font-family: Arial, Helvetica, sans-serif;
}
body
{
    background-image:
        url("https://thumbs.dreamstime.com/b/coach-motivation-to-skills-improvement-education-concept-training-leadership-human-abilities-236278779.jpg");
    height: 768px;
    width: 1366px;
    background-position: center top;
    background-repeat: no-repeat;
    background-size: cover;
    position: relative;
}
.navbar {
    overflow: hidden;
    background-color: #354e78;
}

.navbar a {
    float: left;
    font-size: 16px;
    color: white;
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
    color: white;
    padding: 14px 16px;
    background-color: inherit;
    font-family: inherit;
    margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
    background-color: #2c3999;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #6f7bd6;
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
    background-color: #a1aac2;
}

.dropdown:hover .dropdown-content {
    display: block;
}
</style>
</head>
<body>
<body>
<div class="navbar">
    <div class="dropdown">
            <button class="dropbtn">
                Admin <i class="fa fa-caret-down"></i>
            </button>
             <div class="dropdown-content">
                <a href="/adminlogins/addadminloginform">Add a new admin</a> 
                <a href="/adminlogins/adminlist">View all admins details</a>                             
        </div>
        </div>
        <div class="dropdown">
            <button class="dropbtn">
                Employee <i class="fa fa-caret-down"></i>
            </button>
             <div class="dropdown-content">
                <a href="/employeedetails/addemployeedetailsform">Add Employee Details</a> 
                <a href="/employeedetails/employeelist">Employee Details</a>                             
        </div>
        </div>
        <div class="dropdown">
            <button class="dropbtn">
                Skills <i class="fa fa-caret-down"></i>
            </button>
             <div class="dropdown-content">
                <a href="/skills/addskillsform">Add Skills To Employee</a> 
                <a href="/skills/skilllist">Edit Skills</a>                             
        </div>
        </div>
        <div class="dropdown">
            <button class="dropbtn">
                Employee Test Details <i class="fa fa-caret-down"></i>
            </button>
             <div class="dropdown-content">
                <a href="/employeetest/addemployeetestform">Add New Test</a> 
                <a href="/employeetest/employeetestlist">Edit Employee Test Details</a>                             
        </div>
        </div>
			<div class="dropdown">
            <button class="dropbtn">
                Exam Details <i class="fa fa-caret-down"></i>
            </button>
             <div class="dropdown-content">
                <a href="/examdetails/addexamdetailsform">Add New Exam Details</a> 
                <a href="/examdetails/examlist">Edit Exam Details</a>                             
        </div>
        </div>
			<div class="dropdown">
            <button class="dropbtn">
               Employee Test Status <i class="fa fa-caret-down"></i>
            </button>
             <div class="dropdown-content">
                <a href="/testemployeedetails/addemployeetestdetails">Add New Employee Test Status </a> 
                <a href="/testemployeedetails/testemployeedetailslist">Edit Employee Test Status</a>                             
        </div>
        </div>
			<div class="dropdown">
            <button class="dropbtn">
               Employee Skill Details <i class="fa fa-caret-down"></i>
            </button>
             <div class="dropdown-content">
                <a href="/employeeskilldetails/addemployeeskilldetailsform">Add New Employee Skill Details </a> 
                <a href="/employeeskilldetails/employeeskilldetailslist">Edit Employee Skill Details</a>                             
        </div>
        </div>
		</div>
</body>
</body>
</html>