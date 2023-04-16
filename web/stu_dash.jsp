<%-- 
    Document   : dash
    Created on : 18 Oct, 2018, 1:42:11 PM
    Author     : ketan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student_dashboard</title>
        <link rel="stylesheet" type="text/css" href="dstyle.css" >
    </head>
    <style>
        body{
            color:white;
            border-color: black;
        }
        .l-main h1{
            color: white;
            font-size: 45px;
            margin-left:25%;
            
        }
        l-
        #sidebar {
  position:fixed;
  width: 200px;
  height: 100%;
  background:#151719;
  left: -200px;
  color: black;
  
}
.l-header{
    background-color:rgb(0,0,0,0.2);
    border-color: 1px solid black;
}
.l-header__inner{
    border-color: black;
    border-left-color:black; 
    border-right -color:black;
}

.header-icons-group a{
    background-color: rgba(255,69,0, 0.8);
    color: white;
}
#sidebar.active {
  left: 0px;
}

#sidebar ul li {
  color:rgba(230,230,230,0.9);
  list-style:none;
  color: black;
  padding: 15px 10px;
  border-bottom: 1px solid rgba(100, 100, 100, 0.3);
  
}

#sidebar .toggle-btn {
  position: absolute;
  left: 230px;
  top 200px;
}

#sidebar .toggle-btn span {
  display: block;
  width: 30px;
  height: 5px;
  background-color: orangered;
  margin: 4px 0px;
}
.sidenav {
    height: 100%;
    width: 0;
    position: fixed;
    z-index: 1;
    top: 0;
    left: 0;
    color: black;
    background-color:orangered;
   
    overflow-x: hidden;
    transition: 0.5s;
    padding-top: 60px;
}

 .sidenav a {
      padding: 28px 28px 28px 55px;
      margin-top:20%;
      color: black;
      text-decoration: none;
      font-size: 25px;
      color: black;
      display: block;
      transition: 0.3s;
      border-radius: 20px;
  }

.sidenav a:hover {
    color: #f1f1f1;
}

.sidenav .closebtn {
    position: absolute;
    top: 1px;
    right: 25px;
    font-size: 40px;
    margin-left: 50px;
    
}
.l-header{
    
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}

