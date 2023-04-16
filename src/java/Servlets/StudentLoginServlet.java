 package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/studentlogin")
public class StudentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con = null;
	PreparedStatement stmt = null;
	
	@Override
	public void init() throws ServletException {
		try {
			con = (Connection) getServletContext().getAttribute("connection");
			
			stmt = con.prepareStatement("select * from std_login where username=? and password=?");
		} catch (SQLException e) {
			e.printStackTrace();
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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
ResultSet rs = null;
		
		try {
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			stmt.setString(1, username);
			stmt.setString(2, password);
			
			rs = stmt.executeQuery();
			
			PrintWriter out = response.getWriter();
			
			out.println("<html><body>");
			
			if(rs.next()){
					
				HttpSession session = request.getSession();
                                session.setAttribute("username", username);
				
				response.sendRedirect(response.encodeRedirectURL("stu_dash.jsp"));//url mapping of that next page of student login
			}
			else{
				
				RequestDispatcher rd = request.getRequestDispatcher("student_login.jsp");
				
				out.println("Invalid username / password");
				rd.include(request, response);
				
			}
			
			out.println("</body></html>");
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs != null)
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
