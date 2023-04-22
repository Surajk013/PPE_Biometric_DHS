package com.priya.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.priya.DAO.AdminDAO;

public class Changepassword extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException 
		{
	try
	{
		
		System.out.println("its came inside the servlet>>>>>>>");
        boolean flag=false;
        HttpSession session=req.getSession();
		String uname=(String)session.getAttribute("uname");
		System.out.println("uname>>>>>>>>>>"+uname);
		String oldpwd=req.getParameter("oldname");
		System.out.println("oldpwd>>>>>>>>>>"+oldpwd);
		String newpwd=req.getParameter("newname");
		System.out.println("newpwd>>>>>>>>>>"+newpwd);
		flag=AdminDAO.changepassword(uname,oldpwd,newpwd);
		if(flag)
		{
		RequestDispatcher rd=req.getRequestDispatcher("/jsp/admin/ChangePassword.jsp?no=1");
		rd.forward(req, resp);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("/jsp/admin/home.jsp?no=2");
			rd.forward(req, resp);
		}
		
	}
	catch (Exception e)
	{
	System.out.println(e);
	}
}
}
