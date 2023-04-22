/**
 * 
 */
package com.priya.DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.priya.database.Database;

public class UserDAO 
{
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	private static UserDAO adminDAO=null;
	private UserDAO()
	{
		
	}
	public static UserDAO initialize()
	{
		if(adminDAO==null)
		{
			adminDAO=new UserDAO();
		}
		return adminDAO;
	}
	public boolean loginCheck(String admin,String pass)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user where u_name='"+admin+"' and u_pass='"+pass+"'");
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("Admin Login Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminrProcess-->loginCheck(String admin,String pass): "+ e);
		}
		return flag;
	}

	public static boolean getadharno(String adharno)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user where author_no='"+adharno+"' ");
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("Adhar No is: "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdharNo-->AdharNo: "+ e);
		}
		return flag;
	}
	
	public static boolean adharrequest(String adharno,String name, String nameuser)
	{
		
		
		boolean flag=false;
		int i=0;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();

		 i=statement.executeUpdate("insert into m_request (adhar_no,adharimg_feature) values('"+adharno+"','"+name+"')");
     			
		      System.out.println("i value is>>>>>>>>>>>>>>>>>>>>>>>>"+i);
		      if(i!=0)
			{
				flag=true;
			}
			System.out.println("adhar request:-"+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in adhar request--> "+ e);
		}
		return flag;
	}
	
	
	public static ResultSet getAdharDetails(String uname,String status)
	{
		
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user where u_name='"+uname+"' and status='"+status+"'");
			String sql="select * from m_user where u_name='"+uname+"' and status='"+status+"'";
			
		System.out.println("query is>>>>>>>>>>>>>>>>>>>>>>"+sql);
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserHome Page): "+ e);
		}
		return resultSet;
	}
	public static boolean adharrequest(String adharno, String featureToEncrypt) {
		
		boolean flag=false;
		int i=0;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();

		 i=statement.executeUpdate("insert into m_request (adhar_no,adharimg_feature) values('"+adharno+"','"+featureToEncrypt+"')");
     			
		      System.out.println("i value is>>>>>>>>>>>>>>>>>>>>>>>>"+i);
		      if(i!=0)
			{
				flag=true;
			}
			System.out.println("adhar request:-"+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in adhar request--> "+ e);
		}
		return flag;
	}
	
	
	/*
	public ResultSet getProfile(String name)
	{
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from adminlogin where adminid='"+name+"'");
		}catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-getProfile()....."+e);
		}
		return resultSet;
	}
*/
}
