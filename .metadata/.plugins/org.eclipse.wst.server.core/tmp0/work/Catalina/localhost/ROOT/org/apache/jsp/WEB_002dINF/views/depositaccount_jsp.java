/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2020-12-11 14:57:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class depositaccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Inqiure/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Inqiure/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1606304214663L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<script src=\"http://code.jquery.com/jquery-3.1.1.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.24.0/moment.min.js\"></script>\n");
      out.write("<title>예금 입력</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<input type=\"button\" id=\"btnadd\" value=\"입력칸 추가\">\n");
      out.write("\t<input type=\"button\" id=\"btndel\" value=\"입력칸 삭제\">\n");
      out.write("\t\n");
      out.write("\t<form id=\"frm\" method=\"post\" action=\"depositaccountinsert\">\n");
      out.write("\t<table id=\"tbl\" border=1>\n");
      out.write("\t<h1>[예금 입력]</h1>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td width=50>번호</td>\n");
      out.write("\t\t\t<td width=100>예금은행명</td>\n");
      out.write("\t\t\t<td width=300>예금계좌번호</td>\n");
      out.write("\t\t\t<td width=200>예금계좌명</td>\n");
      out.write("\t\t\t<td width=50>예금이율</td>\n");
      out.write("\t\t\t<td width=100>예금개설일</td>\n");
      out.write("\t\t\t<td width=100>예금기초잔액</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tbody>\n");
      out.write("\t\t<tr class=\"depositaccount\">\n");
      out.write("\t\t\t<td width=50>1</td>\n");
      out.write("\t\t\t<td width=100 class=\"bankname\"><input type=\"text\" size=30 class=\"depositaccountbankname\" ></td>\n");
      out.write("\t\t\t<td width=300 class=\"code\"><input type=\"text\" size=30 class=\"depositaccountcode\"></td>\n");
      out.write("\t\t\t<td width=200 class=\"name\"><input type=\"text\" size=30 class=\"depositaccountname\" ></td>\n");
      out.write("\t\t\t<td width=50 class=\"rate\"><input type=\"text\" size=30 class=\"depositaccountrate\" ></td>\n");
      out.write("\t\t\t<td width=100 class=\"start\"><input type=\"text\" size=30 class=\"depositaccountstart\" placeholder=\"yyyy/mm/dd\"></td>\n");
      out.write("\t\t\t<td width=100 class=\"amount\"><input type=\"text\" size=30 class=\"depositaccrountamount\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr class=\"depositaccount\">\n");
      out.write("\t\t\t<td width=50>2</td>\n");
      out.write("\t\t\t<td width=100 class=\"bankname\"><input type=\"text\" size=30 class=\"depositaccountbankname\"></td>\n");
      out.write("\t\t\t<td width=300 class=\"code\"><input type=\"text\" size=30 class=\"depositaccountcode\"></td>\n");
      out.write("\t\t\t<td width=200 class=\"name\"><input type=\"text\" size=30 class=\"depositaccountname\" ></td>\n");
      out.write("\t\t\t<td width=50 class=\"rate\"><input type=\"text\" size=30 class=\"depositaccountrate\" ></td>\n");
      out.write("\t\t\t<td width=100 class=\"start\"><input type=\"text\" size=30 class=\"depositaccountstart\"></td>\n");
      out.write("\t\t\t<td width=100 class=\"amount\"><input type=\"text\" size=30 class=\"depositaccrountamount\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr class=\"depositaccount\">\n");
      out.write("\t\t\t<td width=50>3</td>\n");
      out.write("\t\t\t<td width=100 class=\"bankname\"><input type=\"text\" size=30 class=\"depositaccountbankname\"></td>\n");
      out.write("\t\t\t<td width=300 class=\"code\"><input type=\"text\" size=30 class=\"depositaccountcode\"></td>\n");
      out.write("\t\t\t<td width=200 class=\"name\"><input type=\"text\" size=30 class=\"depositaccountname\" ></td>\n");
      out.write("\t\t\t<td width=50 class=\"rate\"><input type=\"text\" size=30 class=\"depositaccountrate\" ></td>\n");
      out.write("\t\t\t<td width=100 class=\"start\"><input type=\"text\" size=30 class=\"depositaccountstart\"></td>\n");
      out.write("\t\t\t<td width=100 class=\"amount\"><input type=\"text\" size=30 class=\"depositaccrountamount\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t</tbody> \n");
      out.write("\t</table>\n");
      out.write("\t\t<input type=\"submit\" value=\"저장\">\n");
      out.write("\t\t<input type=\"reset\" value=\"취소\">\n");
      out.write("\t</form>\n");
      out.write("\t\n");
      out.write("\t<form id=\"frm1\" method=\"post\" action=\"loansaccountinsert\">\n");
      out.write("\t<table id=\"tbl1\" border=1>\n");
      out.write("\t<h1>[대출 입력]</h1>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td width=50>번호</td>\n");
      out.write("\t\t\t<td width=100>대출은행명</td>\n");
      out.write("\t\t\t<td width=300>대출계좌번호</td>\n");
      out.write("\t\t\t<td width=200>대출계좌명</td>\n");
      out.write("\t\t\t<td width=50>대출이율</td>\n");
      out.write("\t\t\t<td width=100>대출원금</td>\n");
      out.write("\t\t\t<td width=100>대출실행일</td>\n");
      out.write("\t\t\t<td width=100>대출만기일</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tbody>\n");
      out.write("\t\t<tr class=\"loansaccount\">\n");
      out.write("\t\t\t<td width=50>1</td>\n");
      out.write("\t\t\t<td width=100 class=\"bankname\"><input type=\"text\" size=30 class=\"loansbankname\"></td>\n");
      out.write("\t\t\t<td width=300 class=\"code\"><input type=\"text\" size=30 class=\"loanscode\"></td>\n");
      out.write("\t\t\t<td width=200 class=\"name\"><input type=\"text\" size=30 class=\"loansname\" ></td>\n");
      out.write("\t\t\t<td width=50 class=\"rate\"><input type=\"text\" size=30 class=\"loansrate\" ></td>\n");
      out.write("\t\t\t<td width=100 class=\"amount\"><input type=\"text\" size=30 class=\"loansamount\" ></td>\n");
      out.write("\t\t\t<td width=100 class=\"start\"><input type=\"text\" size=30 class=\"loansstart\" placeholder=\"yyyy/mm/dd\"></td>\n");
      out.write("\t\t\t<td width=100 class=\"end\"><input type=\"text\" size=30 class=\"loansend\" placeholder=\"yyyy/mm/dd\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr class=\"loansaccount\">\n");
      out.write("\t\t\t<td width=50>2</td>\n");
      out.write("\t\t\t<td width=100 class=\"bankname\"><input type=\"text\" size=30 class=\"loansbankname\"></td>\n");
      out.write("\t\t\t<td width=300 class=\"code\"><input type=\"text\" size=30 class=\"loanscode\"></td>\n");
      out.write("\t\t\t<td width=200 class=\"name\"><input type=\"text\" size=30 class=\"loansname\" ></td>\n");
      out.write("\t\t\t<td width=50 class=\"rate\"><input type=\"text\" size=30 class=\"loansrate\" ></td>\n");
      out.write("\t\t\t<td width=100 class=\"amount\"><input type=\"text\" size=30 class=\"loansamount\" ></td>\n");
      out.write("\t\t\t<td width=100 class=\"start\"><input type=\"text\" size=30 class=\"loansstart\"></td>\n");
      out.write("\t\t\t<td width=100 class=\"end\"><input type=\"text\" size=30 class=\"loansend\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr class=\"loansaccount\">\n");
      out.write("\t\t\t<td width=50>3</td>\n");
      out.write("\t\t\t<td width=100 class=\"bankname\"><input type=\"text\" size=30 class=\"loansbankname\"></td>\n");
      out.write("\t\t\t<td width=300 class=\"code\"><input type=\"text\" size=30 class=\"loanscode\"></td>\n");
      out.write("\t\t\t<td width=200 class=\"name\"><input type=\"text\" size=30 class=\"loansname\" ></td>\n");
      out.write("\t\t\t<td width=50 class=\"rate\"><input type=\"text\" size=30 class=\"loansrate\" ></td>\n");
      out.write("\t\t\t<td width=100 class=\"amount\"><input type=\"text\" size=30 class=\"loansamount\" ></td>\n");
      out.write("\t\t\t<td width=100 class=\"start\"><input type=\"text\" size=30 class=\"loansstart\"></td>\n");
      out.write("\t\t\t<td width=100 class=\"end\"><input type=\"text\" size=30 class=\"loansend\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t</tbody>\n");
      out.write("\t</table>\n");
      out.write("\t\t<input type=\"submit\" value=\"저장\">\n");
      out.write("\t\t<input type=\"reset\" value=\"취소\">\n");
      out.write("\t</form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("\t$(frm1).hide();\n");
      out.write("\t\n");
      out.write("\t$(\"#btnadd\").click(function(){\n");
      out.write("\t\tif(!$(frm).is(\":hidden\")){\n");
      out.write("\t\t\tvar trCnt=$(\"#tbl tr\").length;\n");
      out.write("\t\t\tvar str=\"\";\n");
      out.write("\t\t\tstr+=\"<tr class='depositaccount'>\";\n");
      out.write("\t\t\tstr+=\"<td>\"+trCnt+\"</td>\";\n");
      out.write("\t\t\tstr+=\"<td width=100 class='bankname'><input type='text' size=30 class='depositaccountbankname'></td>\";\n");
      out.write("\t\t\tstr+=\"<td width=300 class='code'><input type='text' size=30 class='depositaccountcode'></td>\";\n");
      out.write("\t\t\tstr+=\"<td width=200 class='name'><input type='text' size=30 class='depositaccountname' ></td>\";\n");
      out.write("\t\t\tstr+=\"<td width=50 class='rate'><input type='text' size=30 class='depositaccountrate' ></td>\";\n");
      out.write("\t\t\tstr+=\"<td width=100 class='start'><input type='text' size=30 class='depositaccountstart'></td>\";\n");
      out.write("\t\t\tstr+=\"<td width=100 class='amount'><input type='text' size=30 class='depositaccrountamount'></td>\";\n");
      out.write("\t\t\tstr+=\"</tr>\";\n");
      out.write("\t\t\t$(\"#tbl > tbody:last\").append(str);\n");
      out.write("\t\t} else if(!$(frm1).is(\":hidden\")){\n");
      out.write("\t\t\tvar trCnt1=$(\"#tbl1 tr\").length;\n");
      out.write("\t\t\tvar str=\"\";\n");
      out.write("\t\t\tstr+=\"<tr class='loansaccount'>\";\n");
      out.write("\t\t\tstr+=\"<td>\"+trCnt1+\"</td>\";\n");
      out.write("\t\t\tstr+=\"<td width=100 class='bankname'><input type='text' size=30 class='loansbankname'></td>\";\n");
      out.write("\t\t\tstr+=\"<td width=300 class='code'><input type='text' size=30 class='loanscode'></td>\";\n");
      out.write("\t\t\tstr+=\"<td width=200 class='name'><input type='text' size=30 class='loansname' ></td>\";\n");
      out.write("\t\t\tstr+=\"<td width=50 class='rate'><input type='text' size=30 class='loansrate' ></td>\";\n");
      out.write("\t\t\tstr+=\"<td width=100 class='amount'><input type='text' size=30 class='loansamount' ></td>\";\n");
      out.write("\t\t\tstr+=\"<td width=100 class='start'><input type='text' size=30 class='loansstart'></td>\";\n");
      out.write("\t\t\tstr+=\"<td width=100 class='end'><input type='text' size=30 class='loansend'></td>\";\n");
      out.write("\t\t\tstr+=\"</tr>\";\n");
      out.write("\t\t\t$(\"#tbl1 > tbody:last\").append(str);\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(\"#btndel\").click(function(e){\n");
      out.write("\t\tif(!$(frm).is(\":hidden\")){\n");
      out.write("\t\t\t$(\"#tbl > tbody:last > tr:last\").remove();\n");
      out.write("\t\t}else if(!$(frm1).is(\":hidden\")){\n");
      out.write("\t\t\t$(\"#tbl1 > tbody:last > tr:last\").remove();\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(frm).submit(function(e){\n");
      out.write("\t\te.preventDefault();\n");
      out.write("\t\tif(!$(frm).is(\":hidden\")){\n");
      out.write("\t\t$(\"#tbl .depositaccount\").each(function(){\n");
      out.write("\t\t\tvar bankname=$(this).find(\".bankname\").find(\".depositaccountbankname\").val();\n");
      out.write("\t\t\tvar code=$(this).find(\".code\").find(\".depositaccountcode\").val();\n");
      out.write("\t\t\tvar name=$(this).find(\".name\").find(\".depositaccountname\").val();\n");
      out.write("\t\t\tvar rate=$(this).find(\".rate\").find(\".depositaccountrate\").val();\n");
      out.write("\t\t\tvar start=$(this).find(\".start\").find(\".depositaccountstart\").val();\n");
      out.write("\t\t\tvar amount=$(this).find(\".amount\").find(\".depositaccrountamount\").val();\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\turl :\"depositaccountinsert\",\n");
      out.write("\t\t\t\tdata :{\"depositaccountbankname\": bankname, \"depositaccountcode\":code,\"depositaccountname\":name, \"depositaccountrate\":rate,\"depositaccount_startday\":start,\"depositaccountamount\":amount},\n");
      out.write("\t\t\t\tsuccess: function(data){\n");
      out.write("\t\t\t\t\talert(\"성공\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\talert(\"저장완료 되었습니다\");\n");
      out.write("\t\t$(frm).hide();\n");
      out.write("\t\t$(frm1).show(); \n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t$(frm1).submit(function(e){\n");
      out.write("\t\te.preventDefault();\n");
      out.write("\t\tif(!$(frm1).is(\":hidden\")){\n");
      out.write("\t\t$(\"#tbl1 .loansaccount\").each(function(){\n");
      out.write("\t\t\tvar bankname=$(this).find(\".bankname\").find(\".loansbankname\").val();\n");
      out.write("\t\t\tvar code=$(this).find(\".code\").find(\".loanscode\").val();\n");
      out.write("\t\t\tvar name=$(this).find(\".name\").find(\".loansname\").val();\n");
      out.write("\t\t\tvar rate=$(this).find(\".rate\").find(\".loansrate\").val();\n");
      out.write("\t\t\tvar amount=$(this).find(\".amount\").find(\".loansamount\").val();\n");
      out.write("\t\t\tvar start=$(this).find(\".start\").find(\".loansstart\").val();\n");
      out.write("\t\t\tvar end=$(this).find(\".end\").find(\".loansend\").val();\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\turl : \"loansaccountinsert\",\n");
      out.write("\t\t\t\tdata : {\"loansaccountbankname\": bankname, \"loansaccountcode\":code, \"loansaccountname\":name, \"loansaccountrate\":rate, \"loansaccount_startday\":start, \"loansaccount_endday\":end, \"loansaccountamount\":amount},\n");
      out.write("\t\t\t\tsuccess: function(data){\n");
      out.write("\t\t\t\t\talert(\"성공\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\talert(\"저장완료 되었습니다\");\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}