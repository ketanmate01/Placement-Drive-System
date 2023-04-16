/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import com.sun.xml.messaging.saaj.soap.ver1_2.Message1_2Impl;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Clock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jboss.logging.Message;

/**
 *
 * @author PRASAD
 */
@WebServlet(name = "ApplyCompaney", urlPatterns = {"/apply"})
public class ApplyCompaney extends HttpServlet {

      
        Connection con = null;
	PreparedStatement stmt2,stmt3 = null;
	
        
        
        
        
	@Override
	public void init() throws ServletException {
            con = (Connection) getServletContext().getAttribute("connection");
		
	}
	
	
		
	@Override
	public void destroy() {
		try {
			
                        if(stmt2 != null)
                        {
				stmt2.close();
                        }
                        
                     else   if(stmt3!= null)
                        {
                            stmt3.close();
                        }
                        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    

            
            ResultSet rs2,rs3= null;
            
            
            PrintWriter Out = response.getWriter();
            
            String id = request.getParameter("id");
            String user= request.getParameter("user");
            String cname = request.getParameter("cname");
            String job_p = request.getParameter("job_profile");
            System.out.println(user);
            System.out.println(cname);
            System.out.println(job_p);
            
            
            
            try {
                stmt2=con.prepareStatement("select email from student_info where username='"+user+"'");
                
            
            rs2=stmt2.executeQuery();
            
            
            if(rs2.next())  
            {
                
              
                    String email=rs2.getString(1);
                    System.out.println(email);
                    
                    
                                      
                    stmt3=con.prepareStatement("insert into  c_"+id+"(cname,job_profile,username,email) values(?,?,?,?)");
                    
                    stmt3.setString(1, cname);
                     stmt3.setString(2 , job_p);
                      stmt3.setString(3, user);
                       stmt3.setString(4 , email);
                    
                int i=    stmt3.executeUpdate();
                    
                    
                    if(i !=0)
                    {
                        
                        
                        Out.println("you have succesfully apply for respective companey");
                        
                        response.sendRedirect(response.encodeRedirectURL("student_dashboard.jsp"));
                        
                    }
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ApplyCompaney.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        }

    
  
          
                
			
		
	
