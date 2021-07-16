package com.demo.checkboxEmployee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class employee
 */
//@WebServlet("/employee")
public class employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public employee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//capture the values entered by the user
	   String  name = request.getParameter("name");
	   String  basic = request.getParameter("salary"); 
		 
	   String skill_P = request.getParameter("c1");
	   String skill_A =request.getParameter("c2");
	   String skill_C =request.getParameter("c3");
	   
		int basicSal = (int)Integer.parseInt(basic);
		 
	    
		out.println("<p>"+"Employee Name is  &nbsp  :"+name);
		float hra=.1f*basicSal;
		float Da=.12f*basicSal;
		int totSal=(int)(basicSal+hra+Da);
	    out.println("<p>"+"Total Salary is   &nbsp   &nbsp :"+totSal);
		
	   out.println("<p>"+"Employee Skills are   &nbsp  &nbsp :"+skill_P+" "+skill_A+" "+skill_C);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
