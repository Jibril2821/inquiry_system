/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2023-06-01 07:09:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import util.*;
import java.util.regex.Pattern;

public final class userCheckForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/common/footer.jsp", Long.valueOf(1685414785045L));
    _jspx_dependants.put("/common/userHeader.jsp", Long.valueOf(1685500090460L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("util");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.regex.Pattern");
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

request.setCharacterEncoding("utf-8");
String name = Converter.getParam(request.getParameter("name"));
String readname = Converter.getParam(request.getParameter("readname"));
String age = Converter.getParam(request.getParameter("age"));
String sex = Converter.getParam(request.getParameter("sex"));
String email = Converter.getParam(request.getParameter("email"));
String tel1st = Converter.getParam(request.getParameter("tel1st"));
String tel2nd = Converter.getParam(request.getParameter("tel2nd"));
String tel3rd = Converter.getParam(request.getParameter("tel3rd"));
String addcode1st = Converter.getParam(request.getParameter("addcode1st"));
String addcode2nd = Converter.getParam(request.getParameter("addcode2nd"));
String pref = Converter.getParam(request.getParameter("pref"));
String city = Converter.getParam(request.getParameter("city"));
String other = Converter.getParam(request.getParameter("other"));
String contenttype = Converter.getParam(request.getParameter("contenttype"));
String content = Converter.getParam(request.getParameter("content"));
String consent = Converter.getParam(request.getParameter("consent"));

try {
	int intAge = Integer.parseInt(age);
	if (intAge <= 0) {
		throw new NumberFormatException();
	}
} catch (NumberFormatException e) {
	String error = "年齢の数値が不正です";
	request.setAttribute("error", error);
	request.getRequestDispatcher("/view/userError.jsp").forward(request, response);
	return;
}

try {
	Integer.parseInt(tel1st);
	Integer.parseInt(tel2nd);
	Integer.parseInt(tel3rd);
} catch (NumberFormatException e) {
	String error = "電話番号の数値が不正です";
	request.setAttribute("error", error);
	request.getRequestDispatcher("/view/userError.jsp").forward(request, response);
	return;
}

try {
	Integer.parseInt(addcode1st);
	Integer.parseInt(addcode2nd);
} catch (NumberFormatException e) {
	String error = "郵便番号の数値が不正です";
	request.setAttribute("error", error);
	request.getRequestDispatcher("/view/userError.jsp").forward(request, response);
	return;
}

String patternEmail = "^([a-zA-Z0-9])+([a-zA-Z0-9\\._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9\\._-]+)+$";
Pattern pEmail = Pattern.compile(patternEmail);
if (!pEmail.matcher(email).find()) {
	String error = "メールアドレスがが不正です";
	request.setAttribute("error", error);
	request.getRequestDispatcher("/view/userError.jsp").forward(request, response);
	return;
}

String patternHiragana = "^[\u3040-\u309F]+$";
Pattern pHiragana = Pattern.compile(patternHiragana);
if (!pHiragana.matcher(readname).matches()) {
	String error ="「ふりがな」が「ひらがな」ではありません";
	request.setAttribute("error", error);
	request.getRequestDispatcher("/view/userError.jsp").forward(request, response);
	return;
}

if (consent.equals("disagree")) {
	String error ="個人情報の取り扱いについて同意してください";
	request.setAttribute("error", error);
	request.getRequestDispatcher("/view/userError.jsp").forward(request, response);
	return;
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>お問い合わせフォーム</title>\r\n");
      out.write("\t\t<link rel =\"stylesheet\" href =\"");
      out.print( request.getContextPath() );
      out.write("/css/style.css\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<ul class=\"menu user\">\r\n");
      out.write("\t<li><div><a href=\"");
      out.print( request.getContextPath() );
      out.write("/view/userInputForm.jsp\"><i class=\"fa-solid fa-house\" style=\"color: #5bc8ac;\"></i><br>ホーム</a></div>\r\n");
      out.write("\t<li><div><a href=\"");
      out.print( request.getContextPath() );
      out.write("/view/fqa.jsp\"><i class=\"fa-solid fa-comments\" style=\"color: #5bc8ac;\"></i><br>よくある質問</a></div>\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("<h1>神田英会話スクール</h1>");
      out.write("\r\n");
      out.write("\t\t<h2>お問い合わせフォーム</h2>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<ol class=\"timeline\">\r\n");
      out.write("\t\t\t\t<li class=\"prev\">STEP1:お問い合わせ内容入力</li>\r\n");
      out.write("\t\t\t\t<li class=\"current\">STEP2:入力内容確認</li>\r\n");
      out.write("\t\t\t\t<li>STEP3:送信完了</li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t\t<form method=\"post\">\r\n");
      out.write("\t\t\t\t<h3>送信内容確認</h3>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">■お客様情報</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"formItem\">\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">氏名</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">");
      out.print( name );
      out.write("</p><input type=\"hidden\" name=\"name\" value=\"");
      out.print( name );
      out.write("\" required>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"formItem\">\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">ふりがな</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">");
      out.print( readname );
      out.write("</p><input type=\"hidden\" name=\"readname\" value=\"");
      out.print( readname );
      out.write("\" required>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"formItem\">\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">年齢</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">");
      out.print( age );
      out.write("</p><input type=\"hidden\" name=\"age\" value=\"");
      out.print( age );
      out.write("\" required>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"formItem\">\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">性別</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">");
      out.print( sex );
      out.write("</p><input type=\"hidden\" name=\"sex\" value=\"");
      out.print( sex );
      out.write("\" required>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"formItem\">\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">メールアドレス</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">");
      out.print( email );
      out.write("</p><input type=\"hidden\" name=\"email\" value=\"");
      out.print( email );
      out.write("\" required>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"formItem\">\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">電話番号</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">");
      out.print( tel1st );
      out.write("&nbsp;-&nbsp;");
      out.print( tel2nd );
      out.write("&nbsp;-&nbsp;");
      out.print( tel3rd );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"tel1st\" value=\"");
      out.print( tel1st );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"tel2nd\" value=\"");
      out.print( tel2nd );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"tel3rd\" value=\"");
      out.print( tel3rd );
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">■住所</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"formItem\">\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">郵便番号</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">");
      out.print( addcode1st );
      out.write("&nbsp;-&nbsp;");
      out.print( addcode2nd );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"addcode1st\" value=\"");
      out.print( addcode1st );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"addcode2nd\" value=\"");
      out.print( addcode2nd );
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"formItem\">\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">都道府県</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">");
      out.print( pref );
      out.write("</p><input type=\"hidden\" name=\"pref\" value=\"");
      out.print( pref );
      out.write("\" required>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"formItem\">\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">市区町村</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">");
      out.print( city );
      out.write("</p><input type=\"hidden\" name=\"city\" value=\"");
      out.print( city );
      out.write("\" required>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"formItem\">\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">以降の住所</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">");
      out.print( other );
      out.write("</p><input type=\"hidden\" name=\"other\" value=\"");
      out.print( other );
      out.write("\" required>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">■お問い合わせ詳細</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"formItem\">\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">お問い合わせ項目</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">");
      out.print( contenttype );
      out.write("</p><input type=\"hidden\" name=\"contenttype\" value=\"");
      out.print( contenttype );
      out.write("\" required>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"formItem\">\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">お問い合わせ内容</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"label\">");
      out.print( content );
      out.write("</p><input type=\"hidden\" name=\"content\" value=\"");
      out.print( content );
      out.write("\" required>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<input class=\"send\" type=\"submit\" value=\"送信\" formaction=\"");
      out.print( request.getContextPath() );
      out.write("/userSend\">\r\n");
      out.write("\t\t\t\t\t<input class=\"send\" type=\"submit\" value=\"戻る\" formaction=\"");
      out.print( request.getContextPath() );
      out.write("/view/userInputForm.jsp\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<hr class=\"greenLine\">\r\n");
      out.write("<h4 class=\"footer\">copyright (c) 2023 all rights reserved.</h4>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
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
