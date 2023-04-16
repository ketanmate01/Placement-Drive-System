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
@WebServlet(name = "StudentList", urlPatterns = {"/stdlist"})
public class StudentList extends HttpServlet {

   
    
    
    
    
	
	
	Connection con = null;
	PreparedStatement stmt,stmt1,stmt2 = null;
        ResultSet rs,rs1,rs2=null;
	
	@Override
	public void init() throws ServletException {
	
			con = (Connection) getServletContext().getAttribute("connection");
			
			System.out.println("inside the student list in componey dashboard");
			
	
		
		
	}


	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
            String id = null;
		
            try {
                HttpSession session=request.getSession(false);
                
                String  s=(String)session.getAttribute("username");
                
                System.out.println(s);
                
                
                PrintWriter out = response.getWriter();
                
                
                
                
                stmt=con.prepareStatement("select register_id from company_info where username='"+s+"'");
                        
                        
                        rs=stmt.executeQuery();
                        
                 if(rs.next())
                 {
                          id= rs.getString(1);
                         
                 }    
                            
                     stmt1=con.prepareStatement("select distinct(username),job_profile from c_"+id); 
                     


                            
                            
                     rs1=stmt1.executeQuery();
                     out.println("<html><head><title></title><body>");
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
    
   out.println(" <link rel=\"stylesheet\" type=\"text/css\" href=\"cstyle.css\">");	
                      out.println("<body class=\"sidebar-is-reduced\">\n" +
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
"                <div class=\"c-header-icon basket\"> <a href=\"counting\">COUNT</a></div>\n" +
"                <div class=\"c-header-icon logout\"> <a href=\"logout\">SIGNOUT</a></div>\n" +
"            </div>\n" +
"               </div>\n" +
"        </div>\n" +
"    </header>\n" +
"         <div id=\"mySidenav\" class=\"sidenav\">\n" +
"  <a href=\"com_dash.jsp\">Dashboard</a>\n" +
"  <a href=\"stdlist\">Student List</a>\n" +
"  <a href=\"post_vacancy.jsp\">Post Vacancy</a>\n" +
"    <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n" +
"</div>\n" +

"</body>\n" +
"<main class=\"l-main\">\n" +
"    <div class=\"content-wrapper content-wrapper--with-bg\">\n" +""
                             
                            
                              + "<div class=\"container\">\n" +

                              
                              
                              
                              
                              
                              
                              "  <div class=\"table-wrapper\">\n" +
"    <div class=\"table-title\">\n" +
"      <div class=\"row\">\n" +
"        <div class=\"col-sm-6\">\n" +
"          <h2>&nbsp;&nbsp;&nbsp; Student List </b></h2>\n" +

"        </div>\n" +
//"      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href='logout'>SignOut</a> \n" +
"      </div>\n" +
"    </div>\n" +
"    <table class=\"table table-striped table-hover\">\n" +
"      <thead>\n" +
"        <tr>\n" +
"         \n" +
"            <th><font size=\"5px\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Id</th>\n" +
"          <th><font size=\"5px\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;First_Name</th>\n" +
"          <th><font size=\"5px\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Last_Name</th>\n" +
"          <th><font size=\"5px\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Email</th>\n" +
"          <th><font size=\"5px\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Department</th>\n" +
  "        <th><font size=\"5px\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Job_Profile</th>\n" +
"        </tr>\n" +
"      </thead>\n" +
"      <td>\n" +
"          \n" +
"      </td>\n" +
"     \n" +
"    \n" +
"    ");
	
       
                     while(rs1.next())
                         
                     {
                         
                         String std=rs1.getString(1);
                        String j_profile=rs1.getString(2);
                         
                         
                         stmt2=con.prepareStatement(" select id,fname,lname,email,department from student_info where username='"+std+"'");
                        
                         rs2=stmt2.executeQuery();
                      
                        
                      while(rs2.next()){
                         
                          
                       String s_id=  rs2.getString(1);
                        String fname= rs2.getString(2);
                            
                         String lname=  rs2.getString(3);
                           String email= rs2.getString(4);
                             String department= rs2.getString(5);
                         
                            
                          
                          
                     
		out.println("<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+s_id+"</td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+fname+"</td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+lname+"</td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href='em.jsp?email="+email+"'>"+email+"&nbsp;&nbsp;</a></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+department+"</td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+j_profile+"</td></tr>");
	}
	
	
                         
                         
                    
                     
                     
                     
                     
                     }
                     
                          out.println("</table>");  
                            
                            
                
                        } catch (SQLException ex) {
                Logger.getLogger(StudentList.class.getName()).log(Level.SEVERE, null, ex);
            }
         
            
                
                
                 
		
		
		
		
		
	}

	
}
	
	
	
	
	
	
	
