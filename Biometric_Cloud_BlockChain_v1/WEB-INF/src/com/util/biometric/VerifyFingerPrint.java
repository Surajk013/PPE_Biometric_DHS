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




import com.util.biometric.FingerPrint.direction;



public class VerifyFingerPrint extends HttpServlet
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
		
		// String uid=session.getAttribute("userid").toString();
		
		
		String fileName =null;
		String[] name = new String[50];
		int i=0;
		String root = null;
		File uploadedFile = null;
		ArrayList<String> list = new ArrayList<String>();
		
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		
		String state="";
		String attached_filename="";
		String uploaded_FPfilename="";
		String registered_FPfilename="";
		
		
			try{
				 int status=0;
				
				FileItemFactory fileItemFactory = new DiskFileItemFactory();
				ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
				List fileItems = servletFileUpload.parseRequest(request);
				
				root = request.getRealPath("/ForVerifyFingerPrints");
				
				
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
				attached_filename = (String) data.get("attfilename");
				uploaded_FPfilename = (String) data.get("uploadedFPfilename");
				registered_FPfilename = (String) data.get("registeredFPfilename");
				
				System.out.println("=====uploaded_FPfilename==========="+uploaded_FPfilename);
				System.out.println("=====registered_FPfilename==========="+registered_FPfilename);
				
				
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
							
							
							
							uploadedFile = new File(root +"/"+fileName);
							
						
							item.write(uploadedFile);
					
			}
						else
						{
							
							fileName=" ";
						}
						
		}
				 
			
				 //============================================================================
				 
				 try
				 {
					
				
					//=================================================================Image1 Process=====================
					
					 String imagename1=session.getAttribute("image1").toString();
						String path = request.getRealPath("/UploadFingerPrint");
						
						System.out.println("==========================registered imge==="+path+"/"+imagename1);
						// Create binaryPicture
					 FingerPrint fingerprint = new FingerPrint(path+"/"+imagename1);            
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
					 
					 
			          //=================================================================Image2 Process=====================
					 
			            
			            //String path2 = request.getRealPath("/ForVerifyFingerPrints/");
			         // Create binaryPicture
			            System.out.println("==========================registered imge==="+root +"/"+imagename1);
			            FingerPrint fingerprint1 = new FingerPrint(root +"//"+fileName);            
			            BufferedImage buffer1;
			            
			            // Print original image           
			            buffer1 = fingerprint1.getOriginalImage();
			           
			            // Print binary result           
			            fingerprint1.binarizeMean();
			            buffer1 = fingerprint1.toBufferedImage();
			            
			            // Print binary local result           
			            fingerprint1.binarizeLocalMean();
			            buffer1 = fingerprint1.toBufferedImage();
			            
			            // Remove noise
			            fingerprint1.removeNoise();
			            fingerprint1.removeNoise();
			            fingerprint1.removeNoise();
			            buffer1 = fingerprint1.toBufferedImage();
			            
			            // Skeletonization            
			            fingerprint1.skeletonize();
			           
			            // Direction           
			            direction [][] dirMatrix1 = fingerprint1.getDirections();
			            buffer1 = fingerprint1.directionToBufferedImage(dirMatrix1);
			            
			            // Core           
			            buffer1 = fingerprint1.directionToBufferedImage(dirMatrix1);
			            Point core1 = fingerprint1.getCore(dirMatrix1);
			            System.out.println("  Core.........."+core1);
			           
			            int coreRadius1 = buffer1.getWidth() / 3;            
			            System.out.println(" Core Radius........"+coreRadius1);
			           
			            // Minutiaes           
			            buffer1 = fingerprint1.directionToBufferedImage(dirMatrix1);            
			            ArrayList<Point> intersections1 = fingerprint1.getMinutiaeIntersections(core, coreRadius);
			            ArrayList<Point> endPoints1 = fingerprint1.getMinutiaeEndpoints(core, coreRadius);
			            System.out.println(" MinutiaeIntersections......."+intersections1);
			            System.out.println(" MinutiaeEndpoints............"+endPoints1);
					 
					 
			            
			            //=====================================COMPARE TWO IMAGES=================================
			            
			            int count_intersection=intersections.size();
			            int count_intersection1=intersections1.size();
			            
			            int count_endpoints=endPoints.size();
			            int count_endpoints1=endPoints1.size();
			            
			            int abs_count,abs_endpoint;
			            
			            abs_count = (count_intersection-count_intersection1) * (count_intersection-count_intersection1);
			           // double xcount = Math.sqrt(abs_count);
			            
			            double xcount = Math.abs(abs_count);
			            
			            abs_endpoint = (count_endpoints - count_endpoints1) * (count_endpoints - count_endpoints1);
			            //double xendpoint = Math.sqrt(abs_endpoint);
			            
			            double xendpoint = Math.abs(abs_endpoint);
			            
			            
			            
			            System.out.println("  count " + count_intersection);
			            System.out.println(" count1 " + count_intersection1);
			            
			            System.out.println(" endpoint " + count_endpoints);
			            System.out.println(" endpoint1 " + count_endpoints1);
			            
			            System.out.println(" ABS count " + xcount);
			            System.out.println(" ABS endpoint " + xendpoint);
			            
			            if(xcount <= 50.0D && xendpoint <= 2000.0D )
			            {
			            	
			            	status=1;
			            	System.out.println( "Matching...!");
			            }
			            else
			            {
			            	System.out.println( "Does not Matching...!");
			            }
			            
			           
			            uploadedFile = new File(root +"/"+uploaded_FPfilename);
					 
			           boolean FPforVerifyDelete= uploadedFile.delete(); 
			           System.out.println("=====Finger Print====="+FPforVerifyDelete);
					 
				 }
				 catch (Exception e)
				 {
					e.printStackTrace();
				}
				 
				 
				 //=======================================================================================
				 System.out.println("==============attached_filename in verifyfingerprint================"+attached_filename);
				 System.out.println("==============Status================"+status);
				 
				 
				 
				 if(status==1)
				 {
					 rd=request.getRequestDispatcher("index.jsp?no=3");
						rd.forward(request, response);
					
				 }
				 else
				 {
					
					
						
						rd=request.getRequestDispatcher("index.jsp?no=4");
						rd.forward(request, response);
					 }
					
				
				 
}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			
			
		}
}

