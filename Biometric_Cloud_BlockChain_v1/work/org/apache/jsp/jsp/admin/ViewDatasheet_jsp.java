package org.apache.jsp.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.priya.DAO.AdminDAO;
import java.sql.*;
import com.util.biometric.Utilityjava;

public final class ViewDatasheet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/jsp/admin/menu.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Biometric Cloud | View DataSheet</title>\r\n");
      out.write("\r\n");

	ResultSet rs = null;

	rs = AdminDAO.getdatasheetdetails();

      out.write("\r\n");
      out.write("\r\n");

	int no=Utilityjava.parse(request.getParameter("no"));
	System.out.println("value is >>>>>"+no);

      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("      \r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("         <div class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("            <div class=\"adjust-nav\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                     <h2 >WELCOME TO ADMIN <h2>   \r\n");
      out.write("                    <!-- <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("                        <img src=\"assets/img/logo.png\" />\r\n");
      out.write("                    </a> -->\r\n");
      out.write("                </div>\r\n");
      out.write("              \r\n");
      out.write("                <span class=\"logout-spn\" >\r\n");
      out.write("                  <a href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp?no=2\" style=\"color:#fff;\">LOGOUT</a>  \r\n");
      out.write("                </span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /. NAV TOP  -->\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\t<!-- BOOTSTRAP STYLES-->\r\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("     <!-- FONTAWESOME STYLES-->\r\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- CUSTOM STYLES-->\r\n");
      out.write("    <link href=\"assets/css/custom.css\" rel=\"stylesheet\" />\r\n");
      out.write("     <!-- GOOGLE FONTS-->\r\n");
      out.write("   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar-default navbar-side\" role=\"navigation\">\r\n");
      out.write("            <div class=\"sidebar-collapse\">\r\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\r\n");
      out.write("                 <li>\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/admin/ViewProfile.jsp\"><i class=\"fa fa-bar-chart-o\"></i>View Profile</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/admin/upload_datasheets.jsp\"><i class=\"fa fa-qrcode \"></i>Upload DataSheet</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/admin/ViewDatasheet.jsp\"><i class=\"fa fa-bar-chart-o\"></i>View DataSheet</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/admin/adharrequestdetails.jsp\"><i class=\"fa fa-bar-chart-o\"></i>Adhar Request</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                     \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/admin/ChangePassword.jsp\"><i class=\"fa fa-edit \"></i>Change Password</a>\r\n");
      out.write("                    </li> \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp?no=2\"><i class=\"fa fa-table \"></i>Logout</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("           </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("     <!-- ============================= Main Body ======================================== -->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!-- /. NAV SIDE  -->\r\n");
      out.write("        <div id=\"page-wrapper\" >\r\n");
      out.write("            <div id=\"page-inner\">\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                     <h2 style=\"color:#337ab7\">View DataSheet Details</h2>   \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>              \r\n");
      out.write("                 <!-- /. ROW  -->\r\n");
      out.write("                  <hr />\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12 \">\r\n");
      out.write("                        <div class=\"alert alert-info\">\r\n");
      out.write("                             <strong>\r\n");
      out.write("                        </div>\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("                  <!-- /. ROW  --> \r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("       <!-- ============================= Main ======================================== -->\r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("               \r\n");
      out.write("                  \r\n");
      out.write("              <div class=\"row text-center pad-top\">\r\n");
      out.write("                  \r\n");
      out.write("                  <section>\r\n");
      out.write("                  \t<div class=\"container\">\r\n");
      out.write("  \t\t\t\t\t\t\r\n");
      out.write("  \t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("    \t\t\t\t\t\t<div class=\"col-sm-11\" >\r\n");
      out.write("    \t\t\t\t\t\t<form name=\"f3\" action=\"\"></form>\r\n");
      out.write("    \t\t\t\t\t\t\t<table class=\"table\" >\r\n");
      out.write("  \t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("    \t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<th style=\"text-align: center; color:#337ab7\">AdharNo</th>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<th style=\"text-align: center; color:#337ab7\">Name</th>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<!-- <th style=\"text-align: center;\">FName</th>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<th style=\"text-align: center;\">MName</th> -->\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<th style=\"text-align: center; color:#337ab7\">DOB</th>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<th style=\"text-align: center; color:#337ab7\">Sex</th>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t<!-- \t<th style=\"text-align: center;\">HouseNo</th> -->\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t<!-- \t<th style=\"text-align: center;\">Village</th> -->\r\n");
      out.write("      \t\t\t\t\t\t            <!--  <th style=\"text-align: center;\">District</th> -->\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<th style=\"text-align: center; color:#337ab7\">State</th>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<th style=\"text-align: center; color:#337ab7\">Pincode</th>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<th style=\"text-align: center; color:#337ab7\">PhoneNo</th>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<th style=\"text-align: center; color:#337ab7\">EmailId</th>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<!-- <th style=\"text-align: center;\">Edit</th>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<th style=\"text-align: center;\">Delete</th> -->\r\n");
      out.write("    \t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("  \t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("  \t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t");

			if(rs!=null)
			{
				while(rs.next())
					{
			
      out.write("\r\n");
      out.write("  \t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("    \t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString(7));
      out.write("</td>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString(8));
      out.write("</td>\r\n");
      out.write("      \t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("      \t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString(12));
      out.write("</td>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString(13));
      out.write("</td>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString(14));
      out.write("</td>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString(15));
      out.write("</td>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("      \t\t\t\t\t\t\t\t\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("    \t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("  \t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("  \t\t\t\t\t\t\t\t\t\r\n");
      out.write("  \t\t\t\r\n");
      out.write("\t\t\t");
				
				}
			}
			else
			{
			
      out.write("\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("    \t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t<td>No Record Found!!!</td>\r\n");
      out.write("      \t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("  \t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t");
			
			}
			
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("    \t\t\t\t\t\t\r\n");
      out.write("    \t\t\t\t\t\t\r\n");
      out.write("    \t\t\t\t\t\t</div>\r\n");
      out.write("    \t\t\t\t\t</div>\r\n");
      out.write("  \t\t\t\t\t\t\r\n");
      out.write("  \t\t\t\t\t\t\r\n");
      out.write("  \t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                 </section>\r\n");
      out.write("                  \r\n");
      out.write("              </div>\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("    </div>\r\n");
      out.write("             <!-- /. PAGE INNER  -->\r\n");
      out.write("    </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    <!-- ================================= Main Body End ==================================== -->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    <!-- /. PAGE WRAPPER  -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("      \r\n");
      out.write("    \r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\" >\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("     <!-- /. WRAPPER  -->\r\n");
      out.write("    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->\r\n");
      out.write("    <!-- JQUERY SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\r\n");
      out.write("      <!-- BOOTSTRAP SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("      <!-- CUSTOM SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");

if(no==1)
{

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("alert('DataSheet Updated Successfully!!!');\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
 
	
}




      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
