package com.priya.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class verification extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
{
	
	
	String mesg=req.getParameter("message");
	
	System.out.println("verification class message?????????"+mesg);
	
	
	RequestDispatcher rd=req.getRequestDispatcher("/jsp/admin/home.jsp?no=3");
	rd.forward(req, resp);
	
}
}
