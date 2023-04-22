<%@page import="com.util.biometric.Utilityjava"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Biometric Attendance | Home</title>


  
   <%
   	int no=Utilityjava.parse(request.getParameter("no"));
   	System.out.println("value is >>>>>"+no);
   	String uname=request.getParameter("name");
   	System.out.println("uname in home is >>>>>"+uname);
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
                  <!--   <a class="navbar-brand" href="#">
                        <img src="assets/img/logo.png" />

                    </a> -->
                      <h2>Welcome to <%=uname %> <h2>   
                </div>
              
                <span class="logout-spn" >
                  <a href="<%=request.getContextPath()%>/index.jsp?no=2" style="color:#fff;">Logout</a>  
                </span>
            </div>
        </div>
        <!-- /. NAV TOP  -->
        <%@include file="menu.jsp" %>
        <input type="hidden" name="uname" value="uname">
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                    <div class="col-lg-12">
                    <!--  <h2>WELCOME TO ADMIN </h2>    -->
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
                  
    </div>
             <!-- /. PAGE INNER  -->
            </div>
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

alert('Login Successfull!!!');

</script>
<% 
	
}

%>


<%
if(no==2)
{
%>

<script type="text/javascript">

alert('Change Password Updated Successfull..!!!');

</script>
<% 
	
}

%>
</html>