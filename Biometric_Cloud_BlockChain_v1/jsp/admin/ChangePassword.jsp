 <%@page import="com.priya.DAO.AdminDAO"%>
 <%@ page import="java.sql.*" %>
<%@page import="com.util.biometric.Utilityjava"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Biometric Cloud </title>

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
                   <!--  <a class="navbar-brand" href="#"> -->
                       <!--  <img src="assets/img/logo.png" />
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
                     <h2 style="color:#337ab7">Change Password</h2>   
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
                  
                  <section>
                  	<div class="container">
  						
  						<div class="row">
    						<div class="col-sm-11" >
    						<form name="f3" action="<%=request.getContextPath()%>/Changepassword" method="post">
    							<table class="table">
    							<tr>
    								<td>Name</td>
    								<td><input  type="text" style="border-radius: 1px; width: 60%; padding-left: 5px;" name="uname" value=<%=userids %>> </td>
    							</tr>
    						
    							<tr>
    								<td>Old Password</td>
    								<td><input type="text" style="border-radius: 1px; width: 60%; padding-left: 5px;" name="oldname" ></td>
    							</tr>
    							<tr>
    								<td>New Password</td>
    								<td>
    								<input id="n1" type="text"  style="border-radius: 1px; width: 60%; padding-left: 5px;" name="newname"> 
    								</td>
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
                  </form>
              </div>
              
              
    </div>
             <!-- /. PAGE INNER  -->
    </div>
        
        
        
    <!-- ================================= Main Body End ==================================== -->
        
        
        
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

alert('Change Password Updated Successfully!!!');

</script>
<% 
	
}

if(no==2)
{
%>

<script type="text/javascript">

alert('');

</script>
<% 
	
}
if(no==3)
{
%>
<script type="text/javascript">

alert('Error');

</script>
<% 
	
}
if(no==5)
{
%>

<script type="text/javascript">

alert('Employee Deleted Successfully!!!');

</script>
<% 
}
if(no==6)
{
%>
<script type="text/javascript">
alert('Error');
</script>
<% }
%>



</html>