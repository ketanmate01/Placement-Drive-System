<%-- 
    Document   : company_dashboard
    Created on : Sep 5, 2018, 4:55:23 AM
    Author     : ADEPT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>

<head>
<meta charset="utf-8">
<title>Company_Dashboard</title>
<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="HandheldFriendly" content="true">
</head>


<style>
    
    @charset "utf-8";
/* CSS Document */

body {
	background-color: rgb(220,220,220);
	padding: 0;
	width: 100%;
	height: 100%;
	
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
	width: 2150px;
	margin: auto;
	margin-right: 100%;
}

.slidebar {
	width: 20%;
	min-height: 690px;
	float: left;
	border-right: 1px solid rgb(235,235,235);
	background-color: dodgerblue;
}

.slidebar ul {
	padding: 0;
	margin:0;
}
.slidebar li {
	list-style-type: none;
	margin: 0;
	position: relative;
}
.slidebar li:before {
	font-family: 'icomoon';
	speak: none;
	font-weight: normal;
	font-variant: normal;
	text-transform: none;
	position: absolute;
	display: block;
	line-height: 40px;
	color: rgb(102,102,102);
	right: 20px;
	
}



.slidebar ul a {
	margin-left: 5px;
	color: white;
	text-decoration: none;
	font:16px/40px helvetica,verdana,sans-serif;
	box-sizing:border-box;
	border-bottom: 1px solid rgb(235,235,235);
	display: block;
	box-shadow:inset 0 1px 0 rgb(255,255,255);
	text-indent: 20px;
	text-transform: capitalize;
	border-radius: 50px;
}
.slidebar li:hover a {
	background-color: black;
	box-shadow: 1px 0 0 rgb(255,255,255),inset 5px 0 0 -1px rgb(234,83,63);
}

.main {
	float: left;
	width: 50%;
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
.statusbar {
	position: absolute;
	bottom: 0;
	border-top: 1px solid rgb(235,235,235);
	width: 100%;
	padding: 0;
	margin: 0;
	background-color: rebeccapurple;
}
.statusbar li {
	list-style: none;
}
.statusbar a {
	color: rgb(102,102,102);
	text-decoration: none;
	text-align: center;
	display: block;
	border-radius: 50%;
}
.statusbar a:hover {
	background-color: dodgerblue;
}


/* Tablet Landscape */
@media screen and (max-width: 1060px) {
    #primary { width:67%; }
    #secondary { width:30%; margin-left:3%;}  
}
/* Tabled Portrait */
@media screen and (max-width: 768px) {
    #primary { width:100%; }
    #secondary { width:100%; margin:0; border:none; }
}

</style>

<body>

<div class="admin-panel clearfix">
  <div class="slidebar">
<ul>
      <li><a href="company_dashboard.jsp" id="targeted">Dashboard</a></li>
      
      <li><a href="stdlist">Student List</a></li>
      <li><a href="post_vacancy.jsp">Post Vacancy</a></li>
</ul>
  </div>
  <div class="main">
    <ul class="topbar clearfix">
     
      <li><a href="#"></a></li>
      
      <li><a href="logout">SIGNOUT</a></li>
       <li><a href="counting">COUNT</a></li> 
    </ul>
    <h1> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;WELCOME TO COMPANY DASHBOARD</h1>
  </div>
  
</div>

</body>



