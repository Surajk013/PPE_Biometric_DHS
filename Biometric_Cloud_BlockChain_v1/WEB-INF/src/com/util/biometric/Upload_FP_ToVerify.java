package com.util.biometric;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;



import com.symmetric_AES.AESCrypt;
import com.util.biometric.FingerPrint.direction;

public class Upload_FP_ToVerify extends HttpServlet
{

	@SuppressWarnings({ "deprecation", "unused" })
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
			{
		
		
		LinkedHashMap<String, String> data = new LinkedHashMap<>();	
		int trans_id=0;
		HttpSession session = request.getSession();
		String fileformattostore=".pdf";
		String userid =" ";
		String password =" ";
		String conpassword =" ";
		String email=" ";
		 String phone =" ";
		
		ResultSet rs = null;
		String submit=null;
		
		RequestDispatcher rd = null;
		String NA="-NA-";
		
		String fileName =null;
		String attachedfileName =null;
		String[] name = new String[50];
		int i=0;
		String root = null;
		File uploadedFile = null;
		ArrayList<String> list = new ArrayList<String>();
		
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		
		String state="";
		String attached_filename="";
		String accnumber="";
		
		
			try{
				 int status=0;
				
				FileItemFactory fileItemFactory = new DiskFileItemFactory();
				ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
				List fileItems = servletFileUpload.parseRequest(request);
				
				
				Iterator iterator = fileItems.iterator();
				int s=fileItems.size();
				for(int j=0;j<s;j++)
				{
					FileItem one =(FileItem)fileItems.get(j);
					one.getFieldName();
					String str=one.getContentType();
					
				
					
					if(str=="application/octet-stream")
					{
						
						
					}
				
					
						  data.put(one.getFieldName().toString(), one.getString().toString());
						
						
						 if(data.get(one.getFieldName().toString()).isEmpty() || data.get(one.getFieldName().toString())==null || data.get(one.getFieldName().toString()).equals("")||data.get(one.getFieldName().toString()).equals("Select") || data.get(one.getFieldName().toString()).equals("null"))
						 {
							 data.put(one.getFieldName().toString(), NA);
						 }
						
					
					 
				}
				attachedfileName = (String) data.get("attfilename");
				
				accnumber=(String) data.get("accno");
				
				
				
				 while (iterator.hasNext())
					{
						FileItem item = (FileItem) iterator.next();
						long size=item.getSize();
				
						if (item.isFormField())
						{
							
						} 
						else if(size!=0)
						{
							String format = "none";
							fileName = item.getName();
						
				//root = request.getContextPath()+("/UploadedFiles");
				
				            root = request.getRealPath("/Res/UploadFingerPrint");
						

	                         File ff=new File(root);
	                         if (!ff.exists()) 
	                              {
	                                ff.mkdirs();
	                              }
							
							
							int index = fileName.lastIndexOf(".");
							if(index > 0)
							{
							               format = fileName.substring(index+1);
							               format = format.toLowerCase();
							}
							
							
							
							uploadedFile = new File(root +"/"+accnumber+"_"+fileName+""+".jpg");
							
						
							item.write(uploadedFile);
							
					
					
			}
						else
						{
							
							fileName=null;
						}
						
		}
		
				 //=======================================================================================
				if(fileName==null)
				{

					rd=request.getRequestDispatcher("index.jsp?no=6");
					rd.forward(request, response);
				}
				else
				{
					//====================Extract the Features of the Finger Print=starts================
					
					 FingerPrint fingerprint = new FingerPrint(root +"/"+accnumber+"_"+fileName+""+".jpg");            
			            BufferedImage buffer;
			            
			            // Print original image           
			            buffer = fingerprint.getOriginalImage();
			           
			            // Print binary result           
			            fingerprint.binarizeMean();
			            buffer = fingerprint.toBufferedImage();
			            
			            // Print binary local result           
			            fingerprint.binarizeLocalMean();
			            buffer = fingerprint.toBufferedImage();
			            
			            // Remove noise
			            fingerprint.removeNoise();
			            fingerprint.removeNoise();
			            fingerprint.removeNoise();
			            buffer = fingerprint.toBufferedImage();
			            
			            // Skeletonization            
			            fingerprint.skeletonize();
			           
			            // Direction           
			           direction [][] dirMatrix = fingerprint.getDirections();
			            buffer = fingerprint.directionToBufferedImage(dirMatrix);
			            
			            // Core           
			            buffer = fingerprint.directionToBufferedImage(dirMatrix);
			            Point core = fingerprint.getCore(dirMatrix);
			            System.out.println("  Core.........."+core);
			           
			            int coreRadius = buffer.getWidth() / 3;            
			            System.out.println(" Core Radius........"+coreRadius);
			           
			            // Minutiaes           
			            buffer = fingerprint.directionToBufferedImage(dirMatrix);            
			            ArrayList<Point> intersections = fingerprint.getMinutiaeIntersections(core, coreRadius);
			            ArrayList<Point> endPoints = fingerprint.getMinutiaeEndpoints(core, coreRadius);
			            System.out.println(" MinutiaeIntersections......."+intersections);
			            System.out.println(" MinutiaeEndpoints............"+endPoints); 
			            
					 int count_intersection=intersections.size();
			         int count_endpoints=endPoints.size();
			         
			         String featureToEncrypt=count_intersection+"~"+count_endpoints;
			      
			         AESCrypt  encrypter = new AESCrypt();
						String encrypted = encrypter.encrypt(featureToEncrypt);
			         
					
					//====================Extract the Features of the Finger Print==ends===============
					
					
					//boolean flag=admindao.addImageDetails(accnumber+"_"+fileName+""+".jpg",accnumber,encrypted);
					session.setAttribute("image1", fileName);
					rd=request.getRequestDispatcher("/Res/JSP/Admin/successpage.jsp?no=1");
					rd.forward(request, response);
				
					 
				} 
		 
}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			
		}
}

