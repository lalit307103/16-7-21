package com.demo.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HttpSessionDemo
 */
//@WebServlet("/HttpSessionDemo")
public class HttpSessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpSessionDemo() {
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
		PrintWriter out = response.getWriter();
		HttpSession session; //reference
		session = request.getSession();//create a session object
		//check whether a request has gone to the server
		//check wheather the request is new or first req
		
		if(session.isNew())
		{
			//set the attribute  for the session object
			session.setAttribute("count",new Integer(1));
			out.println("count is 1");
			//get the session id
			out.println("session id is"+session.getId());
		}
		else {
			//for the 2nd,3rd,4th.........nth request
			//retrive the value associated with the session key
			Integer c = (Integer)session.getAttribute("count");
			//increment the value
			++c;
			//update the count in the session key
			
			session.setAttribute("count", c);
			
			//display the count 
			out.println("count is "+c);
			
			//get the session id
		out.println("session id is"+session.getId());
	    out.println ("maximum idle time"+session.getMaxInactiveInterval())	;
		
		//invalidate method session object.invalidate will killed all the session object 
	    //that specifically used for logout.
			
			
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
