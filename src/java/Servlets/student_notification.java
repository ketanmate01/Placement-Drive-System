package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class student_notification
 */
@WebServlet("/student_notification")
public class student_notification extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
		
	
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
    
    try {
			con = (Connection) getServletContext().getAttribute("connection");
			
			stmt1 = con.prepareStatement ("select aggrigate,hsc_percent from student_info where username= '"+s+"' ");//write queary
                        
                       rs1=stmt1.executeQuery();
                       if(rs1.next())
                       {
                           
                          Float aggri= rs1.getFloat(1);
                            Float hsc=       rs1.getFloat(2);
                           stmt2=con.prepareStatement("select c_name,day,time,venue from post where grade<="+aggri+ "and hsc<="+hsc);
                           
                            rs2=stmt2.executeQuery();
                           
                           
                           PrintWriter out = response.getWriter();
	
	
        out.println("<html>\n" +
"<head>\n" +
"   " +
"</head>\n" +
"<body>");
	
        String cssLocation = request.getContextPath() + "t_style.css";
    String cssTag = "<link rel='stylesheet' type='text/css' href='" + cssLocation + "'>";
    
   out.println(" <link rel=\"stylesheet\" type=\"text/css\" href=\"t_style.css\">");
   
           String csLocation = request.getContextPath() + "cstyle.css";
    String cssTg = "<link rel='stylesheet' type='text/css' href='" + csLocation + "'>";
    
   out.println(" <link rel=\"stylesheet\" type=\"text/css\" href=\"cstyle.css\">");
   
   
   String cssLocatio = request.getContextPath() + "dash_style.css";
    String cssTa = "<link rel='stylesheet' type='text/css' href='" + cssLocatio + "'>";
    
   out.println(" <link rel=\"stylesheet\" type=\"text/css\" href=\"dash_style.css\">");	
   
   
   String jsLocatio = request.getContextPath() + "dash_js.js";
    String jsTa = "<script type=\"text/javascript\" src='"+ jsLocatio +"'></script>";
    
   out.println(" <script type=\"text/javascript\" src=\"dash_js.js\"></script>");
    while(rs2.next()){
        String cname= rs2.getString(1);
		
		String day = rs2.getString(2);
		String time   = rs2.getString(3);
		String venue   = rs2.getString(4);
        
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
"<div class=\"main-container\">\n" +
"  <section id=\"timeline\" class=\"timeline-outer\">\n" +
"    <div class=\"container\" id=\"content\">\n" +
"      <div class=\"row\">\n" +
"        <div class=\"col s12 m12 l12\">\n" +
"          <h1 class=\"blue-text lighten-1 header\"> Timeline</h1>\n" +
"          <ul class=\"timeline\">\n" +
"            <li class=\"event\" >\n" +
"              <h3>"+cname+"</h3>\n" +
"              <p class=\"uppercase\">\n" +
"                  VENUE:"+venue+" \n" +
"                </p>\n" +
"                <p>\n" +
"                    DATE:"+day+"\n" +
"                </p>\n" +
        "                <p>\n" +
"                    DATE:"+time+"\n" +
"                </p>\n" +
"            </li>\n" +
"            \n" +
"            \n" +
"          </ul>\n" +
"        </div>\n" +
"      </div>\n" +
"    </div>\n" +
"  </section>\n" +
" \n" +
"</div>\n" +

"</main>\n" +
"</body>"+
               "");
    }
	
	
	
	/*while(rs2.next()){
		
		String cname= rs2.getString(1);
		
		String day = rs2.getString(2);
		String time   = rs2.getString(3);
		String venue   = rs2.getString(4);
		
		
		out.println("<tr><td>" + cname +                      "</td><td>"     +  day  +         "</td><td>"+ time +  "</td><td>"+ venue +  "</td></tr>");//welcome .jsp here 1 accept pahe and 1 is reject page  available
	}*/
	
	out.println("</table>");
	

	
	
	out.println("</body></html>");
	

                           
                       }
                       
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   
  
    
    
    
    
    
    
    
}
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
