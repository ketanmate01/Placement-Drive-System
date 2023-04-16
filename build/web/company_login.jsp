<%-- 
    Document   : login
    Created on : Sep 5, 2018, 4:54:03 AM
    Author     : ADEPT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Login_Page</title>
</head>
<style>
    
    @charset "utf-8";
/* CSS Document */

body{
	margin:0;
	padding:0;
	font-family:  "Times New Roman";
	
           
	
}
#video-container{
    width: 100%;
    height:100%;
    overflow:hidden;
    position:relative;
    
}

video{
   background-position: center;
    width:100%;
    height:100%;
    
}

.box{
	width: 300px;
	padding: 40px;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%,-50%);
	background: rgba(0,0,0,0.7);
	text-align: center;
        
	
}

.box h1{
	color: white;
	font-weight: 500;
	
	
}

.box input[type="text"], .box input[ type="password"]{
	border: 0;
	background: none;
	display: block;
	margin: 20px auto;
	text-align: center;
	border: 2px solid #3498db;
	padding: 14px 10px;
	width: 200px;
	outline: none;
	color: white;
	border-radius: 24px;
	transition: 0.25s;
	
}

.box input[type="text"]:focus, .box input[ type="password"]:focus
{
	width: 280px;
	border-color: crimson;
}

.box input[type="submit"]
{
	border: 0;
	background: none;
	display: block;
	margin: 20px auto;
	text-align: center;
	border: 2px solid crimson;
	padding: 14px 40px;
	outline: none;
	color: white;
	border-radius: 25px;
	transition: 0.25s;
	cursor: pointer;
	margin-left: 25px;
	
}

.box input[type="submit"]:hover
{
	background-color: dodgerblue;
	
}

.box input[value="Login"] {
	font-family:  "Times New Roman";
	font-size: 16px;
	
}

button{
	color: white;
	border: 0;
	background: none;
	display: block;
	margin: 20px auto;
	text-align: center;
	border: 2px solid crimson;
	padding: 14px 40px;
	outline: none;
	color: white;
	border-radius: 25px;
	transition: 0.25s;
	cursor: pointer;
	margin-right: 10px;
	margin-right: 10px;
	margin-top: -67px;

}

button a {
	color: white;
	text-decoration: none;
}


button:hover{
	background-color: dodgerblue;
	
}
    
</style>
    

<body>
<div id="video-container">
    <video preload="auto" autoplay="autoplay" type="video/mp4" src="Blue.mp4" loop ></video>
<form class="box" action="companylogin" method="post">
	<h1>LOGIN</h1>
	<input type="text" name="username" placeholder="Username">
	<input type="password" name="password" placeholder="Password">
	<input type="submit" name="" value="Login">
	<button type="button" class="btn btn-default"><a href="company_registration.jsp">Register</a></button>
	
	
</form>
</div>
</body>
</html>
