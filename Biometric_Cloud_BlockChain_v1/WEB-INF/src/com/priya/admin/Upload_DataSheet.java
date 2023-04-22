/**
 * 
 */
package com.priya.admin;

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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipOutputStream;

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



import com.priya.DAO.AdminDAO;
import com.symmetric_AES.AESCrypt;
import com.util.biometric.FingerPrint;
import com.util.biometric.FingerPrint.direction;
import com.util.biometric.Utilityjava;

public class Upload_DataSheet extends HttpServlet 
{
	private boolean flag_upload;

	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException
	{
		
		FileItemFactory fileItemFactory = new DiskFileItemFactory();
		ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
		List fileItems = null;
		String adharno="",name="", fname="", mname="",dob="",sex="",hosueno="",village="",district="",state="",pincode="",phoneno="",emailid="",adhar_image="",finger_print="";
		
		String featureToEncrypt="",encrypted = "";
		
		try 
		{
			fileItems = servletFileUpload.parseRequest(request);
		
		FileItem file1 = (FileItem) fileItems.get(0);
		FileItem file2 = (FileItem) fileItems.get(1);
		FileItem file3 = (FileItem) fileItems.get(2);
		FileItem file4 = (FileItem) fileItems.get(3);
		FileItem file5 = (FileItem) fileItems.get(4);
		FileItem file6 = (FileItem) fileItems.get(5);
		FileItem file7 = (FileItem) fileItems.get(6);
		FileItem file8 = (FileItem) fileItems.get(7);
		FileItem file9 = (FileItem) fileItems.get(8);
		FileItem file10 = (FileItem) fileItems.get(9);
		FileItem file11 = (FileItem) fileItems.get(10);
		FileItem file12 = (FileItem) fileItems.get(11);
		FileItem file13 = (FileItem) fileItems.get(12);
		FileItem file14 = (FileItem) fileItems.get(13);
		FileItem file15 = (FileItem) fileItems.get(14);
		
		
		
		adharno=file1.getString();
		name=file2.getString();
		fname=file3.getString();
		
		mname=file4.getString();
	
		dob=file5.getString();
		sex=state=file6.getString();
		hosueno=file7.getString();
		village=file8.getString();
		
		district=file9.getString();
		
		 state=file10.getString();
		 pincode=file11.getString();
		
		
		 phoneno=file12.getString();
		 emailid=file13.getString();
		
		 adhar_image=file14.getName();
		
		 finger_print = file15.getString();
		 
		 String fingerprintfname = file15.getName();

		
		 System.out.println("name:"+name);
		 System.out.println("mother:"+mname);
		 System.out.println("father :"+fname);
		
		 System.out.println(" Dob:"+dob);
		
		System.out.println(">>>>>>>sex>>>>>>>>>"+sex);
		System.out.println(">>>>>>>hosueno>>>>>>>>>"+hosueno);
		System.out.println(">>>>>>>village>>>>>>>>>"+village);
		System.out.println(">>>>>>>>district>>>>>>>>"+district);
		System.out.println(">>>>>>>state>>>>>>>>>"+state);
		System.out.println(">>>>>>>>pincode>>>>>>>>"+pincode);
		System.out.println(">>>>>>>>phoneno>>>>>>>>"+phoneno);
		System.out.println(">>>>>>>>emailid>>>>>>>>"+emailid);
		System.out.println(">>>>>>>>>adhar_image>>>>>>>"+adhar_image);
/*		System.out.println(">>>>>>>>finger_print>>>>>>>>"+finger_print);*/
		System.out.println(">>>>>>>>fingerprintfname>>>>>>>>"+fingerprintfname);
		 AdminDAO adminDAO=AdminDAO.initialize();
			Random r=new Random();
			
			 String fileName = request.getRealPath("") + "/uploadedimages/"+name+"_"+adhar_image;
			
			 OutputStream outputStream = new FileOutputStream(fileName);
				InputStream inputStream = file14.getInputStream();

				int readBytes = 0;
				byte[] buffer = new byte[10000];
				while ((readBytes = inputStream.read(buffer, 0, 10000)) != -1)
				{
					outputStream.write(buffer, 0, readBytes);
				}
				outputStream.close();
				inputStream.close();
				
				String fingerprintfilename = request.getRealPath("") + "/uploadfingerprint/"+name+"_"+fingerprintfname;
					
				 OutputStream outputStream1 = new FileOutputStream(fingerprintfilename);
					InputStream inputStream1 = file15.getInputStream();

					int readBytes1 = 0;
					byte[] buffer1 = new byte[10000];
					while ((readBytes1 = inputStream1.read(buffer1, 0, 10000)) != -1)
					{
						outputStream1.write(buffer1, 0, readBytes1);
					}
					outputStream1.close();
					inputStream1.close();
					
					
					
					String pass=new Integer(r.nextInt(8253)).toString();
					
					System.out.println("aadhar no ====> " + adharno);
					
					
					
				
					
					
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
			      
			      
			         
			              String value=adharno+"/"+featureToEncrypt;
					   
			         
			              System.out.println("Input value is>>>>>>>>>>>>>>>>>> :"+value);
						   
						 
			              
			              
			              AESCrypt  encrypter = new AESCrypt();
				         	encrypted = encrypter.encrypt(value);
				         	System.out.println("Encrypted File is>>>>>>>>>>>>>>>>>>>>>>>>"+encrypted);
				         	
				         	
				
						   String hashtagpath = request.getRealPath("")+"\\Fingerprint_SHA1\\"+"SHA_"+name+".txt";
						   
						  
						   System.out.println("File Path :"+hashtagpath);
						   FileWriter fstream = new FileWriter(hashtagpath);
							
							BufferedWriter out1 = new BufferedWriter(fstream);

					        out1.write(encrypted);
					        out1.close();
					        
					        File f = new File(hashtagpath);
					        
					        System.out.println("file is>>>>>>>>>>>>>>>>>>"+f);
					        String fnm = f.getName();
					  
					      //  here Sha1tag=
					       
			              String sha1=Utilityjava.SHA1(f);
			            
			                System.out.println("SHA1 Key:"+sha1);
			                
			                
			                
			                
				           //=================Date==========//
				            	Calendar currentDate = Calendar.getInstance();
								SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
								SimpleDateFormat formatter1=new SimpleDateFormat("HH:mm:ss");
								String date = formatter.format(currentDate.getTime());
								String time = formatter1.format(currentDate.getTime());
								
								date = date + "  " + time;
								System.out.println("date is>>>>>>>>>>>>>>>>"+date);
								
								//date end============================//
								
								//previous hashcode selection================
								String previousblk=adminDAO.previousblkid();
								System.out.println("genesisblk id is>>>>>>>>>>>>>>>>>>"+previousblk);
								
								
								String previousblkvale=adminDAO.previousblk( previousblk);
								//end==============
					
							    int id  =  adminDAO.getTransID();
							    int fileid=id+1;
								
							    
				                
				                
				        
				                
				                
							    //Random Function for nonce //
						        Random rr = new Random();
							    String randomNumber = String.format("%04d", (Object) Integer.valueOf(rr.nextInt(1001)));
							    System.out.println("randomNumber>>>>>>>>>>>>>>>>>>>>>>>>"+randomNumber);
							    //End
			                
			                
			            
			                
			                
							    
							       String value1=""+previousblkvale+"~"+date+"~"+""+randomNumber+"~"+sha1;
								   
								   System.out.println("Input :"+value1);
								   
								 
					
								   String ConfidentialFilePath = request.getRealPath("")+"\\ConfidentialKeys\\"+"C_"+fileid+".txt";
								   
								  
								   System.out.println("File Path :"+ConfidentialFilePath);
								   FileWriter fstream1 = new FileWriter(ConfidentialFilePath);
									
									BufferedWriter out2 = new BufferedWriter(fstream1);

							        out2.write(value1);
							        out2.close();
							        
							        File f1 = new File(ConfidentialFilePath);
							        
							        String fnmm = f1.getName();
							  
							   	 System.out.println("short filename>>>>>>>>>>>"+f1.getAbsolutePath().substring(f1.getAbsolutePath().lastIndexOf("\\")+1));
							        
							        //End//
				                
							   	 String shortpath=f1.getAbsolutePath().substring(f1.getAbsolutePath().lastIndexOf("\\")+1);
								 
							        String zipblkame="B"+fileid+".zip";
							        
							        //Zip File Code//
				                
				                
				                
				                
				                
				                
							        
								     //   File newFile = new File("D:\\EHR_Blocks\\"+zipblkame);
								        
								        File newFile = new File(zipblkame);
							            System.out.println("newfile>>>>>>>>>>>>>>>>>>>"+newFile);
							            FileOutputStream fos = new FileOutputStream(newFile);
							            System.out.println("fos>>>>>>>>>>>>>>>>>>>>"+fos);
							            
							            
							            
							            
								       // FileOutputStream fos = new FileOutputStream("D:\\EHR_Blocks\\"+zipblkame);
										ZipOutputStream zos = new ZipOutputStream(fos);

										String file1Name = ConfidentialFilePath;
										System.out.println("file1Name>>one>>>>>>>>>>>>>>>"+file1Name);
										String file2Name = hashtagpath;
										System.out.println("file1Name>>>>>two>>>>>>>>>>>>"+file2Name);

										FileUpload.addToZipFile(file1Name, zos);
										FileUpload.addToZipFile(file2Name, zos);
										
										zos.close();
										fos.close();
								
			          	
			boolean result=adminDAO.uidCheck(adharno);
			System.out.println("result is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+result);
			
			if(!result)
			{
				
			
				String server="ftp.drivehq.com";
				String uname="clouddatastore";
				String password="*India123";
				String dir="biometricblockchain";
				flag_upload=Utilityjava.uploadFile(server, uname, password,"B"+fileid+".zip",newFile, dir); 
				
				  result=adminDAO.upload_datasheet(adharno,name,pass, fname, mname, dob, sex, hosueno,village,district,state, pincode, phoneno, emailid, adhar_image, fingerprintfname,featureToEncrypt,previousblkvale,sha1,date,randomNumber,zipblkame);
		
				
			    SendMailAttachment.sendPersonalizedMail(emailid, "Information Related User-ID & Password.....", "Dear "+name+"\n\n\n           User id-"+adharno+" ....\n Password-"+pass+" ......\n\n\n\n\n\n\nThank You...\nE_AADHAAR India\nE_AADHAAR@govr.com  ", "no");
				if(result)
				{
					System.out.println("it came inside the result is>>>>>>>>>>>>> ");
					
					RequestDispatcher rd=null;
					rd=request.getRequestDispatcher("/jsp/admin/upload_datasheets.jsp?no=1");
					rd.forward(request, response);
					
					
				
					}
			}
			else
			{
				RequestDispatcher rd=null;
				rd=request.getRequestDispatcher("/jsp/admin/ViewDatasheet.jsp?no=1");
				rd.forward(request, response);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	} 
	
		
	}

