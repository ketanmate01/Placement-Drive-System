package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/studentregistration")
public class StudentRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	
	Connection con = null;
	PreparedStatement stmt = null;
	
	@Override
	public void init() throws ServletException {
	
			con = (Connection) getServletContext().getAttribute("connection");
			
			System.out.println("inside student Register servlet");
			
	
		
		
	}


	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 PrintWriter pw = response.getWriter(); 
		
		
		try
		{
			
			int id = Integer.parseInt(request.getParameter("id"));  
			String fname = request.getParameter("fname");  
			String lname = request.getParameter("lname");
			String email = request.getParameter("email");
			String gender=request.getParameter("gender");
			String contact=request.getParameter("contact");
			String city  = request.getParameter("city");
			String address  = request.getParameter("address");
			int yop  =Integer.parseInt( request.getParameter("yop"));
			float aggrigate  = Float.parseFloat(request.getParameter("aggrigate"));
			String department  = request.getParameter("department");
			float hsc_precent  = Float.parseFloat(request.getParameter("hsc_percent"));
			String username  = request.getParameter("username");
			String password  = request.getParameter("password");
			
		
		
			
			stmt = con.prepareStatement("insert into std_reg_temp(id,fname,lname,email,gender,contact,city,address,yop,aggrigate,department,hsc_percent,username,password) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			
			// set the values  into queary
			
		stmt.setInt(1,id);
		stmt.setString(2, fname);
		stmt.setString(3, lname);
		stmt.setString(4, email);
		stmt.setString(5, gender);
		stmt.setString(6,contact);
		stmt.setString(7, city);
		stmt.setString(8, address);
		stmt.setInt(9, yop);
		stmt.setFloat(10, aggrigate);
		stmt.setString(11, department);
		stmt.setFloat(12, hsc_precent);
		stmt.setString(13, username);
		stmt.setString(14, password);
		
		
			
		
		
		

         int i = stmt.executeUpdate();
       
        
         if(i!=0){  
           pw.println("Record has been inserted") ;
          
           
           
           
           response.sendRedirect(response.encodeRedirectURL("student_login.jsp"));


         }  
         else{  
           pw.println("failed to insert the data");
           
          }  
       
		
		}
		catch(Exception e)
		{
			pw.println(e);
		}
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
public void destroy() {
	
	
	
	try {
		
		if(stmt != null)
			stmt.close();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	
		
	}
}
