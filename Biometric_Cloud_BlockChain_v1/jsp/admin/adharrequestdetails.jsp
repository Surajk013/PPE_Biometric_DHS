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
<title>Biometric Cloud | AdharRequest</title>

<%
	ResultSet rs = null;

    rs = AdminDAO.getadharrequest();
%>

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
                     <h2 >WELCOME TO ADMIN <h2>   
                    <!-- <a class="navbar-brand" href="#">
                        <img src="assets/img/logo.png" />
                    </a> -->
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
                     <h2 style="color:#337ab7">Adhar Request from Users</h2>   
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
    						<form name="f3" action=""></form>
    							<table class="table" >
  									<thead>
    									<tr>
      										<th style="text-align: center; color:#337ab7">AdharNo</th>
      										<th style="text-align: center; color:#337ab7">Name</th>
      								
      										
    									</tr>
  									</thead>
  									
			<%
			if(rs!=null)
			{
				while(rs.next())
					{
			%>
  									<tbody>
    									<tr>
      										<td><%=rs.getString(2)%></td>
      										<td><%=rs.getString(3)%></td>
      										
      										  <td><a href="<%=request.getContextPath()%>/checkadharcardrequest?adharno=<%=rs.getString(2)%>&fingerfeature=<%=rs.getString(3) %>"><input type="submit" value="Verify" name="Verify" style="border-radius: 3px; width: 80%; padding-left: 5px;"></a></td>
      										
      								  <td><a href="<%=request.getContextPath()%>/sendadharcardrequest?adharno=<%=rs.getString(2)%>"><input type="submit" value="Send" name="Send" style="border-radius: 3px; width: 80%; padding-left: 5px;"></a></td>
      										
      									
    									</tr>
  									</tbody>
  									
  			
			<%				
				}
			}
			else
			{
			%>
			<tbody>
    									<tr>
      										<td>No Record Found!!!</td>
      									</tr>
  									</tbody>
			<%			
			}
			%>
								</table>
    						
    						
    						</div>
    					</div>
  						
  						
  						
					</div>
                 </section>
                  
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

alert('DataSheet Updated Successfully!!!');

</script>
<% 
	
}



%>

<%
if(no==2)
{
%>

<script type="text/javascript">

alert('Adhar Details sent Successfully!!!');

</script>
<% 
	
}

%>

</html>