/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-06-27 14:16:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class classQuery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"source/css/bootstrap.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"source/css/bootstrap-responsive.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"source/css/styleee.css\" />\r\n");
      out.write("    <script type=\"text/javascript\" src=\"source/js/jquery2.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"source/js/jquery2.sorted.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"source/js/bootstrap1.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"source/js/ckform.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"source/js/common.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        body {font-size: 20px;\r\n");
      out.write("\t\tfont-size: 20px;\r\n");
      out.write("            padding-bottom: 40px;\r\n");
      out.write("            background-color:#e9e7ef;\r\n");
      out.write("        }\r\n");
      out.write("        .sidebar-nav {\r\n");
      out.write("            padding: 9px 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @media (max-width: 980px) {\r\n");
      out.write("            /* Enable use of floated navbar text */\r\n");
      out.write("            .navbar-text.pull-right {\r\n");
      out.write("                float: none;\r\n");
      out.write("                padding-left: 5px;\r\n");
      out.write("                padding-right: 5px;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("<form class=\"form-inline definewidth m20\" action=\"#\" method=\"get\">\r\n");
      out.write("    <font color=\"#777777\"><strong>视频名称：</strong></font>\r\n");
      out.write("    <input type=\"text\" name=\"menuname\" id=\"menuname\"class=\"abc input-default\" placeholder=\"\" value=\"\">&nbsp;&nbsp; \r\n");
      out.write("    <button type=\"submit\" class=\"btn btn-primary\">查询</button>&nbsp;&nbsp; \r\n");
      out.write("\t<button type=\"button\"  id=\"addnew\"><a href=\"videosAdd.html\">添加视频</a></button>\r\n");
      out.write("</form>\r\n");
      out.write("<table class=\"table table-bordered table-hover definewidth m10\">\r\n");
      out.write("    <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th>视频名称</th>\r\n");
      out.write("        \r\n");
      out.write("        <th>分类</th>\r\n");
      out.write("        <th>上传者</th>\r\n");
      out.write("        <th>上传日期</th>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <th>管理菜单</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("\t     \r\n");
      out.write("        <tr>\r\n");
      out.write("                <td>复仇者联盟</td>\r\n");
      out.write("                <td>电影</td>\r\n");
      out.write("                <td><a href=\"studentdetail.html\">小强</a></td>\r\n");
      out.write("                <td>2016.07.22</td>\r\n");
      out.write("                \r\n");
      out.write("                <td> <button type=\"submit\">删除</button></a></td>\r\n");
      out.write("               \r\n");
      out.write("        </tr>\r\n");
      out.write("           \r\n");
      out.write("       \r\n");
      out.write("       </table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
