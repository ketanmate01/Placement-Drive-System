package listener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {
	
	Connection con = null;
	
    public void contextInitialized(ServletContextEvent arg0) {
       
    	ServletContext context = arg0.getServletContext();
    	
    	String driverClassName = context.getInitParameter("driverClassName");
    	String url = context.getInitParameter("url");
    	String username = context.getInitParameter("username");
    	String password = context.getInitParameter("password");
    	
    	try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, username, password);
			
			context.setAttribute("connection", con);
			System.out.println("contextInitialized");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

	
    public void contextDestroyed(ServletContextEvent arg0) {
        try {
			if(con != null)
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
}
