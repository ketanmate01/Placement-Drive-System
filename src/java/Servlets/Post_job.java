package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post_job
 */
@WebServlet("/post_job")
public class Post_job extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	


	Connection con = null;
	PreparedStatement stmt = null;
	
	@Override
	public void init() throws ServletException {
		try {
			con = (Connection) getServletContext().getAttribute("connection");
			
			stmt = con.prepareStatement("insert into post(c_name,job_profile,salary,email,hsc,grade,day,time,venue) values(?,?,?,?,?,?,?,?,?)");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		 PrintWriter pw = response.getWriter(); 
			
			
		try
		{
		
			
			String cname = request.getParameter("c_name");  
			String j_profile = request.getParameter("j_profile");
			int	   salary = Integer.parseInt(request.getParameter("salary"));
			String email = request.getParameter("email");
			float hsc = Float.parseFloat(request.getParameter("hsc"));
			float grade = Float.parseFloat(request.getParameter("grade"));
			String date = request.getParameter("day");
			String time = request.getParameter("time");
			String venue = request.getParameter("venue");
			
		
			stmt.setString(1, cname);
			stmt.setString(2, j_profile);
			stmt.setInt(3, salary);
			stmt.setString(4,email);
			stmt.setFloat(5, hsc);
			stmt.setFloat(6, grade);
			stmt.setString(7, date);
			stmt.setString(8, time);
			stmt.setString(9, venue);
			
			
		
		int i = stmt.executeUpdate();
		
		
		
		 
        if(i!=0){  
        	 
        
           response.sendRedirect(response.encodeRedirectURL("company_dashboard.jsp"));


         }  
         else{  
          pw.println("unsuccesfully data inserted");
          }  
       
		
		}
		catch(Exception e)
		{
			pw.println(e);
		}
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
		
		
		
		
	
	
	
	
	
	
	
	
	@Override
	public void destroy() {
		try {
			
			if(stmt != null)
				stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
