/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-11 02:57:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mngindex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>后台管理</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href=\"source/css/adminStyle.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<title>热爱家居购物网站后台管理</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"source/js/jquery1.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(\r\n");
      out.write("\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t$(\".div2\").click(\r\n");
      out.write("\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t$(this).next(\"div\").slideToggle(\"slow\").siblings(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\".div3:visible\").slideUp(\"slow\");\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\tfunction openurl(url) {\r\n");
      out.write("\t\tvar rframe = parent.document.getElementById(\"rightFrame\");\r\n");
      out.write("\t\trframe.src = url;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tfont-family: 微软雅黑;\r\n");
      out.write("\tbackground-image: url(images/.jpg);\r\n");
      out.write("\tbackground-repeat: no-repea;\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("\tbackground-attachment: fixed;\r\n");
      out.write("\tbackground-color: #DDDDDD\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".top1 {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 0px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 20px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\tfont-size: 17px;\r\n");
      out.write("\tfont-height: 20px;\r\n");
      out.write("\tfont-family: 楷体;\r\n");
      out.write("\tbackground-color: #888888\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".title {\r\n");
      out.write("float:left;\r\n");
      out.write("    margin:-32px 20px;\r\n");
      out.write("\tfont-size: 40px;\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\tfont-height: 55px;\r\n");
      out.write("\tfont-family: 隶书;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".top2 {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 20px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 77px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tcolor: #ccffff;\r\n");
      out.write("\tbackground-color: #888888\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".left {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft: 0px;\r\n");
      out.write("\ttop: 97px;\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\theight: 85%;\r\n");
      out.write("\tborder-right: 1px solid #9370DB;\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tbackground-color: #B3B3B3\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".right {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft: 200px;\r\n");
      out.write("\ttop:97px;\r\n");
      out.write("\twidth: 85.2%;\r\n");
      out.write("\theight: 85%;\r\n");
      out.write("\tborder-top: 0px solid #484860;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".end {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tbottom: 0px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tcolor: #556B2F;\r\n");
      out.write("\tfont-size: 17px;\r\n");
      out.write("\tfont-height: 20px;\r\n");
      out.write("\tfont-family: 楷体;\r\n");
      out.write("\tbackground-color: #C0C0C0\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".div1 {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\tpadding-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".div2 {\r\n");
      out.write("\theight: 40px;\r\n");
      out.write("\tline-height: 40px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tborder-bottom: #ccc 0px dotted;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".spgl {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\theight: 20px;\r\n");
      out.write("\twidth: 20px;\r\n");
      out.write("\tleft: 40px;\r\n");
      out.write("\ttop: 10px;\r\n");
      out.write("\tbackground: url(images/1.png);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".yhgl {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\theight: 20px;\r\n");
      out.write("\twidth: 20px;\r\n");
      out.write("\tleft: 40px;\r\n");
      out.write("\ttop: 10px;\r\n");
      out.write("\tbackground: url(images/4.png);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".gggl {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\theight: 20px;\r\n");
      out.write("\twidth: 20px;\r\n");
      out.write("\tleft: 40px;\r\n");
      out.write("\ttop: 10px;\r\n");
      out.write("\tbackground: url(images/4.png);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".zlgl {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\theight: 20px;\r\n");
      out.write("\twidth: 20px;\r\n");
      out.write("\tleft: 40px;\r\n");
      out.write("\ttop: 10px;\r\n");
      out.write("\tbackground: url(images/4.png);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pjgl {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\theight: 20px;\r\n");
      out.write("\twidth: 20px;\r\n");
      out.write("\tleft: 40px;\r\n");
      out.write("\ttop: 10px;\r\n");
      out.write("\tbackground: url(images/4.png);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tcht {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\theight: 20px;\r\n");
      out.write("\twidth: 20px;\r\n");
      out.write("\tleft: 40px;\r\n");
      out.write("\ttop: 10px;\r\n");
      out.write("\tbackground: url(images/2.png);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".div3 {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tfont-size: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".div3 ul {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".div3 li {\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\tline-height: 30px;\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("\tborder-bottom: #ccc 1px dotted;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("\tfont-size: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".a1 {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"top1\">\r\n");
      out.write("\t\t<marquee scrollAmount=2 width=300>欢迎进入热爱家居后台管理系统！</marquee>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"top2\">\r\n");
      out.write("\t\t<div class=\"title\" >\r\n");
      out.write("\t\t\t<h3>热爱家居购物网站后台管理</h3>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"fr top-link\">\r\n");
      out.write("\t\t\t<a href=\"admin_list.html\" target=\"mainCont\" title=\"DeathGhost\"><i\r\n");
      out.write("\t\t\t\tclass=\"adminIcon\"></i><span>欢迎管理员：【");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("】登录</span></a> \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"left\">\r\n");
      out.write("\t\t<div class=\"div1\">\r\n");
      out.write("\t\t\t<div class=\"left_top\">\r\n");
      out.write("\t\t\t\t<img src=\"source\\img\\/bbb_01.jpg\"><img src=\"source\\img\\bbb_02.jpg\"\r\n");
      out.write("\t\t\t\t\tid=\"2\"><img src=\"source\\img\\bbb_03.jpg\"><img\r\n");
      out.write("\t\t\t\t\tsrc=\"source\\img\\bbb_04.jpg\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"div2\">\r\n");
      out.write("\t\t\t\t<div class=\"spgl\"></div>\r\n");
      out.write("\t\t\t\t商品管理\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"div3\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"a\" href=\"javascript:void(0);\"\r\n");
      out.write("\t\t\t\t\t\tonClick=\"openurl('mnggood.html');\">商品查看</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"a\" href=\"javascript:void(0);\"\r\n");
      out.write("\t\t\t\t\t\tonClick=\"openurl('mngaddgood.html');\">商品添加</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"div2\">\r\n");
      out.write("\t\t\t\t<div class=\"yhgl\"></div>\r\n");
      out.write("\t\t\t\t订单管理\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"div3\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"a\" href=\"javascript:void(0);\"\r\n");
      out.write("\t\t\t\t\t\tonClick=\"openurl('mngorder.html');\">订单查看</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"div2\">\r\n");
      out.write("\t\t\t\t<div class=\"yhgl\"></div>\r\n");
      out.write("\t\t\t\t销售情况\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"div3\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"a\" href=\"javascript:void(0);\"\r\n");
      out.write("\t\t\t\t\t\tonClick=\"openurl('mngxskc.html');\">库存量及库存量</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"div2\">\r\n");
      out.write("\t\t\t\t<div class=\"gggl\"></div>\r\n");
      out.write("\t\t\t\t评价管理\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"div3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"a\" href=\"javascript:void(0);\"\r\n");
      out.write("\t\t\t\t\t\tonClick=\"openurl('mngcommit.html');\">评价查看</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<a class=\"a1\" href=\"mngloginout\"><div class=\"div2\">\r\n");
      out.write("\t\t\t\t\t<div class=\"tcht\"></div>\r\n");
      out.write("\t\t\t\t\t退出后台\r\n");
      out.write("\t\t\t\t</div></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"right\">\r\n");
      out.write("\t\t<iframe id=\"rightFrame\" name=\"rightFrame\" width=\"100%\" height=\"100%\"\r\n");
      out.write("\t\t\tscrolling=\"auto\" marginheight=\"0\" marginwidth=\"0\" align=\"center\"\r\n");
      out.write("\t\t\tstyle=\"border: 0px solid #CCC; margin: 0; padding: 0;\"></iframe>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
