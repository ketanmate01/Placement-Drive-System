<%-- 
    Document   : index
    Created on : Aug 24, 2018, 1:39:08 PM
    Author     : ADEPT
--%>

<%-- 
    Document   : index
    Created on : Sep 5, 2018, 4:51:11 AM
    Author     : ADEPT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>index</title>


</head>

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">


<style>
   
/* CSS Document */



body {
	background-color: rgb(220,220,220);
	padding: 0;
	width: auto;
	height: auto;
	
	margin: 0;
	font-size: 16px;
	font-family: sans-serif;
}
.clearfix:after {
	content: "";
	display: block;
	height: 0;
	width: 0;
	clear: both;
}
.admin-panel {
	width: 1350px;
	margin: auto;
	margin-right: 100%;
}

.main {
	float: left;
	width: 900%;
	height: 690px;
	background-color: rgb(255,255,255);
	position: relative;
	font-family: helvetica,verdana,sans-serif;
}
.main .topbar {
	border-bottom: 1px solid rgb(235,235,235);
	margin: 0;
	padding: 0;
}
.main button{
	margin-left: 90px;
	margin-right: 110px;
	padding: 20px;
	border-left: none;
	text-align: center;
	border-radius: 50px;
	border-bottom: 1px solid dodgerblue;
	border-top-color:  dodgerblue;
	text-decoration: none;
	
	
}



.topbar li {
	float: right;
	list-style: none;
}
.topbar li:first-child {float: left;}
.topbar a {
	font-family: 'icomoon';
	display: block;
	line-height: 50px;
	width: 150px;
	text-align: center;
	text-decoration: none;
	color: rgb(102,102,102);
	border-left: 1px solid dodgerblue;
	border-right: 1px solid dodgerblue;
	border-top: 1px solid dodgerblue;
	border-bottom:  1px solid dodgerblue;
	border-radius: 50px;
    
}
.topbar a:hover {
	background-color: rgb(247,247,247);
}
.topbar li:first-child a {
	border: none;
	border-right: 1px solid rgb(235,235,235);
	font-size: 16px;
	font-family: icomoon;
	width: 240px;
}


 
 
#dashboard>div {
	border: 1px solid rgb(235,235,235);
	margin-left: 30px;
	float: left;
	border-radius: 5px;
	min-width: 345px;
	height: 262px;
	display: inline-block;
}


    
</style>

<body>
<div id="loader-wrapper">
  <div id="loader"></div>
  <div class="loader-section section-left"></div>
  <div class="loader-section section-right"></div>
</div>
<div class="admin-panel clearfix">
<div class="main">
    <ul class="topbar clearfix">
     
      <li><a href="#"></a></li>
     
      <li><a href="#">SIGNOUT</a></li>
       <li></li>
    </ul>
    <h1> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; WELCOME TO &nbsp;PLACEMENT WEB-PORTAL</h1>
    <button class="w3-btn w3-white w3-border w3-round-large"><a href="student_login.jsp">STUDENT LOGIN</a></button>
    <button class="w3-btn w3-white w3-border w3-round-large"><a href="company_login.jsp">COMPANY LOGIN</a></button>
    <button class="w3-btn w3-white w3-border w3-round-large"><a href="admin.jsp">ADMIN LOGIN</a></button>
    
  </div>
  
</div>

</body>
</html>



