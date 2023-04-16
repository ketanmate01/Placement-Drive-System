package Servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class acceptCompaney
 */
@WebServlet("/acceptCompaney")
public class acceptCompaney extends HttpServlet {
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
		String id=request.getParameter("id");
                
		
		String A="insert into comp_login(select username,password from comp_reg_temp where register_id="+id+")";
		String B="insert into company_info(select * from comp_reg_temp where register_id="+id+")";
		String C="delete from comp_reg_temp where register_id="+id;
		String D="create table  c_"+id+"(cname varchar(50),job_profile varchar(50),username varchar(20),email varchar(50))";
	
		
		
		
		
		stmt.addBatch(A);
		stmt.addBatch(B);
		stmt.addBatch(C);
                stmt.addBatch(D);
		
	int [] arr=stmt.executeBatch();

		boolean commitFlag = true;
		
		if(arr.length == 4){
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
			
			
		response.sendRedirect(response.encodeRedirectURL("verifycompany"));

			}
		
	
}
