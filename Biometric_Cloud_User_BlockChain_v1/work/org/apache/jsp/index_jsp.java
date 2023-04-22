package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.util.biometric.Utilityjava;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("    <title>biometric</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("\t<link href=\"css/animate.min.css\" rel=\"stylesheet\"> \r\n");
      out.write("\t<link href=\"css/style.css\" rel=\"stylesheet\" />\t\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    ");

    	int no=Utilityjava.parse(request.getParameter("no"));
    	System.out.println("value is >>>>>"+no);
    
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\t\r\n");
      out.write("\t<header id=\"header\">\r\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top\" role=\"banner\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                   <div class=\"navbar-brand\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index.jsp\"><h1>Biometric\r\n");
      out.write("Identification</h1></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</br></br>\r\n");
      out.write("                </div>\t\t\t\t\r\n");
      out.write("                <div class=\"navbar-collapse collapse\">\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav nav-tabs\" role=\"tablist\">\r\n");
      out.write("\t\t\t\t\t\t\t<li role=\"presentation\"><a href=\"index.jsp\" class=\"active\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li role=\"presentation\"><a href=\"login.jsp\">User</a></li>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\t\r\n");
      out.write("            </div><!--/.container-->\r\n");
      out.write("        </nav><!--/nav-->\t\t\r\n");
      out.write("    </header><!--/header-->\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"slider\">\t\t\r\n");
      out.write("\t\t<div id=\"about-slider\">\r\n");
      out.write("\t\t\t<div id=\"carousel-slider\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t<!-- Indicators -->\r\n");
      out.write("\t\t\t\t<ol class=\"carousel-indicators visible-xs\">\r\n");
      out.write("\t\t\t\t\t<li data-target=\"#carousel-slider\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("\t\t\t\t\t<li data-target=\"#carousel-slider\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t\t\t<li data-target=\"#carousel-slider\" data-slide-to=\"2\"></li>\r\n");
      out.write("\t\t\t\t</ol>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t\t<div class=\"item active\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/2.jpeg\" class=\"img-responsive\" alt=\"\"> \r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.3s\">\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.6s\">\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.9s\">\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"form-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t    <div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/2.jpeg\" class=\"img-responsive\" alt=\"\"> \r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"1.0s\">\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.6s\">\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"1.6s\">\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"form-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t    </div> \r\n");
      out.write("\t\t\t\t    <div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/2.jpeg\" class=\"img-responsive\" alt=\"\"> \r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.3s\">\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.6s\">\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.9s\">\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"form-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t    </div> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<a class=\"left carousel-control hidden-xs\" href=\"#carousel-slider\" data-slide=\"prev\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-angle-left\"></i> \r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<a class=\" right carousel-control hidden-xs\"href=\"#carousel-slider\" data-slide=\"next\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-angle-right\"></i> \r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div> <!--/#carousel-slider-->\r\n");
      out.write("\t\t</div><!--/#about-slider-->\r\n");
      out.write("\t</div><!--/#slider-->\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<!-- <div class=\"col-md-4 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"300ms\">\r\n");
      out.write("\t\t\t\t<h4>About Us</h4>\r\n");
      out.write("\t\t\t\t<p>Day is tellus ac cursus commodo, mauesris condime ntum nibh, ut fermentum mas justo sitters.</p>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"contact-info\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-home fa\"></i>Suite 54 Elizebth Street, Victoria State Newyork, USA </li>\r\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-phone fa\"></i> +38 000 129900</li>\r\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-envelope fa\"></i> info@domain.net</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col-md-4 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"900ms\">\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"\">\r\n");
      out.write("\t\t\t\t\t<h4>Newsletter Registration</h4>\r\n");
      out.write("\t\t\t\t\t<p>Subscribe today to receive the latest Day news via email. You may unsubscribe from this service at any time</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"btn-gamp\">\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" id=\"exampleInputEmail3\" placeholder=\"Enter Email\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div> -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"sub-footer\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"social-icon\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col-md-4 col-md-offset-4\">\r\n");
      out.write("\t\t\t\t<div class=\"copyright\">\r\n");
      out.write("\t\t\t\t\t&copy; DHSinformatics \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("               \r\n");
      out.write("\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t</div>\t\t\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("    <script src=\"js/jquery.js\"></script>\t\t\r\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\t\r\n");
      out.write("\t<script src=\"js/wow.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\twow = new WOW(\r\n");
      out.write("\t {\r\n");
      out.write("\t\r\n");
      out.write("\t\t}\t) \r\n");
      out.write("\t\t.init();\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");

if(no==1)
{

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("alert('Login Failure...');\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
 
	
}

if(no==2)
{

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("alert(' Logout Successfull..!!!');\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
 
	
}

      out.write("\r\n");
      out.write("  </body>\r\n");
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
