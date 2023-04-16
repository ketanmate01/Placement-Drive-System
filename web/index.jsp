<%-- 
    Document   : index
    Created on : 8 Oct, 2018, 10:29:04 AM
    Author     : ketan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>PLACEMENT WEBPORTAL</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link href="css/materialize.min.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <link href="css/style.min.css"       type="text/css" rel="stylesheet" media="screen,projection"/>
     <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/css/materialize.min.css">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

<!-- Custom styles for this template -->
<link href="http://designify.me/code-snippets/animated-buttons/css/btns.css" rel="stylesheet">
<link href='https://fonts.googleapis.com/css?family=Ubuntu:400,500,700' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
    </head>
        <style>
            body {
                background-image: url(img1.jpg);
  display: flex;
  min-height: 100vh;
  flex-direction: column;
}

main {
  flex: 1 0 auto;
}
h1{
    color:black;
   margin-top:-290px;
}

h1.title,
.footer-copyright a {
  font-family: 'Architects Daughter', cursive;
  text-transform: uppercase;
  font-weight: 900;
  font-color: black;
  background-color: rgb(0,0,0,0.1);
}

/* start welcome animation */

body.welcome {
   background-image: url(img1.jpg);
   height:100%;
   background-position: center;
    background-size: cover;
   background-repeat: no-repeat;
  overflow: hidden;
  -webkit-font-smoothing: antialiased;
}

.welcome .splash {
  height: 0px;
  padding: 0px;
  border: 130em solid black;
  position: fixed;
  left: 50%;
  top: 100%;
  display: block;
  box-sizing: initial;
  overflow: hidden;

  border-radius: 50%;
  transform: translate(-50%, -50%);
  animation: puff 0.5s 1.8s cubic-bezier(0.55, 0.055, 0.675, 0.19) forwards, borderRadius 0.2s 2.3s linear forwards;
}

.welcome #welcome {
  background-color:red;
  width: 56px;
  height: 56px;
  position: absolute;
  left: 50%;
  top: 50%;
  overflow: hidden;
  opacity: 0;
  transform: translate(-50%, -50%);
  border-radius: 50%;
  animation: init 0.5s 0.2s cubic-bezier(0.55, 0.055, 0.675, 0.19) forwards, moveDown 1s 0.8s cubic-bezier(0.6, -0.28, 0.735, 0.045) forwards, moveUp 1s 1.8s cubic-bezier(0.175, 0.885, 0.32, 1.275) forwards, materia 0.5s 2.7s cubic-bezier(0.86, 0, 0.07, 1) forwards, hide 2s 2.9s ease forwards;
}


.welcome header,
.welcome a.btn {
  opacity: 0;
  animation: moveIn 2s 3.1s ease forwards;
}

@keyframes init {
  0% {
    width: 0px;
    height: 0px;
  }
  100% {
    width: 56px;
    height: 56px;
    margin-top: 0px;
    opacity: 1;
  }
}

@keyframes puff {
  0% {
    top: 100%;
    height: 0px;
    padding: 0px;
  }
  100% {
    top: 50%;
    height: 100%;
    padding: 0px 100%;
  }
}

@keyframes borderRadius {
  0% {
    border-radius: 50%;
  }
  100% {
    border-radius: 0px;
  }
}

@keyframes moveDown {
  0% {
    top: 50%;
  }
  50% {
    top: 40%;
  }
  100% {
    top: 100%;
  }
}

@keyframes moveUp {
  0% {
    background: #311b92;
    top: 100%;
  }
    top: 40%;
  }
  100% {
    top: 50%;
    background:  50% {
 #039be5;
  }
}

@keyframes material {
  0% {
    background: #039be5;
  }
  50% {
    background: #039be5;
    top: 26px;
  }
  100% {
    background: #311b92;
    width: 100%;
    height: 64px;
    border-radius: 0px;
    top: 26px;
  }
}

@keyframes moveIn {
  0% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}

@keyframes hide {
  0% {
    opacity: 1;
  }
  100% {
    opacity: 0;
  }
}
a.animated-button:link, a.animated-button:visited {
    left:450px;
    top:200px;
	position: relative;
	display: block;
        background-color:black;
	margin: 40px auto 0;
	padding: 18px 25px;
        cell-padding:6px;
        text-top:2px;
        height:62px;
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
        
   
   <body class="welcome">
  <span id="splash-overlay" class="splash"></span>
  <span id="welcome" class="z-depth-4"></span>

  
  <main class="valign-wrapper">
    <span class="container grey-text text-lighten-1 ">
<h1>Welcome To Placement WebPortal</h1>
        <p class="flow-text"><font size="8px"><font color="white"></p>
        

      <blockquote class="flow-text"><background-color: black>A place where Placement is Easier  </background-color></blockquote>

      <div class="center-align">
          
          <div class="col-md-3 col-sm-3 col-xs-6"  id="login"> <a href="slider.jsp" class="btn btn-sm animated-button victoria-two" id="login"<cell padding="5px"><margin top="50px"></top>Login</a> </div>
        
                         
      </div>

    </span>
    
  </main>

  
    
</body>
</html>
