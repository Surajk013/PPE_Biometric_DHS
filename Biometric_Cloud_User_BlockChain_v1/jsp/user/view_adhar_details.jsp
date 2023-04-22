<%@page import="com.util.biometric.Utilityjava"%>
 <%@page import="com.priya.DAO.UserDAO"%>
  <%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Biometric Cloud | Upload DataSheet</title>

<%
	ResultSet rs = null;
String userid="", username="",address="",phone="",emailid="";
%>

<%
	int no=Utilityjava.parse(request.getParameter("no"));
	System.out.println("value is >>>>>"+no);
%>
   <%
	HttpSession hs=request.getSession();
String userids=(String)hs.getAttribute("uname");
System.out.println("session value in jsp>>>>>>>>>>>"+userids);

String status="verified";

 rs = UserDAO.getAdharDetails(userids,status);
%>

 <% 
while(rs.next())
{
	String image =rs.getString(16);
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
                          <h2>Welcome to <%=userids %> <h2>   
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
    								<td><input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " value=<%=rs.getString(2) %> ></td>
    							</tr>
    							<tr>
    								<td>Name</td>
    								<td><input  type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; "  value=<%=rs.getString(3) %> > </td>
    							</tr>
    						
    							<tr>
    								<td>FName</td>
    								<td><input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; "  value=<%=rs.getString(5) %>></td>
    							</tr>
    							<tr>
    								<td>MName</td>
    								<td><input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; "  value=<%=rs.getString(6) %>></td>
    								
    							</tr>
    							
    							
    							<tr>
    								<td>DOB</td>
    								<td><input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; "  value=<%=rs.getString(7) %>>
    								</td>
    								
    							</tr>
    							
    							<tr>
    								<td>Sex</td>
    								<td>
    								<input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; "  value=<%=rs.getString(8) %>>
    								</td>
    							</tr>
    							
    							
    							
    							<tr>
    								<td>House No</td>
    								<td><input  type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " value=<%=rs.getString(9) %>></td>
    							</tr>
    							
    							<tr>
    								<td>Village/City</td>
    								<td><input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " value=<%=rs.getString(10) %>></td>
    							</tr>
    							
    							<tr>
    								<td>District</td>
    								<td><input  type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " value=<%=rs.getString(11) %> ></td>
    							</tr>
    							
    							<tr>
    								<td>State</td>
    								<td><input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " value=<%=rs.getString(12) %>></td>
    							</tr>
    							
    							<tr>
    								<td>Pincode</td>
    								<td><input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " value=<%=rs.getString(13) %>></td>
    							</tr>
    							
    							<tr>
    								<td>PhoneNo</td>
    								<td><input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " value=<%=rs.getString(14) %>></td>
    							</tr>
    							<tr>
    								<td>EmailId</td>
    								<td><input type="text" style="border-radius: 5px; width: 60%; padding-left: 5px; " value=<%=rs.getString(15) %>></td>
    							</tr>
    							
    							
    							<tr>
    								<td>Upload Adhar Image</td>
    								<td><img src="<%=request.getContextPath()%>/uploadadharimages/<%=rs.getString(16)%>" style="border-radius: 5px; width: 10%; padding-left: 15px; "></img></td>
    							</tr>
    							<tr>
    								<td>Upload Finger Print</td>
    								<td><img src="<%=request.getContextPath()%>/uploadfingerprint/<%=rs.getString(17)%>" style="border-radius: 5px; width: 10%; padding-left: 15px; "></img></td>
    							</tr>
    							
    							
    							
    						
    						</table>
    						
    						<%} %>
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