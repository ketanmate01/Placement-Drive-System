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


@WebServlet("/CompanyRegistartionServlet")
public class CompanyRegistartionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	
	


	Connection con = null;
	PreparedStatement stmt = null;
	
	@Override
	public void init() throws ServletException {
		try {
			con = (Connection) getServletContext().getAttribute("connection");
			
			stmt = con.prepareStatement("insert into comp_reg_temp(register_id,c_name,email,contact,hr_name,username,password) values(?,?,?,?,?,?,?)");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		 PrintWriter pw = response.getWriter(); 
			
			
		try
		{
		
			int id = Integer.parseInt(request.getParameter("id"));
			String cname = request.getParameter("cname");  
			String email = request.getParameter("email");
			String contact = request.getParameter("contact");
			String hrname = request.getParameter("hrname");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
		
			stmt.setInt(1, id);
			stmt.setString(2, cname);
			stmt.setString(3, email);
			stmt.setString(4,contact);
			stmt.setString(5, hrname);
			stmt.setString(6, username);
			stmt.setString(7, password);
			
		
		int i = stmt.executeUpdate();
		
		
		
		
         String msg=" ";
         if(i!=0){  
        	 
           msg="Record has been inserted";
           pw.println("<font size='6' color=blue>" + msg + "</font>"); 
           
           response.sendRedirect(response.encodeRedirectURL("company_login.jsp"));


         }  
         else{  
           msg="failed to insert the data";
           pw.println("<font size='6' color=RED>" + msg + "</font>");
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
