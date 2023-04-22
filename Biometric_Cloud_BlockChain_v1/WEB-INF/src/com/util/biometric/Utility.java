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

import org.apache.commons.net.ftp.FTPClient;

public class Utility
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
			java.security.ProtectionDomain pd =	Utility.class.getProtectionDomain();
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
	/*public static byte[] DS(byte md[], byte pvtkey[])throws Exception
	{
		byte DS[]=null;
		try
		{
			DS=RSA_Algorithm.createDS(pvtkey,md);
		    System.out.println("Digital Signature :--->"+DS);
		}
		catch(Exception e)
		{
			System.out.println("Unable to process file for DS :"+e);
		}
		return DS;
	}
	public static boolean checkDigitalSignature(byte md[], byte pubkey[], byte[] ds)throws Exception
	{
		boolean flag = false;
		try
		{
			flag=RSA_Algorithm.checkDS(pubkey,md,ds); 
		}
		catch(Exception e)
		{
			System.out.println("Unable to process file for DS Verification : "+e);
		}
		return flag;
	}*/
	public static StringBuffer getRC4Enc(StringBuffer inp,StringBuffer key)
	{
		int Sbox[];
		int Sbox2[];
		Sbox=new int[257];
		Sbox2=new int[257];
		int i, j, t, x;
		char temp , k;
		i = 0;j = 0;k = 0;t = 0;x = 0;temp = 0;
		//initialize sbox i
		for( i = 0; i < 256; i++)
		{
			Sbox[i] = i;
		}
		j = 0;
		if(key.length() >0)
		{
			for(i = 0; i < 256 ; i++)
			{
				if(j == key.length())
					j = 0;
				Sbox2[i] = key.charAt(j++);
			}
		}
		j = 0 ;
		for(i = 0; i < 256; i++)
		{
			j = (j + Sbox[i] + Sbox2[i]) % 256;
			temp = (char)Sbox[i];
			Sbox[i] = Sbox[j];
			Sbox[j] = temp;
		}
		i = j = 0;
		for(x = 0; x < inp.length() ; x++)
		{
			i = (i + 1) % 256;
			j = (j + Sbox[i]) % 256;
			temp = (char)Sbox[i];
			Sbox[i] = Sbox[j] ;
			Sbox[j] = temp;
			t = ( Sbox[i] + Sbox[j]) % 256 ;
			k = (char)Sbox[t];
			inp.setCharAt(x, (char)(inp.charAt(x) ^ k));
		}
		return inp;
	 }
	public static boolean deleteFile(String ip,String user,String pass,String fname)
	{
		
		
		
		FTPClient client = new FTPClient();
		boolean flag=false;
		try
		{
			client.connect(ip);
            client.login(user, pass);
            String filename = "/OPoR_Cloud/"+fname;
            boolean result = client.deleteFile(filename);
            client.disconnect();
            if (result)
            {
            	System.out.println("File Deleted...");
            	flag=true;
            }
            else
            	System.out.println("Error While File Delete Process...");
        }
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("OPP's Error is in deleteFile "+e);
		}
		return flag;
		
		
		
	}
	
	public static boolean uploadFile(String ip,String user,String pass,String fileName,String root)
	{
		boolean flag=false;
		try
		{
			StringBuffer sb = new StringBuffer( "ftp://" );
			sb.append( user );
            sb.append( ':' );
            sb.append( pass );
            sb.append( '@' );
            sb.append( ip );
            sb.append( '/' );
            String a="OPoR_Cloud";
            sb.append( a );
            sb.append( '/' );
            sb.append(fileName );
            sb.append( ";type=i" );
            System.out.println("URL   :"+sb);
            System.out.println("filename in url 1-----"+fileName);
            BufferedInputStream bis = null;
            BufferedOutputStream bos = null;
           
               URL url = new URL( sb.toString() );
               URLConnection urlc = url.openConnection();
               System.out.println("-----"+urlc);
               bos = new BufferedOutputStream( urlc.getOutputStream() );
               bis = new BufferedInputStream( new FileInputStream( new File(root+"/Files/Encryption/"+fileName) ) );
               int i;
               while ((i = bis.read()) != -1)
               {
                  bos.write( i );
                  flag=true;
               }
               bis.close();
               bos.close();
        }
		catch(Exception e)
		{
			System.out.println("OPP's Error is in UploadFile "+e);
		}
		return flag;
	}
	public static boolean downloadFile(String ip,String user,String pass,String fileName,String root)
	{
		boolean flag=false;
		try
		{
			
			File f=new File(root+"/Nitin_Temp");
			if(!f.exists())
				f.mkdir();
			StringBuffer sb = new StringBuffer( "ftp://" );
			sb.append( user );
            sb.append( ':' );
            sb.append( pass );
            sb.append( '@' );
            sb.append( ip );
	        sb.append( '/' );
	        String a="OPoR_Cloud";
	        sb.append( a );
	        sb.append( '/' );
	        sb.append( fileName );
	        sb.append( ";type=i" );
	        BufferedInputStream bis = null;
	        BufferedOutputStream bos = null;
	        URL url = new URL( sb.toString() );
            System.out.println("URL:"+url);
	        URLConnection urlc = url.openConnection();
            bis = new BufferedInputStream( urlc.getInputStream());
            bos = new BufferedOutputStream( new FileOutputStream(root+"/Nitin_Temp/"+fileName) );
            int i;
            while ((i = bis.read()) != -1)
            {
               bos.write( i );
               flag=true;
            }
            bis.close();
            bos.close();
        }
		catch(Exception e)
		{
			System.out.println("OPP's Error is in downloadFile "+e);
		}
		return flag;
	}
	
	/*public static boolean downloadFileForVerify(String ip,String user,String pass,String fileName,String root)
	{
		boolean flag=false;
		 boolean flag77=false;
		
		try
		{
			
			File f=new File(root+"/Nitin_Temp");
			if(!f.exists())
				f.mkdir();
			StringBuffer sb = new StringBuffer( "ftp://" );
			sb.append( user );
            sb.append( ':' );
            sb.append( pass );
            sb.append( '@' );
            sb.append( ip );
	        sb.append( '/' );
	        String a="OPoR_Cloud";
	        sb.append( a );
	        sb.append( '/' );
	        sb.append( fileName );
	        sb.append( ";type=i" );
	        BufferedInputStream bis = null;
	        BufferedOutputStream bos = null;
	        URL url = new URL( sb.toString() );
            System.out.println("URL:"+url);
	        URLConnection urlc = url.openConnection();
            bis = new BufferedInputStream( urlc.getInputStream());
            bos = new BufferedOutputStream( new FileOutputStream(root+"/Nitin_Temp/"+fileName) );
            int i;
            while ((i = bis.read()) != -1)
            {
               bos.write( i );
               flag=true;
            }
            bis.close();
            bos.close();
            
          
            if(flag)
            {
	            try 
	            {
	            	  File f1=null;
	            		f1=new File(root+"/Nitin_Temp/"+fileName); 
	            	
	            	root = getServletContext().getRealPath("/");
                	num1 = random.nextInt(12345) + 1;
                	uploadpath=root+"/Files/Upload/"+num1+fileName;
                	
                	uploadedFile = new File(root+"/Files/Upload/"+num1+fileName);
                	System.out.println("Uploaded Path :"+uploadedFile);
	            	
	            	
	            	 System.out.println("===========FILE TO VERIFY===="+f1);  
	            	 String sha1=Utility.SHA1(f1);
		                System.out.println("SHA1 Key:"+sha1);
	            	System.out.println("================Sha1 in download==="+sha1);
	            	//String file11=f1.getName();
	            	//String Shakey=CommonDAO.getUploadSha1(fileName) ;
	            	System.out.println("================Shakey==="+Shakey);
	            	
	            	String shanu="abc";
	            	String shanu1="abcd";
	            	
	            if(sha1.equals(Shakey))
	            {
	            	flag77=true;
	            	System.out.println("============FLAG77======="+flag77);
	            }
	            else
	            {
	            	flag77=false;
	            	System.out.println("============FLAG7788======="+flag77);
	            }
	            	
	            	
				}
	            catch (Exception e)
	            {
					
	            	System.out.println("**************** Exception *************************");
	            	
	            	e.printStackTrace();
				}
            }
            
           
           
            
            
            
        }
		catch(Exception e)
		{
			System.out.println("OPP's Error is in downloadFile "+e);
		}
		return flag77;
	}*/
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
	public static void main(String asdf[]) throws NoSuchAlgorithmException, FileNotFoundException
	{
		
		
		String aaa=Utility.SHA1(new File("G:\\OPR_Workspace\\OPOR_SV2\\Nitin_Temp\\614Code.txt"));
		
		System.out.println("=============aaaa======"+aaa);
		String bbb=Utility.SHA1(new File("G:/OPR_Workspace/OPOR_SV2/Files/Encryption/614Code.txt"));
		
		System.out.println("=============bbb======"+bbb);
		//writeOnFile("nitin.txt", "This is test", null);
	}
}
