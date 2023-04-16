package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
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
import javax.servlet.http.HttpSession;







@WebServlet("/accept")
public class accept extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	Connection con = null;
	Statement stmt = null;
	
		
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
		
		stmt =con.createStatement(
		ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		

		
		con.setAutoCommit(false);
		
		
		//stmt = con.prepareStatement("insert into std_login(select username,password from std_reg_temp where id=?)");
		int id = Integer.parseInt(request.getParameter("id"));
		
		String A="insert into std_login(select username,password from std_reg_temp where id="+id+")";
		String B="insert into student_info(select * from std_reg_temp where id="+id+")";
		String C="delete from std_reg_temp where id="+id;
			
		
		
		
		
		stmt.addBatch(A);
		stmt.addBatch(B);
		stmt.addBatch(C);
		
		
		int [] arr=	stmt.executeBatch();

		boolean commitFlag = true;
		
		if(arr.length == 3){
			for(int count : arr){
				if(count == 0){
					commitFlag = false;
				}
			}
			
			if(commitFlag)
				con.commit();
			else
				con.rollback();
			
		}else{
			con.rollback();
		}
		
		
			//String id = request.getParameter("id");
			
			
			//	stmt.setString(1, id);
				
			//	rs = stmt.executeQuery();
				
				System.out.println("execuete");
				
			//	con.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		response.sendRedirect(response.encodeRedirectURL("verifystudent"));

			}
		
	
}
