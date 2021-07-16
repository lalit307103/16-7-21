package com.demo.retrivecheckbox;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.pool.OracleDataSource;

 
/**
 * Servlet implementation class retrivecheckbox
 */
//@WebServlet("/retrivecheckbox")
public class retrivecheckbox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public retrivecheckbox() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at:    \n").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//capture the values entered by the user
		
	 //  String studid = request.getParameter("searchid");
	    OracleDataSource ods;
		Connection con;
	   String qry2="select * from checkbox"; 
		PreparedStatement prp;
		ResultSet rs;
	   	try {
			ods=new OracleDataSource();
			ods.setUser("system");
			ods.setPassword("test");
			ods.setDriverType("thin");
			ods.setPortNumber(1521);
			ods.setDatabaseName("xe");
			ods.setServerName("localhost");
			
			con=ods.getConnection();
			prp=con.prepareStatement(qry2);
			
			//looping through the result set
			//set IN parameters
			// prp.setString(1, studid);
			 rs=prp.executeQuery();
			  out.println("     Available courses   :");
			 while(rs.next()) {
			 out.println(" "+rs.getString("cname")+"<input type= checkbox name= c1  value="+rs.getString("cname")+">");
			//out.println("<table><table Border =1><tr><td>id</td><td>name</td><td>gender</td><td>sub</td></tr><tr><td>"+rs.getString(1) +" </td> <td> "+rs.getString("sname")+"</td><td>"+rs.getString("sgender")+"</td><td>"+rs.getString("sub")+" </td> </tr></table>");
			
			//if(rs.next())
			//out.println("name is "+rs.getString(1));
			//else
			//out.println("row is not selected");
			}
			}
		catch (Exception e){
			 	e.printStackTrace();
			
		}
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
