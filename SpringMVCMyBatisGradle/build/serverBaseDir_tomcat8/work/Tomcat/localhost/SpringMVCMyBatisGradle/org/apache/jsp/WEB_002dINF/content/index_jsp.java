/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-11 07:35:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1495622910166L));
    _jspx_dependants.put("jar:file:/C:/Users/MacBook.DESKTOP-LVCFJIB/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
  }

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
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\r\n");
      out.write("<title>首页</title>\r\n");
      out.write("\r\n");
      out.write("<!--图标样式-->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"source/css/bootstrap.min.css\" />\r\n");
      out.write("\r\n");
      out.write("<!--主要样式-->\r\n");
      out.write("\r\n");
      out.write("<link href=\"source/css/basic.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"source/css/style.css\" />\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"source/js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("    $('.tree li:has(ul)').addClass('parent_li').find(' > span').attr('title', 'Collapse this branch');\r\n");
      out.write("    $('.tree li.parent_li > span').on('click', function (e) {\r\n");
      out.write("        var children = $(this).parent('li.parent_li').find(' > ul > li');\r\n");
      out.write("        if (children.is(\":visible\")) {\r\n");
      out.write("            children.hide('fast');\r\n");
      out.write("            $(this).attr('title', 'Expand this branch').find(' > i').addClass('icon-plus-sign').removeClass('icon-minus-sign');\r\n");
      out.write("        } else {\r\n");
      out.write("            children.show('fast');\r\n");
      out.write("            $(this).attr('title', 'Collapse this branch').find(' > i').addClass('icon-minus-sign').removeClass('icon-plus-sign');\r\n");
      out.write("        }\r\n");
      out.write("        e.stopPropagation();\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"page-header\">\r\n");
      out.write("\t\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t\t热爱创意家居——关于你的我的热爱\r\n");
      out.write("\t\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t\t&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\r\n");
      out.write("\t\t\t\t\t\t当前有");
out.println(application.getAttribute("count"));
      out.write("在线\r\n");
      out.write("\t\t\t\t\t\t&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\r\n");
      out.write("\t\t\t\t\t\t欢迎【");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("】登录\r\n");
      out.write("\t\t\t\t\t\t<a href=\"loginout\">退出</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"index\">首页</a> <span class=\"divider\">/</span>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"owninf\">我的设置</a> <span class=\"divider\">/</span>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"cart\">购物车</a> <span class=\"divider\">/</span>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"order\">订单</a> <span class=\"divider\">/</span>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"collection\">收藏夹</a> <span class=\"divider\">/</span>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"commitorder\">订单评价</a> <span class=\"divider\">/</span>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-pills\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\">\r\n");
      out.write("\t\t\t\t\t\t\t <a href=\"#\"> <span class=\"badge pull-right\">42</span> Home</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t <a href=\"#\"> <span class=\"badge pull-right\">16</span> More</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t                   <div class=\"tree well\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <span><i class=\"icon-folder-open\"></i> 热爱</span> \r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <span><i class=\"icon-minus-sign\"></i> 分类</span> \r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <span><i class=\"icon-minus-sign\"></i> 家具</span>\r\n");
      out.write("                                                <ul>\r\n");
      out.write("                                                    <li>\r\n");
      out.write("                                                        <ul>\r\n");
      out.write("                                                            <li>\r\n");
      out.write("                                                                <span><i class=\"icon-leaf\"></i><a href=\"chair\">桌椅</a></span>\r\n");
      out.write("                                                            </li>\r\n");
      out.write("                                                            <li>\r\n");
      out.write("                                                                <span><i class=\"icon-leaf\"></i><a href=\"bookcase\">书架</a></span> \r\n");
      out.write("                                                            </li>\r\n");
      out.write("                                                        </ul>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <span><i class=\"icon-minus-sign\"></i> 厨房</span>\r\n");
      out.write("                                                <ul>\r\n");
      out.write("                                                    <li>\r\n");
      out.write("                                                        <ul>\r\n");
      out.write("                                                            <li>\r\n");
      out.write("                                                                <span><i class=\"icon-leaf\"></i><a href=\"vessel\">器皿</a></span>\r\n");
      out.write("\r\n");
      out.write("                                                            </li>\r\n");
      out.write("                                                            <li>\r\n");
      out.write("                                                                <span><i class=\"icon-leaf\"></i><a href=\"tool\">用具</a></span>\r\n");
      out.write("                                                            </li>\r\n");
      out.write("                                                        </ul>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t<img alt=\"Bootstrap Image Preview\" src=\"source\\img\\index2.jpg\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"source/js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"source/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"source/js/scripts.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
