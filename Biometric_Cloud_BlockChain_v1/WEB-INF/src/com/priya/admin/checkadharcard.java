package com.priya.admin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.priya.DAO.AdminDAO;
import com.symmetric_AES.AESCrypt;
import com.util.biometric.Utilityjava;

public class checkadharcard extends HttpServlet  
{
private boolean result;
private String news;

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException 
		{
	
	try
	{
		System.out.println("its came inside the checkadharcard");
		String adharno=req.getParameter("adharno");
		System.out.println("///////////////adharno//////////////////"+adharno);
		
		String fingerfeature=req.getParameter("fingerfeature");
		System.out.println("/////////////////fingerfeature////////////////"+fingerfeature);
		
		
		String adharnoold=AdminDAO.getadharnoold(adharno);
		String dbfinger=AdminDAO.getfingerfeature(adharnoold);
		String aname=AdminDAO.getadharname(adharno);
		System.out.println("//////////////aname///////////////////"+aname);
		
		if(adharnoold.equals(adharno)&&fingerfeature.equals(dbfinger))
		
		{
	
		    String blkid=AdminDAO.getBlkid(adharno);
			String server="ftp.drivehq.com";
			String uname="clouddatastore";
			String password="*India123";
			String dir="biometricblockchain";
			String destFilePath="D:/Download/";
		
			result=Utilityjava.download(server, uname, password,blkid,destFilePath);
			
			String src = "D:/Download/"+blkid;
			
			   byte[] buffer = new byte[1024];
      	        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
      	        System.out.println("zis>>>>>>>>>>>>>>>>>>>>>>"+zis);
      	        ZipEntry zipEntry = zis.getNextEntry();
      	        while(zipEntry != null){
      	            String fileName1 = zipEntry.getName();
      	            System.out.println("fileName1>>>>>>>>>>>>>>>>"+fileName1);
      	          
      	            File newFile = new File("D:/Download/" + fileName1);
      	            System.out.println("newfile>>>>>>>>>>>>>>>>>>>"+newFile);
      	            FileOutputStream fos = new FileOutputStream(newFile);
      	            System.out.println("fos>>>>>>>>>>>>>>>>>>>>"+fos);
      	            int len;
      	            while ((len = zis.read(buffer)) > 0) 
      	            {
      	                fos.write(buffer, 0, len);
      	            }
      	            fos.close();
      	            zipEntry = zis.getNextEntry();
      	        }
      	        zis.closeEntry();
      	        zis.close();
           	
           	
           	
           	
           	
           	
   	        String srcs = "D:/Download/SHA_"+aname+".txt";
           	
File f = new File(srcs);
	        
	        System.out.println("file is>>>>>>>>>>>>>>>>>>"+f);
	        String fnm = f.getName();
			   //  here Sha1tag=
		       
            String sha1=Utilityjava.SHA1(f);
          
              System.out.println("New SHA1 Key:"+sha1);
			
			
			BufferedReader br = null;
			FileReader fr = null;

			try {

				
				fr = new FileReader(srcs);
				br = new BufferedReader(fr);

				String sCurrentLine;

				while ((sCurrentLine = br.readLine()) != null) {
					System.out.println(sCurrentLine);
					 news=sCurrentLine;
					System.out.println("news is>>>>>>>>>>>>>>>>>"+news);
				}

			} catch (IOException e) {

				e.printStackTrace();

			}
			AESCrypt  decrypter = new AESCrypt();
		     String	decrypted = decrypter.decrypt(news);
		     	System.out.println("decrypted File is>>>>>>>>>>>>>>>>>>>>>>>>"+decrypted);
		
		     	String str =decrypted;
		        String[] arrOfStr = str.split("/");
		 
		        
		        String adharno1=arrOfStr[0];
		        System.out.println("adharno1>>>>>>>>>>>"+adharno1);
		        
		        String fingerprint=arrOfStr[1];
		        
		        System.out.println("fingerprint>>>>>>>>>>>"+fingerprint);
		        
		        
		        
		        String hashtagold=AdminDAO.gethashtag(adharno1);
		        System.out.println("hashtagold>>>>>>>>>>>>>>>>>>>>"+hashtagold);
		        String adharnold=AdminDAO.getadharno(adharno1);
		        
		        String Fingerprintold=AdminDAO.getfingerprint(adharno1);
		        System.out.println(">>>>>>>>>>Fingerprintold>>>>>>>>>>>>>>>>>"+Fingerprintold);
		     	
		     	
		        if((adharnold.equals(adharno1))&&(hashtagold.equals(sha1))&&(Fingerprintold.equals(fingerprint)))
        		{
        	System.out.println("its came inside the if condition");
        	
        	String message="verified Successfully...!!!";
        	
        	RequestDispatcher rd=req.getRequestDispatcher("/jsp/admin/home.jsp?no=3");
        	rd.forward(req, resp);
        		}
		        else
				{
					RequestDispatcher rd=req.getRequestDispatcher("/jsp/admin/home.jsp?no=4");
					rd.forward(req, resp);
				}
		     	
		Boolean f1=AdminDAO.updateadhardetails(adharnoold);
		System.out.println(f1);
		
		
		
		
		
		
		
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