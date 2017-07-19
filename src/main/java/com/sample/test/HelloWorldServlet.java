package com.sample.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HelloWorldServlet extends HttpServlet {
	
	public void init(){
		System.out.println("HelloWorld Servlet loaded");
	}
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		
		System.out.println("I'm inside Server");
		
		req.setAttribute("info", "HelloWorld");
		
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		rd.forward(req, res);
		
	}
	
	public void destroy(){
		System.out.println("I'm shuting down");
	}

}
