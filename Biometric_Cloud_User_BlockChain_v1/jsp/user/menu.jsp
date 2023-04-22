<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
   
    <%
   	
   	String usename=request.getParameter("name");
   	System.out.println("uname in menu is >>>>>"+usename);
   %>
   
</head>
<body>

	<nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                <%--  <li>
                        <a href="<%=request.getContextPath()%>/jsp/admin/ViewProfile.jsp"><i class="fa fa-bar-chart-o"></i>View Profile</a>
                    </li> --%>
                    <li>
                        <a href="<%=request.getContextPath()%>/jsp/user/upload_adhar.jsp"><i class="fa fa-qrcode "></i>Upload Adhar Details</a>
                   <% session.setAttribute("uname", usename) ;%>
                    </li>
                    <li>
                    	
                        <a href="<%=request.getContextPath()%>/jsp/user/view_adhar_details.jsp"><i class="fa fa-bar-chart-o"></i>Retrieve Adhar Details</a>
                    </li> 
                       
                    <li>
                        <a href="<%=request.getContextPath()%>/jsp/user/ChangePassword.jsp"><i class="fa fa-edit "></i>Change Password</a>
                    </li> 
                    <li>
                        <a href="<%=request.getContextPath()%>/index.jsp?no=2"><i class="fa fa-table "></i>Logout</a>
                    </li>
                    
                </ul>
           </div>
    </nav>


</body>
</html>