/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2023-06-02 00:14:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.*;
import util.*;
import java.util.*;
import bean.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/common/footer.jsp", Long.valueOf(1685414785045L));
    _jspx_dependants.put("/common/adminHeader.jsp", Long.valueOf(1685595136036L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("util");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("bean");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      out.write("\r\n");
      out.write("\r\n");

ArrayList<InquiryList> inquiryList = (ArrayList<InquiryList>)request.getAttribute("inquiry_list");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>お問い合わせシステム</title>\r\n");
      out.write("\t\t<link rel =\"stylesheet\" href =\"");
      out.print( request.getContextPath() );
      out.write("/css/style.css\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");

Admin admin = (Admin)session.getAttribute("admin");
if (admin == null) {
	String error ="セッション切れです";
	request.setAttribute("error", error);
	request.getRequestDispatcher("/view/databaseAdminError.jsp").forward(request, response);
	return;
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<ul class=\"menu admin\">\r\n");
      out.write("\t<li><div><a href=\"");
      out.print( request.getContextPath() );
      out.write("/list\"><i class=\"fa-solid fa-house\" style=\"color: #5bc8ac;\"></i><br>新着</a></div>\r\n");
      out.write("\t<li><div><a href=\"");
      out.print( request.getContextPath() );
      out.write("/historyList\"><i class=\"fa-solid fa-clock\" style=\"color: #5bc8ac;\"></i><br>履歴</a></div>\r\n");
      out.write("\t<li><div><a href=\"");
      out.print( request.getContextPath() );
      out.write("/view/accountSetting.jsp\"><i class=\"fa-solid fa-gear\" style=\"color: #5bc8ac;\"></i><br>設定</a>\r\n");
      out.write("\t<li><div><p><b>【ユーザー】<br>");
      out.print( admin.getName() );
      out.write("</b></p></div>\r\n");
      out.write("\t<li><div><a href=\"");
      out.print( request.getContextPath() );
      out.write("/logout\"><i class=\"fa-solid fa-right-from-bracket\" style=\"color: #5bc8ac;\"></i><br>ログアウト</a></div>\r\n");
      out.write("</ul>\r\n");
      out.write("<h1>お問い合わせシステム</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<h2>新着お問い合わせ一覧</h2>\r\n");
      out.write("\t\t<table class=\"list\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th class=\"admin\" width=\"50\">NO.</th>\r\n");
      out.write("\t\t\t\t<th class=\"admin\" width=\"300\">名前</th>\r\n");
      out.write("\t\t\t\t<th class=\"admin\" width=\"300\">種類</th>\r\n");
      out.write("\t\t\t\t<th class=\"admin\" width=\"500\">お問い合わせ日時</th>\r\n");
      out.write("\t\t\t\t<th class=\"admin\" width=\"750\">お問い合わせ内容</th>\r\n");
      out.write("\t\t\t\t<th class=\"admin\" colspan=\"2\" width=\"500\"></th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

			if (inquiryList != null) {
				for (InquiryList inquiry : inquiryList) {
					if (inquiry.getDeleted().equals("0")) {
			
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"admin inquiryno\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/detail?inquiryno=");
      out.print( inquiry.getInquiryno() );
      out.write('"');
      out.write('>');
      out.print( inquiry.getInquiryno() );
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t<td class=\"admin\">");
      out.print( inquiry.getName() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td class=\"admin\" style=\"background-color: ");
      out.print( Converter.getColorForInquiryList(inquiry.getInquiryname()) );
      out.write('"');
      out.write('>');
      out.print( Converter.convertInquiryname(inquiry.getInquiryname()) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td class=\"admin\">");
      out.print( inquiry.getDate() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td class=\"admin\">");
      out.print( (inquiry.getContents().length() < 12) ? inquiry.getContents() : inquiry.getContents().substring(0, 12) + "..." );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td class=\"admin controll\" width=\"300\" bgcolor=\"\r\n");
      out.write("\t\t\t\t\t");
if (inquiry.getReply().equals("0")) { 
      out.write("\r\n");
      out.write("\t\t\t\t\tred\r\n");
      out.write("\t\t\t\t\t");
 } else if (inquiry.getReply().equals("1")) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t#cccccc\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\">\r\n");
      out.write("\t\t\t\t\t");

					if (inquiry.getReply().equals("0")) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<a class=\"reply\" href=\"");
      out.print( request.getContextPath() );
      out.write("/detail?inquiryno=");
      out.print( inquiry.getInquiryno() );
      out.write("\">返信</a>\r\n");
      out.write("\t\t\t\t\t");

					} else if(inquiry.getReply().equals("1")) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t返信済み\r\n");
      out.write("\t\t\t\t\t");

					}
					
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td class=\"admin\" bgcolor=\"yellow\" width=\"200\"><a class=\"delete controll\" href=\"");
      out.print( request.getContextPath() );
      out.write("/deleteFromList?inquiryno=");
      out.print( inquiry.getInquiryno() );
      out.write("\">削除</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

					}
				}
			}
			
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<hr class=\"greenLine\">\r\n");
      out.write("<h4 class=\"footer\">copyright (c) 2023 all rights reserved.</h4>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
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
