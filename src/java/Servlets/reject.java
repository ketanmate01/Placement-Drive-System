package Servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class reject
 */
@WebServlet("/reject")
public class reject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	Connection con = null;
	PreparedStatement stmt = null;
	
		
	@Override
	public void destroy() {
		try {
			if(stmt != null)
				stmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ResultSet rs = null;
		
		try {
			
		con = (Connection) getServletContext().getAttribute("connection");
		
		
		
		
		stmt = con.prepareStatement("delete from std_reg_temp where id=?");
		int id=Integer.parseInt(request.getParameter("id"));
		
	   stmt.setInt(1, id);
		
					rs = stmt.executeQuery();
					
					System.out.println("execuete");
					
					con.commit();
		
		
			
			
			
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		response.sendRedirect(response.encodeRedirectURL("verifystudent"));

			}
		
	
}