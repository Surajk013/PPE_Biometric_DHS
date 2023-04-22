package org.apache.jsp.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.util.biometric.Utilityjava;

public final class upload_005fadhar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/jsp/user/menu.jsp");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Biometric Cloud | Upload DataSheet</title>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\t\tvar activeElement = false;\r\n");
      out.write("\t\tfunction setDate( elementName )\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactiveElement = document.forms[0].elements[ elementName ];\r\n");
      out.write("\t\t\tvar w = window.open(\"DateSelector.jsp\", \"DateSelector\", \"width=280,height=280,resizable=no,scrollbars=no,menu=no,location=no,status=no\");\r\n");
      out.write("\t\t\tw.focus();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction GetDateSelectorDate() { return activeElement.value; }\r\n");
      out.write("\t\tfunction SetDateSelectorDate( dateString ) { activeElement.value = dateString; }\r\n");
      out.write("\t\tjavascript:window.history.forward(1);\r\n");
      out.write("\t\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");

	int no=Utilityjava.parse(request.getParameter("no"));
	System.out.println("value is >>>>>"+no);
	

	String un=(String)session.getAttribute("uname");
	
	System.out.println("name is session>>>>>"+un);

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
      out.write("               <!--      <a class=\"navbar-brand\" href=\"#\"> -->\r\n");
      out.write("                      <!--   <img src=\"assets/img/logo.png\" />\r\n");
      out.write("\r\n");
      out.write("                    </a> -->\r\n");
      out.write("                          <h2>Welcome to User <h2>   \r\n");
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
      out.write("   \r\n");
      out.write("    ");

   	
   	String usename=request.getParameter("name");
   	System.out.println("uname in menu is >>>>>"+usename);
   
      out.write("\r\n");
      out.write("   \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar-default navbar-side\" role=\"navigation\">\r\n");
      out.write("            <div class=\"sidebar-collapse\">\r\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/user/upload_adhar.jsp\"><i class=\"fa fa-qrcode \"></i>Upload Adhar Details</a>\r\n");
      out.write("                   ");
 session.setAttribute("uname", usename) ;
      out.write("\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                    \t\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/user/view_adhar_details.jsp\"><i class=\"fa fa-bar-chart-o\"></i>Retrieve Adhar Details</a>\r\n");
      out.write("                    </li> \r\n");
      out.write("                       \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/user/ChangePassword.jsp\"><i class=\"fa fa-edit \"></i>Change Password</a>\r\n");
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
      out.write("        <!-- ============================= Main Body ======================================== -->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!-- /. NAV SIDE  -->\r\n");
      out.write("        <div id=\"page-wrapper\" >\r\n");
      out.write("            <div id=\"page-inner\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                     <h2 style=\"color:#337ab7\">Upload DataSheet</h2>   \r\n");
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
      out.write("                 \r\n");
      out.write("      \t\t\t <!-- ============================= Main ======================================== -->\r\n");
      out.write("              \r\n");
      out.write("                \r\n");
      out.write("              <div class=\"row text-center pad-top\">\r\n");
      out.write("                  \r\n");
      out.write("                  <form name=\"f2\" action=\"");
      out.print( request.getContextPath() );
      out.write("/UploadAdhar\" method=\"post\" enctype=\"multipart/form-data\" >\r\n");
      out.write("                  <section>\r\n");
      out.write("                  \t<div class=\"container\">\r\n");
      out.write("  \t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("    \t\t\t\t\t\t<div class=\"col-sm-9\" >\r\n");
      out.write("    \t\t\t\t\t\t<table class=\"table\">\r\n");
      out.write("    \t\t\t\t\t<tr>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td>Adhar No</td>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td><input type=\"text\" style=\"border-radius: 5px; width: 60%; padding-left: 5px; \" name=\"adharno\" placeholder=\"Adhar No\"></td>\r\n");
      out.write("    \t\t\t\t\t\t\t</tr>\r\n");
      out.write("    \t\t\t\t\t\t\t\r\n");
      out.write("    \t\t\t\t\t\t\t<tr>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td>Upload Finger Print</td>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td><input class=\"input\" type=\"file\" style=\"border-radius: 5px; width: 60%; padding-left: 5px; \" name=\"adharfinger\" placeholder=\"Select Fingerprint\"></td>\r\n");
      out.write("    \t\t\t\t\t\t\t</tr>\r\n");
      out.write("    \t\t\t\t\t\t\t\r\n");
      out.write("    \t\t\t\t\t\t\t\r\n");
      out.write("    \t\t\t\t\t\t\t<tr>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td>Upload Adhar Image</td>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td><input class=\"input\" type=\"file\" style=\"border-radius: 5px; width: 60%; padding-left: 5px; \" name=\"adharface\" placeholder=\"Select Adharimage\"></td>\r\n");
      out.write("    \t\t\t\t\t\t\t</tr>\r\n");
      out.write("    \t\t\t\t\t\t\t\r\n");
      out.write("    \t\t\t\t\t\t\t\r\n");
      out.write("    \t\t\t\t\t\t\t\r\n");
      out.write("    \t\t\t\t\t\t\t\r\n");
      out.write("    \t\t\t\t\t\t\t<tr>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td>\r\n");
      out.write("    \t\t\t\t\t\t\t\t <input type=\"hidden\" name=\"name\" id=\"name\" value=\"");
      out.print(un);
      out.write("\" />\r\n");
      out.write("    \t\t\t\t\t\t\t\t<input type=\"submit\" name=\"submit\"  style=\"border-radius: 2px; width: 30%; padding-left: 5px;\"></td>\t\t\t\t\t\t\t\t\r\n");
      out.write("    \t\t\t\t\t\t\t</tr>\r\n");
      out.write("    \t\t\t\t\t\t\t\r\n");
      out.write("    \t\t\t\t\t\t</table>\r\n");
      out.write("    \t\t\t\t\t\t</div>\r\n");
      out.write("  \t\t\t\t\t\t</div>\r\n");
      out.write("  \t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                 </section>\r\n");
      out.write("  \t\t\t\t</form> <!-------------------------- /. Form End  -------------------------->\r\n");
      out.write("              </div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("             <!-- /. PAGE INNER  -->\r\n");
      out.write("    </div>\r\n");
      out.write("        \r\n");
      out.write(" <!-- ================================================== Main Body End =========================================================== -->\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("         <!-- /. PAGE WRAPPER  -->\r\n");
      out.write("     </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"footer\">\r\n");
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
      out.write("alert(' DataSheet Uploaded Successfull !!!');\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
 
	
}

if(no==2)
{

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("alert(' ');\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
 
	
}
if(no==3)
{

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("alert('This User, Already Having Account!!!');\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
 
	
}


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
