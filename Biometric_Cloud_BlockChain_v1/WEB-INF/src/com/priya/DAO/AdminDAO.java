/**
 * 
 */
package com.priya.DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.priya.database.Database;

public class AdminDAO 
{
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	private static AdminDAO adminDAO=null;
	private AdminDAO()
	{
		
	}
	public static AdminDAO initialize()
	{
		if(adminDAO==null)
		{
			adminDAO=new AdminDAO();
		}
		return adminDAO;
	}
	
	
	public static String gethashtag(String adharno)
	{
		String shatag="";
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select shatag from m_user where author_no='"+adharno+"'");
			while(resultSet.next())
			{
				 shatag=resultSet.getString(1);
				
				System.out.println("shatag : "+shatag);
				
			}

		}
		catch(Exception e)
		{
			System.out.println("Exception in adharno-->adharno(adharno): "+ e);
		}
		return shatag;
	}
	public static String getfingerprint(String adharno)
	{
		String encrypted_features="";
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select encrypted_features from m_user where author_no='"+adharno+"'");
			while(resultSet.next())
			{
				encrypted_features=resultSet.getString(1);
				
				System.out.println("shatag : "+encrypted_features);
				
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in adharno-->adharno(adharno): "+ e);
		}
		return encrypted_features;
	}
	public static String getadharno(String adharno)
	{
		String author_no="";
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select author_no from m_user where author_no='"+adharno+"'");
			while(resultSet.next())
			{
				author_no=resultSet.getString(1);
				
				System.out.println("shatag : "+author_no);
				
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in adharno-->adharno(adharno): "+ e);
		}
		return author_no;
	}
	public boolean loginCheck(String admin,String pass)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_admin where userid='"+admin+"' and password='"+pass+"'");
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

	
	

	public static ResultSet getAdminDetails(String userid)
	{
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_admin where userid='"+userid+"'");
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminDetails-->getAdminDetails(): "+ e);
		}
		return resultSet;
	}
	
	
	public boolean uidCheck(String authorid)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user where author_no='"+authorid+"'");
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("Admin UID check Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminrProcess-->Authorid(String id): "+ e);
		}
		return flag;
	}
	
	
	
	public boolean uidCheck(String email,String phone)
	{
		boolean flag=false;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user where email='"+email+"' or phone='"+phone+"' ");
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("Admin UID check Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminrProcess-->uidCheck(String uid): "+ e);
		}
		return flag;
	}
	
	
	
	public boolean upload_datasheet(String adharno,String name, String pass,String fname, String mname,String dob, String sex, String hosueno,String village,String district,String state, String pincode,String phoneno, String emailid, String adhar_image,String finger_print,String encrypted,String previousblk,String shatag,String timestamps, String nonce,String blkname)
	{
		boolean flag=false;
		int i=0;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();

		      i = statement.executeUpdate("insert into m_user (author_no,u_name,u_pass,f_name,m_name,dob,gender,hosue_no,village,district,state,pin,phone,email,u_image,u_fingerprint,encrypted_features,previous_shatg,shatag,timestamps,nonce,blkid) values('"+adharno+"','"+name+"','"+pass+"','"+fname+"','"+mname+"','"+dob+"','"+sex+"','"+hosueno+"','"+village+"','"+district+"','"+state+"','"+pincode+"','"+phoneno+"','"+ emailid+"','"+adhar_image+"','"+finger_print+"','"+encrypted+"','"+previousblk+"','"+shatag+"','"+timestamps+"','"+nonce+"','"+blkname+"')");
     			if(i!=0)
			{
				flag=true;
			}
			System.out.println("Upload DataSheet :-"+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminrProcess-->Upload Datasheet(..........): "+ e);
		}
		return flag;
	}
	
	public static ResultSet getdatasheetdetails()
	{
		System.out.println("its came inside the getdatasheetdetails() function ");
		
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user ");
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in getdatasheetdetails-->getdatasheetdetails: "+ e);
		}
		return resultSet;
	}
	
	public static boolean changepassword(String uname,String oldpwd,String newpwd)
	{
		
		System.out.println("uname /////////////////////////"+uname);
		System.out.println("oldpwd /////////////////////////"+oldpwd);
		System.out.println("newpwd /////////////////////////"+newpwd);
		boolean flag=false;
		int i=0;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();

		 i=statement.executeUpdate("update m_admin set password='"+newpwd+"' where password='"+oldpwd+"' and userid='"+uname+"'");
     			
		      System.out.println("i value is>>>>>>>>>>>>>>>>>>>>>>>>"+i);
		      if(i!=0)
			{
				flag=true;
			}
			System.out.println("Changepassword:-"+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in Changepassword--> "+ e);
		}
		return flag;
	}
	public static ResultSet getadharrequest()
	{
		System.out.println("its came inside the getadharrequest() function ");
		
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			System.out.println("connection is>>>>>>>"+connection);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_request ");
			String sql="select * from m_request";
			System.out.println(">>>>>>>>>>sql>>>>>>>"+sql);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in getadharrequest-->getadharrequest: "+ e);
		}
		return resultSet;
	}
	
	
	public static String getadharname(String adharno)
	{
		String adharname="";
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select u_name from m_user where author_no='"+adharno+"'");
			while(resultSet.next())
			{
				adharname=resultSet.getString(1);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in getadharname-->getadharname(String adharno): "+ e);
		}
		return adharname;
	}
	public static String getadharnoold(String adharno)
	{
		String adharname="";
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select author_no from m_user where author_no='"+adharno+"'");
			while(resultSet.next())
			{
				adharname=resultSet.getString(1);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in getadharname-->getadharname(String adharno): "+ e);
		}
		return adharname;
	}
	
	
	public static boolean updateadhardetails(String adharno)
	{
		
	  String status="verified";
		boolean flag=false;
		int i=0;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();

		 i=statement.executeUpdate("update m_user set status='"+status+"' where author_no='"+adharno+"'");
     			
		      System.out.println("i value is>>>>>>>>>>>>>>>>>>>>>>>>"+i);
		      if(i!=0)
			{
				flag=true;
			}
			System.out.println("Changepassword:-"+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in Changepassword--> "+ e);
		}
		return flag;
	}

	
	
	public static boolean trancaterequest(String uname)
	{
		
		
		boolean flag=false;
		int i=0;
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();

			i=statement.executeUpdate("delete from m_request where adhar_no='"+uname+"'");
     			
		      System.out.println("i value is>>>>>>>>>>>>>>>>>>>>>>>>"+i);
		      if(i!=0)
			{
				flag=true;
			}
			System.out.println("trancaterequest:-"+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in trancaterequest--> "+ e);
		}
		return flag;
	}
	

	//genesis blockid//
	public String previousblkid()
	{
		String name="";
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();

			resultSet = statement.executeQuery("select sno from m_user order by sno desc limit 1");
			while(resultSet.next())
			{
				name=resultSet.getString(1);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in adminDAO-->genesisblock(): "+ e);
		}
		return name;
	}

	//genesis block//
	public String previousblk(String previousblk)
	{
		String name="";
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select shatag from m_user where sno='"+previousblk+"'");
			while(resultSet.next())
			{
				name=resultSet.getString(1);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in adminDAO-->genesisblock(): "+ e);
		}
		return name;
	}

	//trans id
	public static int getTransID() {
		int id = 0;
		try {
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select sno from m_user");
			while (resultSet.next()) {
				id = resultSet.getInt(1);
			}
			System.out.println("Trans ID to return : " + id);
		} catch (Exception e) {
			System.out.println("Opp's Error is in CommonDAO-getTransID()....."
					+ e);
		}
		return id;
	}
	
	public static String checkverificationstatus(String chkverification)
	{
		String verify="";
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select status from m_user where author_no='"+chkverification+"'");
			while(resultSet.next())
			{
				verify=resultSet.getString(1);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminrProcess-->loginCheck(String admin,String pass): "+ e);
		}
		return verify;
	}
	public static String getfingerfeature(String adharnoold) {
		String adharname="";
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select encrypted_features from m_user where author_no='"+adharnoold+"'");
			while(resultSet.next())
			{
				adharname=resultSet.getString(1);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in getadharname-->getadharname(String adharno): "+ e);
		}
		return adharname;
	}
	public static String getBlkid(String adharno) {
		String adharname="";
		try
		{
			Database database=Database.newInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select blkid from m_user where author_no='"+adharno+"'");
			System.out.println("select blkid from m_user where author_no='"+adharno+"'");
			while(resultSet.next())
			{
				adharname=resultSet.getString(1);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in getadharname-->getadharname(String adharno): "+ e);
		}
		return adharname;
	}

	
}
