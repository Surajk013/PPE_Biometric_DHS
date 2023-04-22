<%@page import="com.util.biometric.Utilityjava"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Biometric Cloud | Upload DataSheet</title>

<script language="javascript">
		var activeElement = false;
		function setDate( elementName )
		{
			activeElement = document.forms[0].elements[ elementName ];
			var w = window.open("DateSelector.jsp", "DateSelector", "width=280,height=280,resizable=no,scrollbars=no,menu=no,location=no,status=no");
			w.focus();
		}
		function GetDateSelectorDate() { return activeElement.value; }
		function SetDateSelectorDate( dateString ) { activeElement.value = dateString; }
		javascript:window.history.forward(1);
		
</script>

<%
	int no=Utilityjava.parse(request.getParameter("no"));
	System.out.println("value is >>>>>"+no);
%>
   
</head>
<body>
      
    <div id="wrapper">
         <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="adjust-nav">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
               <!--      <a class="navbar-brand" href="#"> -->
                      <!--   <img src="assets/img/logo.png" />

                    </a> -->
                          <h2>WELCOME TO ADMIN <h2>   
                </div>
              
                <span class="logout-spn" >
                  <a href="<%=request.getContextPath()%>/index.jsp?no=2" style="color:#fff;">LOGOUT</a>  
                </span>
            </div>
        </div>
        <!-- /. NAV TOP  -->
        <%@include file="menu.jsp" %>
        
        <!-- ============================= Main Body ======================================== -->
        
        
        
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                    <div class="col-lg-12">
                     <h2 style="color:#337ab7">Upload DataSheet</h2>   
                    </div>
                </div>              
                 <!-- /. ROW  -->
                  <hr />
                <div class="row">
                    <div class="col-lg-12 ">
                        <div class="alert alert-info">
                             <strong>
                        </div>
                       
                    </div>
                 </div>
                  <!-- /. ROW  --> 
                  
                  
                 
      			 <!-- ============================= Main ======================================== -->
              
                
              <div class="row text-center pad-top">
                  
                  <form name="f2" action="<%= request.getContextPath() %>/Upload_DataSheet" method="post" enctype="multipart/form-data" >
                  <section>
                  	<div class="container">
  						<div class="row">
    						<div class="col-sm-9" >
    						<table class="table">
    					<tr>
    								<td>Adhar No</td>
    								<td><input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " name="adharno" placeholder="Adhar No"></td>
    							</tr>
    							<tr>
    								<td>Name</td>
    								<td><input  type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; "  name="name" placeholder="Adhar Name"> </td>
    							</tr>
    						
    							<tr>
    								<td>FName</td>
    								<td><input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " name="fname" placeholder="Father Name"></td>
    							</tr>
    							<tr>
    								<td>MName</td>
    								<td><input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " name="mname" placeholder="Mother Name"></td>
    								
    							</tr>
    							
    							
    							<tr>
    								<td>DOB</td>
    								<td><input type="text" readonly="readonly" style="border-radius: 5px; width: 60%; padding-left: 5px; " name="empDob" placeholder="Dob">
    								</td>
    								<td style="width: 10%;">
    								<input class="button" style="border-radius: 5px; width: 100%; padding-left: 5px;" id="n1" type="button" onclick="setDate('empDob')" value="Select DOB" /><br />
    								</td>
    							</tr>
    							
    							<tr>
    								<td>Sex</td>
    								<td>
    								<input id="n1" type="radio" name="sex" value="male" /> Male <input type="radio" name="sex" value="female" /> Female
    								</td>
    							</tr>
    							
    							
    							
    							
    							
    							<tr>
    								<td>House No</td>
    								<td><input  type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " name="houseno" placeholder="House No"></td>
    							</tr>
    							
    							<tr>
    								<td>Village/City</td>
    								<td><input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " name="village" placeholder="Village"></td>
    							</tr>
    							
    							<tr>
    								<td>District</td>
    								<td><input  type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " name="district" placeholder="District"></td>
    							</tr>
    							
    							<tr>
    								<td>State</td>
    								<td><input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " name="state" placeholder="State"></td>
    							</tr>
    							
    							<tr>
    								<td>Pincode</td>
    								<td><input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " name="pincode" placeholder="pincode"></td>
    							</tr>
    							
    							<tr>
    								<td>PhoneNo</td>
    								<td><input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " name="phoneno" placeholder="phoneno"></td>
    							</tr>
    							<tr>
    								<td>EmailId</td>
    								<td><input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " name="emailid" placeholder="EmailId"></td>
    							</tr>
    							
    							
    							<tr>
    								<td>Upload Adhar Image</td>
    								<td><input class="input" type="file" style="border-radius: 5px; width: 60%; padding-left: 5px; " name="adharface" placeholder="Select Adhar Imagw"></td>
    							</tr>
    							<tr>
    								<td>Upload Finger Print</td>
    								<td><input class="input" type="file" style="border-radius: 5px; width: 60%; padding-left: 5px; " name="adharfinger" placeholder="Select Fingerprint"></td>
    							</tr>
    							
    							
    							
    							
    							<tr>
    								<td></td>
    								<td>
    								<input type="submit" name="submit"  style="border-radius: 2px; width: 30%; padding-left: 5px;"></td>								
    							</tr>
    							
    						</table>
    						</div>
  						</div>
  						
					</div>
                 </section>
  				</form> <!-------------------------- /. Form End  -------------------------->
              </div>
    	</div>
             <!-- /. PAGE INNER  -->
    </div>
        
 <!-- ================================================== Main Body End =========================================================== -->
        

         <!-- /. PAGE WRAPPER  -->
     </div>
        
        
    
    <div class="footer">
            <div class="row">
                <div class="col-lg-12" >
                </div>
            </div>
        </div>
          

     <!-- /. WRAPPER  -->
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.10.2.js"></script>
      <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.min.js"></script>
      <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>
    

</body>

<%
if(no==1)
{
%>

<script type="text/javascript">

alert(' DataSheet Uploaded Successfull !!!');

</script>
<% 
	
}

if(no==2)
{
%>

<script type="text/javascript">

alert(' ');

</script>
<% 
	
}
if(no==3)
{
%>
<script type="text/javascript">

alert('This User, Already Having Account!!!');

</script>
<% 
	
}

%>


</html>