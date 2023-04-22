package com.priya.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.priya.DAO.UserDAO;
import com.priya.global.Global;

public class UserLogin extends HttpServlet 
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException 
		{
	
	try
	{
		
		String uname=req.getParameter("username");
		String pwd=req.getParameter("password");
		
		UserDAO adminDAO=UserDAO.initialize();
		boolean result=adminDAO.loginCheck(uname, pwd);
		if(result)
		{
			RequestDispatcher rd=null;
			HttpSession hs=req.getSession();
			hs.setAttribute("uname", uname);
			hs.setAttribute(Global.STATUS, Global.TRUE);
			rd=req.getRequestDispatcher("/jsp/user/home.jsp?no=1&name="+uname);
			rd.forward(req,resp);
		}
		else
		{
			resp.sendRedirect("index.jsp?no=1");
		}
		
		
		
		
	}
	
	catch (Exception e) 
	{
		System.out.println(e);
	}
}
}
