/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PRASAD
 */
@WebServlet(name = "counting", urlPatterns = {"/counting"})
public class counting extends HttpServlet {


        Connection con = null;
	PreparedStatement stmt1,stmt2 = null;
	
        
        
        
        
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
                        
                     else   if(stmt1!= null)
                        {
                            stmt1.close();
                        }
                        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    String totalCount=null;
String id=null;
            
            try {
                ResultSet rs1,rs2= null;
                HttpSession session=request.getSession(false);
                String  s=(String)session.getAttribute("username");
                System.out.println(s);
                PrintWriter out = response.getWriter();
                
                
                
                stmt1=con.prepareStatement("select register_id from company_info where username='"+s+"'");
                rs1=stmt1.executeQuery();
                if(rs1.next())
                {
                    id= rs1.getString(1);
                    
                }
                
                
                           
                     stmt1=con.prepareStatement("select count(distinct(username)),job_profile   from c_"+id +" group by job_profile"); 
                     
                  
                            
                            
                     rs2=stmt1.executeQuery();
                     out.println("<html><head><title></title><body>");
                     out.println("<table><tr><th>&nbsp;JOB PROFILES</th> <th> COUNT</th></tr>");
	   
                     while(rs2.next())
                         
                     
                     {
                         
                       String   J_P =   rs2.getString(2);  
                       String   COUNT =    rs2.getString(1); 
                      
                       
                        out.println("<tr><td>"+J_P+"</td><td>"+COUNT+"</td></tr>");
                        
                         
                      }
                        
                      
                     
                     
                     
            } catch (SQLException ex) {
                Logger.getLogger(counting.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
                
                
                
                
                
                
                
           
        }
}
  
          
                
			
		
	
