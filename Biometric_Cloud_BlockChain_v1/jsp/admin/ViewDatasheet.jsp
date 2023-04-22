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
<title>Biometric Cloud | View DataSheet</title>

<%
	ResultSet rs = null;

	rs = AdminDAO.getdatasheetdetails();
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
                     <h2 style="color:#337ab7">View DataSheet Details</h2>   
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
      								
      										<!-- <th style="text-align: center;">FName</th>
      										<th style="text-align: center;">MName</th> -->
      										<th style="text-align: center; color:#337ab7">DOB</th>
      										<th style="text-align: center; color:#337ab7">Sex</th>
      									<!-- 	<th style="text-align: center;">HouseNo</th> -->
      									<!-- 	<th style="text-align: center;">Village</th> -->
      						            <!--  <th style="text-align: center;">District</th> -->
      										<th style="text-align: center; color:#337ab7">State</th>
      										<th style="text-align: center; color:#337ab7">Pincode</th>
      										<th style="text-align: center; color:#337ab7">PhoneNo</th>
      										<th style="text-align: center; color:#337ab7">EmailId</th>
      										
      										
      										<!-- <th style="text-align: center;">Edit</th>
      										<th style="text-align: center;">Delete</th> -->
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
      										<%-- <td><%=rs.getString(5)%></td>
      										<td><%=rs.getString(6)%></td> --%>
      										<td><%=rs.getString(7)%></td>
      										<td><%=rs.getString(8)%></td>
      								<%-- 		<td><%=rs.getString(9)%></td> --%>
      									<%-- 	<td><%=rs.getString(10)%></td> --%>
      								<%-- 		<td><%=rs.getString(11)%></td> --%>
      										<td><%=rs.getString(12)%></td>
      										<td><%=rs.getString(13)%></td>
      										<td><%=rs.getString(14)%></td>
      										<td><%=rs.getString(15)%></td>
      										
      								
      										<%-- <td><a href="<%=request.getContextPath()%>/jsp/admin/EditEmployee.jsp?id=<%=rs.getString(1)%>"><input type="submit" value="Edit" name="edit"  style="border-radius: 3px; width: 80%; padding-left: 5px;"></a></td>
      										<td><a href="<%=request.getContextPath()%>/jsp/admin/DeleteEmployee.jsp?id=<%=rs.getString(1)%>"><input type="submit" value="Delete" name="delete"  style="border-radius: 3px; width: 80%; padding-left: 5px;"></a></td> --%>
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



</html>