package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studash_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"style.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark primary-background\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"studash.jsp\"> <span class=\"fa fa-graduation-cap\"></span> Feedback System </a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"studash.jsp\"> <span class=\"fa fa-home\"></span> Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"studentlogin.jsp\"> <span class=\"fa fa-home\"></span> Logout <span class=\"sr-only\">(current)</span></a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("<!--            <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                    <span class=\"\tfa fa-check-square-o\"></span> Categories\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Programming Language</a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Project Implementation</a>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Data Structure</a>\n");
      out.write("                </div>\n");
      out.write("            </li>-->\n");
      out.write("\n");
      out.write("<!--            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"about.jsp\"> <span class=\"\tfa fa-address-card-o\"></span> About us </a>\n");
      out.write("            </li>-->\n");
      out.write("<!--            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"login_page.jsp\"> <span class=\"fa fa-user-circle \"></span> Login</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"register_page.jsp\"> <span class=\"fa fa-user-plus \"></span> Sign up</a>\n");
      out.write("            </li>-->\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("<!--        <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("            <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("            <button class=\"btn btn-outline-light my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("        </form>-->\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        \n");
      out.write("            <center>\n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("        \n");
      out.write("            <center>\n");
      out.write("            <h1> Welcome in Student Dashboard</h1>\n");
      out.write("                <h1>Feedback Submission Form</h1>\n");
      out.write("                <hr>\n");
      out.write("                <br>\n");
      out.write("                <form action=\"FeedSer\" method=\"post\">\n");
      out.write("                    <input type=\"text\" name=\"txtbatch\" placeholder=\"Enter BatchName\"/>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"text\" name=\"txtname\" placeholder=\"Enter FacultyName\"/>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"text\" name=\"txtrate\" placeholder=\"Enter FeedBack Rate\"/>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <textarea name=\"txtdesc\" rows=\"3\" cols=\"45\" placeholder=\"Enter Description\"></textarea>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    \n");
      out.write("                    <input type=\"submit\" value=\"Submit\"/>\n");
      out.write("                    <br>\n");
      out.write("                </form>\n");
      out.write("                ");

                    if(request.getParameter("s")!=null)
                    {
                        out.print(request.getParameter("s"));
                    }
                    
      out.write("\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"admindash.jsp\">View Feedback</a>\n");
      out.write("            </center>\n");
      out.write("        </section>\n");
      out.write("        <footer>\n");
      out.write("            \n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
