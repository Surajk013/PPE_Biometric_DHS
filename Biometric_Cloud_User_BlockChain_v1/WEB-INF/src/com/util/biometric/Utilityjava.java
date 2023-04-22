/**
 * 
 */
package com.util.biometric;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.io.*;
import java.net.*;

public class Utilityjava
{
	
	public static int parse(String str) 
	{ 
		int p=0; 
		if(str==null) 
		{ 
			str="0"; 
		} 
		else if((str.trim()).equals("null")) 
		{ 
			str="0"; 
		} 
		else if(str.equals("")) 
		{ 
			str="0"; 
		} 
		try
		{ 
			p=Integer.parseInt(str); 
		} 
		catch(Exception e) 
		{
			System.out.println("Opp's error is in Utility parse(String str) "+e);
		} 
		return p; 
	}
	public static String parse1(Object str) 
	{ 
		String p=""; 
		if(str==null) 
		{ 
			str=""; 
		} 
		else if(str.equals("")) 
		{ 
			str=""; 
		} 
		try
		{ 
			p=(String)str; 
		} 
		catch(Exception e) 
		{
			System.out.println("Opp's error is in Utility parse1(String str) "+e);
		} 
		return p; 
	}
	public static Object parse2(Object str) 
	{ 
		Object obj=null;
		if(str!=null) 
			return str;
		else
			return obj; 
	}
	public static String getPro(String str) 
	{
		String pro="";
		try
		{
			java.security.ProtectionDomain pd =	Utilityjava.class.getProtectionDomain();
			java.security.CodeSource cs = pd.getCodeSource();
			java.net.URL url = cs.getLocation();
			java.io.File f = new File( url.getFile());
			String path=f.getParent();
			Properties property = new Properties();
			FileInputStream in=null;
			in = new FileInputStream(path+"\\Config.properties");
			property.load(in);
			pro=property.getProperty(str);
			System.out.println("Property to return : "+pro);
		}
		catch(Exception e)
		{
			System.out.println("Opp's error is in Utility getPro(String str) "+e);
		}
		return pro;
	}
	public static String getDate()
	{
		String date="";
		try
		{
			Calendar currentDate = Calendar.getInstance();
			SimpleDateFormat formatter1=new SimpleDateFormat("dd-MM-yyyy");
			date = formatter1.format(currentDate.getTime());
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->getDate( ): "+ e);
		}
		return date;
	}
	public static String getTime()
	{
		String time="";
		try
		{
			Calendar currentDate = Calendar.getInstance();
			SimpleDateFormat formatter1=new SimpleDateFormat("HH:mm:ss");
			time = formatter1.format(currentDate.getTime());
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->getTime( ): "+ e);
		}
		return time;
	}
	  public static byte[] readContentIntoByteArray(File file)
	   {
	      FileInputStream fileInputStream = null;
	      byte[] bFile = new byte[(int) file.length()];
	      try
	      {
	         //convert file into array of bytes
	         fileInputStream = new FileInputStream(file);
	         fileInputStream.read(bFile);
	         fileInputStream.close();
	         for (int i = 0; i < bFile.length; i++)
	         {
	            System.out.print((char) bFile[i]);
	         }
	      }
	      catch (Exception e)
	      {
	         e.printStackTrace();
	      }
	      return bFile;
	   }
	public static String getDay()
	{
		String day="";
		try
		{
			Calendar currentDate = Calendar.getInstance();
			int no=currentDate.get(Calendar.DAY_OF_WEEK);
			if(no==1)
				day="Sunday";
			else if(no==2)
				day="Monday";
			else if(no==3)
				day="TUESDAY";
			else if(no==4)
				day="WEDNESDAY";
			else if(no==5)
				day="THURSDAY";
			else if(no==6)
				day="FRIDAY";
			else if(no==7)
				day="SATURDAY";
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserDAO-->getDay( ): "+ e);
		}
		return day;
	}
	public static String MD(File source1) throws NoSuchAlgorithmException, FileNotFoundException 
	{
		String output="";
		MessageDigest digest = MessageDigest.getInstance("MD5");
		InputStream is = new FileInputStream(source1);				
		byte[] buffer = new byte[8192];
		int read = 0;
		try {
			while( (read = is.read(buffer)) > 0) 
			{
				digest.update(buffer, 0, read);
			}		
			byte[] md5sum = digest.digest();
				System.out.print("Digets:"+md5sum);
			
			System.out.println();
			BigInteger bigInt = new BigInteger(1, md5sum);
			output = bigInt.toString(16);
			System.out.println("MD5: " + output);
		}
		catch(IOException e) 
		{
			System.out.println("Unable to process file for MD5"+e);
		}
		return output;
	}
	//sha1 algorithms
	public static String SHA1(File source1) throws NoSuchAlgorithmException, FileNotFoundException 
	{
		String output="";
		try
		{
			MessageDigest md = MessageDigest.getInstance("SHA-256");
	        FileInputStream fis = new FileInputStream(source1);	        
	        byte[] dataBytes = new byte[1024];	     
	        int nread = 0;
	        
	        while ((nread = fis.read(dataBytes)) != -1) 
	        {
	          md.update(dataBytes, 0, nread);
	        };
	        byte[] mdbytes = md.digest();	     
	       
	        //convert the byte to hex format method 1
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < mdbytes.length; i++)
	        {
	          sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
	        }
            output=sb.toString();
	       
		}
		catch(IOException e) 
		{
			System.out.println("Unable to process file for SHA1"+e);
		}
		return output;
	}
	
	// #SHA1  [ ENDs ]
	
	
	public static boolean writeOnFile(String filename,String msg,String root)
	{
		boolean flag=false;
		try
		{
			PrintWriter pw = null;
			File f=new File(root+"\\Files\\Transactios\\"+filename);
			if(!f.exists())
				flag =f.createNewFile();
			pw = new PrintWriter(new FileWriter(f, true));
			pw.println("");
			pw.println(msg);
			pw.flush();
			pw.close();
			flag=true;
			System.out.println(msg);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return flag;
	}
	
	
	
	public static String getMD(String URL,String ip,String sname,String spass,String fname)
	{
		String str1="";;
		try 
		{ 
			URL url = new URL( URL+"/Verify?ip="+ip+"&sname="+sname+"&spass="+spass+"&fname="+fname); 
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream())); 
			str1 = in.readLine(); 
			in.close(); 
		}
		catch (Exception e)
		{ 
			e.printStackTrace(); 
		} 
		return str1;
	}
	
	public static String SendToCloudServer(String URL,String values,String adharno,String name)
	{
		String str1="";
		try 
		{ 
			System.out.println("values //////////////////////"+values);
			System.out.println("adharno//////////////////////"+adharno);
			URL url = new URL( URL+"/Amazonclouds3?value="+values+"&adharno="+adharno+"&name="+name); 
			System.out.println("url is>>>>>>>>>>>>>>>>"+url);
			
			
			
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream())); 
			str1 = in.readLine(); 
			in.close(); 
		}
		catch (Exception e)
		{ 
			
			e.printStackTrace(); 
		} 
		return str1;
	}
	
	
	
	
	public static void main(String asdf[]) throws NoSuchAlgorithmException, FileNotFoundException
	{
		
		
		
	}
}
