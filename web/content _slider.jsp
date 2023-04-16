<%-- 
    Document   : content _slider
    Created on : 7 Oct, 2018, 4:27:55 PM
    Author     : ketan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        body  {
  margin: 0;
  padding:0;
  font-family: sans-serif;
}

ul{
  position: absolute;
  top: 0;
  left:0;
  width: 100%;
  height: 100vh;
  background: #ccc;
  margin: 0;
  padding: 0;
  
}

ul li {
  list-style: none;
  position: relative;
  width: 33.33%;
  height: 100%;
  border-right: 1px solid #000;
  float: left;
  box-sizing: border-box;
  transition: 0.5s;
  text-align:center;
  overflow:hidden;
}

ul li:nth-child(1){
  background-image:url(student.jpg);
  background-size: cover;
  background-position: left;
 }
ul li:nth-child(2){
  background-image: url(company.jpg);
  background-size: cover;
  background-position: left;
 }

ul li:nth-child(3){
     background-image: url(admin.jpg);
  background-size: cover;
  background-position: left
      right:50%;
 }

ul:hover li{
  width: 10%;
}

ul li:hover{
  width: 60%;
}

ul li .content {
  position:absolute;
  bottom:-100%;
  left:0;
  width: 100%;
  background: rgba(0,0,0, 0.8);
  box-sizing: border-box;
  color: #fff;
  opacity: 0;
  
}

ul li:hover .content{
    top:50%;
  bottom: 0;
  transition: .5s;
  transition-delay: .5s;
  opacity: 1;
}
a.animated-button:link, a.animated-button:visited {
    left:0px;
    
	position: relative;
	display: block;
        background-color:black;
        size:10px;
	margin: 20px auto 0;
	padding: 2px 15px;
        cell-padding:2px;
        text-top:10px;
        height:60px;
	color: red;
	font-size:20px;
	font-weight: bold;
	text-align: center;
	text-decoration: none;
	text-transform: uppercase;
	overflow: hidden;
	letter-spacing: .08em;
	border-radius: 50px;
	text-shadow: 0 0 1px rgba(0, 0, 0, 0.2), 0 1px 0 rgba(0, 0, 0, 0.2);
	-webkit-transition: all 1s ease;
	-moz-transition: all 1s ease;
	-o-transition: all 1s ease;
	transition: all 1s ease;
a.animated-button.victoria-two {
	border: 2px solid #D24D57;
}
a.animated-button.victoria-two:after {
	background: black;
	-moz-transform: translateX(-50%) translateY(-50%) rotate(25deg);
	-ms-transform: translateX(-50%) translateY(-50%) rotate(25deg);
	-webkit-transform: translateX(-50%) translateY(-50%) rotate(25deg);
	transform: translateX(-50%) translateY(-50%) rotate(25deg);
}


    </style>
    
    
    <body>
        
        <ul>
      <li>
        <div class="content">
          <h2>Student</h2>
          <div class="col-md-3 col-sm-3 col-xs-6"> <a href="student_login.jsp" class="btn btn-sm animated-button victoria-two"<cell padding="5px"><margin top="50px"></top>Login</a> </div>
         </div>
      </li>
      <li>
        <div class="content">
          <h2>Company</h2>
          <div class="col-md-3 col-sm-3 col-xs-6"> <a href="company_login.jsp" class="btn btn-sm animated-button victoria-two"<cell padding="5px"><margin top="50px"></top>Login</a> </div>
         </div></li>
     
      <li>
        <div class="content">
          <h2>Admin</h2>
           <div class="col-md-3 col-sm-3 col-xs-6"> <a href="admin.jsp" class="btn btn-sm animated-button victoria-two"<cell padding="5px"><margin top="50px"></top>Login</a> </div>
          
           </div>
      </li>
    </ul>
      
    
        
        
        <script>
            
        </script>
    </body>
</html>
