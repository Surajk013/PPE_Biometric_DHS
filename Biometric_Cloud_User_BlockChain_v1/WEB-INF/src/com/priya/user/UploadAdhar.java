/**
 * 
 */
package com.priya.user;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import sun.text.normalizer.Utility;



import com.priya.DAO.UserDAO;
import com.symmetric_AES.AESCrypt;
import com.util.biometric.FingerPrint;
import com.util.biometric.FingerPrint.direction;
import com.util.biometric.Utilityjava;
/**
 * @author 
 *Priyanka
 */
public class UploadAdhar extends HttpServlet 
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException
	{
		
		FileItemFactory fileItemFactory = new DiskFileItemFactory();
		ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
		List fileItems = null;
		String adharno="",finger_print="";
		
		String featureToEncrypt="",encrypted = "";
		
		try 
		{
			fileItems = servletFileUpload.parseRequest(request);
		
		FileItem file1 = (FileItem) fileItems.get(0);
		FileItem file2 = (FileItem) fileItems.get(1);
		
	//	FileItem file3 = (FileItem) fileItems.get(2);
		
		
		adharno=file1.getString();
		
		 finger_print = file2.getString();
		 
		 String fingerprintfname = file2.getName();
		 System.out.println(">>>>>>>>fingerprintfname>>>>>>>>"+fingerprintfname);
	
          // String adharface=file3.getString();
           //String adharimage=file3.getName();
		
		//System.out.println("adharface>>>>>>>>>>>>>>>>>>"+adharface);
			
		
			
			
		String fingerprintfilename = request.getRealPath("") + "/uploadfingerprint/"+fingerprintfname;
		
		 OutputStream outputStream1 = new FileOutputStream(fingerprintfilename);
			InputStream inputStream1 = file2.getInputStream();

			int readBytes1 = 0;
			byte[] buffer1 = new byte[10000];
			while ((readBytes1 = inputStream1.read(buffer1, 0, 10000)) != -1)
			{
				outputStream1.write(buffer1, 0, readBytes1);
			}
			
			outputStream1.close();
			inputStream1.close();
			
			
			
		/*	
			
			String adharimage1 = request.getRealPath("") + "/uploadadharimages/"+adharimage;
			
			 OutputStream outputStream2 = new FileOutputStream(adharimage1);
				InputStream inputStream2 = file3.getInputStream();

				int readBytes2= 0;
				byte[] buffer2 = new byte[10000];
				while ((readBytes1 = inputStream2.read(buffer1, 0, 10000)) != -1)
				{
					outputStream2.write(buffer1, 0, readBytes1);
				}
				
				outputStream2.close();
				inputStream2.close();*/
				
				
				
				
			
			//====================Extract the Features of the Finger Print=starts================
			
			
		    FingerPrint fingerprint1 = new FingerPrint(fingerprintfilename); 
			System.out.println("its cazme inside feature extraction>>>>>>>>>>>>>>>>>"+fingerprint1);
			
	            BufferedImage buffer11;
	            
	            // Print original image           
	            buffer11 = fingerprint1.getOriginalImage();
	           
	            // Print binary result           
	            fingerprint1.binarizeMean();
	            buffer11 = fingerprint1.toBufferedImage();
	            
	            // Print binary local result           
	            fingerprint1.binarizeLocalMean();
	            buffer11 = fingerprint1.toBufferedImage();
	            
	            // Remove noise
	            fingerprint1.removeNoise();
	            fingerprint1.removeNoise();
	            fingerprint1.removeNoise();
	            buffer11 = fingerprint1.toBufferedImage();
	            
	            // Skeletonization            
	            fingerprint1.skeletonize();
	           
	            // Direction
	            direction [][] dirMatrix = fingerprint1.getDirections();
	            buffer11 = fingerprint1.directionToBufferedImage(dirMatrix);
	            
	            // Core           
	            buffer11 = fingerprint1.directionToBufferedImage(dirMatrix);
	            Point core = fingerprint1.getCore(dirMatrix);
	            System.out.println("  Core.........."+core);
	           
	            int coreRadius = buffer11.getWidth() / 3;       
	            System.out.println(" Core Radius........"+coreRadius);
	           
	            // Minutiaes           
	            buffer11 = fingerprint1.directionToBufferedImage(dirMatrix);            
	            ArrayList<Point> intersections = fingerprint1.getMinutiaeIntersections(core, coreRadius);
	            ArrayList<Point> endPoints = fingerprint1.getMinutiaeEndpoints(core, coreRadius);
	            System.out.println(" MinutiaeIntersections......."+intersections);
	            System.out.println(" MinutiaeEndpoints............"+endPoints); 
	            
			 int count_intersection=intersections.size();
	         int count_endpoints=endPoints.size();
	         
	         featureToEncrypt=count_intersection+"~"+count_endpoints;
	         System.out.println("priya finger print featureToEncrypt>>>>>>>>>>>>>>>>>"+featureToEncrypt);
	         
	         
	         
	         
	         
	         
	         
	         
	         
				
				  
			boolean result=UserDAO.adharrequest(adharno,featureToEncrypt );
		System.out.println("second result is//////////////"+result);
				
				
				if(result)
				{
					System.out.println("it came inside the result if condition>>>>>>>>>>>>>");
					
					RequestDispatcher rd=null;
					rd=request.getRequestDispatcher("/jsp/user/upload_adhar.jsp?no=1");
					rd.forward(request, response);
					
					}
			//}
			else
			{
				RequestDispatcher rd=null;
				rd=request.getRequestDispatcher("/jsp/user/upload_adhar.jsp?no=1");
				rd.forward(request, response);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	} 
	
		
	}

