/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PRASAD
 */
@WebServlet(name = "StudentProfile", urlPatterns = {"/profile"})
public class StudentProfile extends HttpServlet {
	Connection con = null;
	PreparedStatement stmt1,stmt2 = null;
	ResultSet rs1,rs2 = null;
	
	@Override
	public void init() throws ServletException {
		
	}
	
	
	
	
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	

		
		
	HttpSession session=request.getSession(false);

String  s=(String)session.getAttribute("username");

    System.out.println(s);
    
    
          PrintWriter out = response.getWriter();
	
	//out.println("<html><body><a href='logout'>SignOut</a>");
	        out.println("<html>\n" +
"<head>\n" +
"   " +
"</head>\n" +
"<body>");
	
        String cssLocation = request.getContextPath() + "cstyle.css";
    String cssTag = "<link rel='stylesheet' type='text/css' href='" + cssLocation + "'>";
    
   out.println(" <link rel=\"stylesheet\" type=\"text/css\" href=\"cstyle.css\">");
   
   
   String cssLocatio = request.getContextPath() + "dash_style.css";
    String cssTa = "<link rel='stylesheet' type='text/css' href='" + cssLocatio + "'>";
    
   out.println(" <link rel=\"stylesheet\" type=\"text/css\" href=\"dash_style.css\">");	
   
   
   String jsLocatio = request.getContextPath() + "dash_js.js";
    String jsTa = "<script type=\"text/javascript\" src='"+ jsLocatio +"'></script>";
    
   out.println(" <script type=\"text/javascript\" src=\"dash_js.js\"></script>");	
   
   
       
        out.println("<html>\n" +
"<head>\n" +
"   " +
"</head>\n" +
"<body>");
        out.println(" <body class=\"sidebar-is-reduced\">\n" +
"    <header class=\"l-header\">\n" +
"        <div class=\"l-header__inner clearfix\">\n" +
"            <span style=\"font-size:30px;cursor:pointer\" onclick=\"openNav()\">&#9776;</span>\n" +
"            <div class=\"c-header-icon has-dropdown\"><i class=\"fa fa-bell\"></i>\n" +
"                <div class=\"c-dropdown c-dropdown--notifications\">\n" +
"                    <div class=\"c-dropdown__header\"></div>\n" +
"                </div>\n" +
"            </div>\n" +
"               <div class=\"header-icons-group\">\n" +
"            <div class=\"group\">\n" +
"                <div class=\"c-header-icon basket\"> <a href=\"student_notification\">NOTIFICATION</a></div>\n" +
"                <div class=\"c-header-icon logout\"> <a href=\"logout\">SIGNOUT</a></div>\n" +
"            </div>\n" +
"               </div>\n" +
"        </div>\n" +
"    </header>\n" +
"         <div id=\"mySidenav\" class=\"sidenav\">\n" +
"  <a href=\"stu_dash.jsp\">Dashboard</a>\n" +
"  <a href=\"profile\">Profile</a>\n" +
"  <a href=\"sortcompany1\">Company List</a>\n" +
"    <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n" +
"</div>\n" +

"</body>\n" +
"<main class=\"l-main\">\n" +
"    <div class=\"content-wrapper content-wrapper--with-bg\">\n" +
"     <div class=\"container\">\n" +
" <div class=\"table-wrapper\">\n" +
"    <div class=\"table-title\">\n" +
"      <div class=\"row\">\n" +
"        <div class=\"col-sm-6\">\n" +
"          <h2>&nbsp;&nbsp;&nbsp;Student Profile </b></h2>\n" +

"        </div>\n" +
"      </div> \n" +
"   </div>\n" +
"   <table class=\"table table-striped table-hover\">\n" +
"    <thead> \n" +
"      <tr>\n" +
"            <th><font size=\"5px\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;First_Name</th> \n" +
"         <th><font size=\"5px\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Last_Name</th> \n" +
"          <th><font size=\"5px\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Gender</th>\n" +
"          <th><font size=\"5px\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Department</th>\n" +
"          <th><font size=\"5px\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;HSC(%)</th>\n" +
"          <th><font size=\"5px\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Aggregate(%)</th>\n" +

                "        </tr>\n" +
"      </thead>\n" +
"      <td>\n" +
"          \n" +
"      </td>\n" +
"</main>\n" +
"</body>"+
               "");
	
	
	
	
	
		

	
    
    try {
			con = (Connection) getServletContext().getAttribute("connection");
			
			stmt1 = con.prepareStatement ("select fname,lname,gender,department,hsc_percent,aggrigate from student_info where username= '"+s+"' ");//write queary
                        
                       rs1=stmt1.executeQuery();
                       if(rs1.next())
                       {
                        String fname=   rs1.getString(1);
                        String lname= rs1.getString(2);
                         String gender=  rs1.getString(3);
                          String department= rs1.getString(4);
                           Float hsc=rs1.getFloat(5);
                         Float aggrigate= rs1.getFloat(6);
                         
                         
                         
                         
                         
                         
		out.println("<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + fname +"</td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+  lname  + "</td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ gender +  "</td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ department +  "</td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ hsc +  "</td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ aggrigate +  "</td></tr>");//welcome .jsp here 1 accept pahe and 1 is reject page  available
	
    
   
                           
                       }  
                     
                       
                        out.println("</table>");
	
	
	out.println("</body></html>");
	

                           
    
    
    }   catch (SQLException ex) {
                Logger.getLogger(StudentProfile.class.getName()).log(Level.SEVERE, null, ex);
            }
	
	
                       }
          
    
    
    
    
    
    
}
	
	
	
	
	

	
	
	