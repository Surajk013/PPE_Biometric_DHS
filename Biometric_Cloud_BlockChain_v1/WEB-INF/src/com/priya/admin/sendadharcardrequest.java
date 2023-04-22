package com.priya.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.priya.DAO.AdminDAO;
import com.symmetric_AES.AESCrypt;
import com.util.biometric.Utilityjava;

public class sendadharcardrequest extends HttpServlet  
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException 
		{
	
	try
	{
		String defaultverification="unverified";
		System.out.println("its came inside the checkadharcard");
		String adharno=req.getParameter("adharno");
		System.out.println("///////////////adharno//////////////////"+adharno);
		
		String verify=AdminDAO.checkverificationstatus(adharno);
		
		boolean flag=defaultverification.equals(verify);
		
		if(!flag)
		{
		
		boolean request=AdminDAO.trancaterequest(adharno);
	//boolean adharnoold=AdminDAO.updateadhardetails(adharno);
		
	//	System.out.println("//////////////aname///////////////////"+adharnoold);
		
	//	boolean adharnoold=AdminDAO.updateadhardetails(adharno);
		
	//	System.out.println("//////////////aname///////////////////"+adharnoold);
		
	//	if(adharnoold)
			
		//{
		
			RequestDispatcher rd=req.getRequestDispatcher("/jsp/admin/adharrequestdetails.jsp?no=2");
			rd.forward(req, resp);
		
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("/jsp/admin/home.jsp?no=4");
			rd.forward(req, resp);
		}
		
		
	}
	catch (Exception e) 
	{
		System.out.println(e);
	}
	
	
        }

}
