/**
 * 
 */
package com.priya.database;

import java.sql.Connection;
import java.sql.DriverManager;

import com.priya.global.Global;



/**
 * @author 
 *Jan 16, 2012 12:48:35 PM
 *Project:-E_Gov
 *Package:-com.nitin.database
 *File:-Database.java
 */
public class Database 
{
	private static Database database=null;
	private Database()
	{
		
	}
	public static Database newInstance()
	{
		if(database==null)
		{
			database=new Database();
		}
		return database;	
	}
	public Connection connector()
	{
		Connection con=null;
		try {

			Class.forName(Global.JDBC_DRIVER);
			System.out.println("Driver has loaded");
			con = DriverManager.getConnection(Global.JDBC_HOST_URL_WITH_DBNAME,Global.DATABASE_USERNAME, Global.DATABASE_PASSWORD);
			System.out.println("Connected" + con);

		} catch (Exception e) {
			System.out.println("Exception in serverconnector-->connector(): "+ e);
		}
		return con;
	}
}