body {
  background: rgb(0,0,0,0.9);
  width: 100%;
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
}
a {
  text-decoration: none;
  color: inherit;
}
.wrapper {
    margin-left: 32%;
  max-width: 720px;
  width: 100%;
  overflow: hidden;
  padding: 2rem;
}
.wrapper:after {
  content: '';
  display: block;
  width: 100%;
  clear: both;
}
.controler {
  float: left;
  height: 50vh;
  width: 55%;
  display: flex;
  align-items: center;
}
.controler ul {
  list-style-type: none;
  width: 100%;
  margin: 0;
  padding: 0;
}
.controler ul li {
  width: 100%;
  display: block;
  position: relative;
  overflow: hidden;
}
.controler ul li > a {
  padding: 2rem 0;
  position: relative;
  animation: bounce-left 250ms ease forwards;
}
.controler ul li > a:hover {
  animation: bounce-right 350ms ease forwards;
}
.controler ul li.active > a {
  animation: bounce-right 350ms ease forwards;
}
.controler ul li:before {
  content: '';
  display: block;
  position: absolute;
  top: 20%;
  left: 0;
  opacity: 1;
  width: 4px;
  height: 60%;
  background: #05b6fb;
  transform: translateX(-8px);
  transition: transform ease-out 350ms;
}
.controler ul li:after {
  content: '';
  display: block;
  position: absolute;
  top: 20%;
  left: 0;
  opacity: 0;
  width: 100%;
  height: 60%;
  background: radial-gradient(15% 65% at -5% center, #05b6fb 0%, rgba(0, 0, 0, 0) 100%);
  z-index: -1;
  transform-origin: 0 50%;
}
.controler ul li:hover:before, .controler ul li.active:before {
  transform: translateX(0px);
}
.controler ul li.active:after {
  animation: flash 500ms ease forwards;
}
.controler .option {
  display: block;
}
.controler .option h2 {
  margin-bottom: 2vh;
  font-size: 1.75rem;
}
.controler .option h5 {
  font-size: 1.05rem;
  opacity: 0.4;
}
.visual {
  float: right;
  height: 50vh;
  width: 45%;
  display: flex;
  align-items: center;
}
.rings {
  height: 320px;
  width: 320px;
  display: inline-block;
  position: relative;
  transform-origin: 50% 50%;
  transition: transform ease 250ms;
}
.rings[data-view="one"] {
  transform: rotate(120deg);
}
.rings[data-view="two"] {
  transform: rotate(240deg);
}
.rings[data-view="three"] {
  transform: rotate(360deg);
}
.rings > div {
  width: 320px;
  height: 320px;
  border-radius: 100%;
  position: absolute;
  top: 0;
  left: 0;
  transform-origin: 50% 50%;
}
.rings .inner-ring:before, .rings .inner-ring:after {
  content: '';
  border-radius: 100%;
  position: absolute;
  top: 50%;
  left: 50%;
  transform-origin: 50% 50%;
}
.rings .inner-ring:before {
  width: calc(90% - 16px);
  height: calc(90% - 16px);
  margin-top: calc(-45% - 8px);
  margin-left: calc(-45% - 8px);
  border: 16px dotted rgba(255, 255, 255, .2);
  animation: clock 130s ease forwards infinite;
  mix-blend-mode: multiply;
}
.rings .inner-ring:after {
  width: calc(80% - 2px);
  height: calc(80% - 2px);
  margin-top: calc(-40% - 1px);
  margin-left: calc(-40% - 1px);
  border: 2px dashed rgba(255, 255, 255, .8);
  animation: counter 130s ease forwards infinite;
}
.rings .middle-ring:before, .rings .middle-ring:after {
  content: '';
  border-radius: 100%;
  position: absolute;
  top: 50%;
  left: 50%;
  transform-origin: 50% 50%;
}
.rings .middle-ring:before {
  width: calc(90% - 16px);
  height: calc(90% - 16px);
  margin-top: calc(-45% - 8px);
  margin-left: calc(-45% - 8px);
  border: 16px dotted rgba(5, 182, 251, .3);
  transform: rotate(3deg);
  animation: clock 70s ease forwards infinite;
}
.rings .middle-ring:after {
  width: calc(75% - 2px);
  height: calc(75% - 2px);
  margin-top: calc(-37.5% - 1px);
  margin-left: calc(-37.5% - 1px);
  border: 2px solid rgba(255, 255, 255, .6);
}
.rings .outer-ring:before, .rings .outer-ring:after {
  content: '';
  border-radius: 100%;
  position: absolute;
  top: 50%;
  left: 50%;
  transform-origin: 50% 50%;
}
.rings .outer-ring:before {
  width: calc(106% - 4px);
  height: calc(106% - 4px);
  margin-top: calc(-53% - 2px);
  margin-left: calc(-53% - 2px);
  border: 4px dotted rgba(5, 182, 251, .3);
  animation: clock 50s ease forwards infinite;
}
.rings .outer-ring:after {
  width: calc(100% - 2px);
  height: calc(100% - 2px);
  margin-top: calc(-50% - 1px);
  margin-left: calc(-50% - 1px);
  border: 2px solid rgba(255, 255, 255, .6);
}
@keyframes bounce-right {
  0% {
    transform: translateX(0);
  }
  50% {
    transform: translateX(1.3rem);
  }
  100% {
    transform: translateX(1rem);
  }
}
@keyframes bounce-left {
  0% {
    transform: translateX(1rem);
  }
  100% {
    transform: translateX(0);
  }
}
@keyframes flash {
  0%, 100% {
    opacity: 0;
    transform: scale(0);
  }
  30% {
    opacity: 1;
    transform: scale(1);
  }
}
@keyframes clock {
  0% {
    transform: rotate(0deg);
  }
  100% {
    transform: rotate(360deg);
  }
}
@keyframes counter {
  0% {
    transform: rotate(0deg);
  }
  100% {
    transform: rotate(-360deg);
  }
}

    </style>
     <body class="sidebar-is-reduced">
    <header class="l-header">
        <div class="l-header__inner clearfix">
            <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776;</span>
            <div class="c-header-icon has-dropdown"><i class="fa fa-bell"></i>
                <div class="c-dropdown c-dropdown--notifications">
                    <div class="c-dropdown__header"></div>
                 
                </div>
            </div>
               <div class="header-icons-group">
            <div class="group">
                <div class="c-header-icon basket"> <a href="student_notification">NOTIFICATION</a></div>
                <div class="c-header-icon logout"> <a href="logout">SIGNOUT</a></div>
            </div>
               </div>
        </div>
    </header>
         <div id="mySidenav" class="sidenav">

  <a href="stu_dash.jsp">Dashboard</a>
  <a href="profile">Profile</a>
  <a href="sortcompany1">Company List</a>

    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
</div>



<script>
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
}
</script>
     


</body>
<main class="l-main">
    <div class="content-wrapper content-wrapper--with-bg">
        <h1 class="page-title">Welcome To Student Dashboard</h1>
        <div class="wrapper">
  <div class="controler">

  <div class="visual">
    <div class="rings">
      <div class="inner-ring"></div>
      <div class="middle-ring"></div>
      <div class="outer-ring"></div>
    </div>
  </div>
</div>
       
    </div>
</main>

</body>
</html>
