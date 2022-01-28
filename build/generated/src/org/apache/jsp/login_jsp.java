package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"pt-br\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Sign In</title>\n");
      out.write("  <!-- Favicon -->\n");
      out.write("  <link rel=\"shortcut icon\" href=\"./img/svg/logo.svg\" type=\"image/x-icon\">\n");
      out.write("  <!-- Custom styles -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"./css/style.min.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div class=\"layer\"></div>\n");
      out.write("<main class=\"page-center\">\n");
      out.write("  <article class=\"sign-up\">\n");
      out.write("    <h1 class=\"sign-up__title\">Login</h1>\n");
      out.write("    \n");
      out.write("    <form class=\"sign-up-form form\" action=\"log\" method=\"POST\">\n");
      out.write("      <label class=\"form-label-wrapper\">\n");
      out.write("        <p class=\"form-label\">Email</p>\n");
      out.write("        <input class=\"form-input\" type=\"email\" name=\"usuario\" placeholder=\"Enter your email\" required>\n");
      out.write("      </label>\n");
      out.write("      <label class=\"form-label-wrapper\">\n");
      out.write("        <p class=\"form-label\">Password</p>\n");
      out.write("        <input class=\"form-input\" type=\"password\" name=\"senha\" placeholder=\"Enter your password\" required>\n");
      out.write("      </label>\n");
      out.write("     \n");
      out.write("      \n");
      out.write("\n");
      out.write("      <input class=\"form-btn primary-default-btn transparent-btn\" value=\"Enviar\" type=\"submit\" >\n");
      out.write("      \n");
      out.write("    </form>\n");
      out.write("  </article>\n");
      out.write("</main>\n");
      out.write("<!-- Chart library -->\n");
      out.write("<script src=\"./plugins/chart.min.js\"></script>\n");
      out.write("<!-- Icons library -->\n");
      out.write("<script src=\"plugins/feather.min.js\"></script>\n");
      out.write("<!-- Custom scripts -->\n");
      out.write("<script src=\"js/script.js\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  //else{\n");
      out.write("   // alert(\"Dados incorretos, tente novamente\");\n");
      out.write("    //window.location = \"elegant/signin.html\";\n");
      out.write(" // }\n");
      out.write("  //if (done == 0) {\n");
      out.write("   // alert(\"Dados incorretos, tente novamente\");\n");
      out.write("\n");
      out.write(" // }\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("\n");
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
