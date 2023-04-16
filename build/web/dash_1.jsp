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
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="dstyle.css" >
    </head>

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
  <a href="sortcompany">Company List</a>

    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
</div>




     


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
