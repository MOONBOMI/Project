/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2020-12-13 14:43:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class categoryread_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script src=\"http://code.jquery.com/jquery-3.1.1.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.24.0/moment.min.js\"></script>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title> 카테고리 정보 </title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h2> [카테고리 정보] </h2>\n");
      out.write("\t\n");
      out.write("<form id=\"frm\" method=\"post\" action=\"categoryupdate\">\n");
      out.write("\t<input type=\"button\" id=\"btnadd\" value=\"입력칸 추가\">\n");
      out.write("\t<input type=\"button\" id=\"btndel\" value=\"입력칸 삭제\">\n");
      out.write("\t<table id=\"tbl\" border=1></table>\n");
      out.write("\t<input type=\"submit\" value=\"저장\">\n");
      out.write("\t<input type=\"reset\" value=\"취소\"> \n");
      out.write("</form>\n");
      out.write("<form id=\"frm1\" method=\"post\" action=\"categoryinsert\">\n");
      out.write("\t<table id=\"tbl1\" border=1></table>\n");
      out.write("\t\t\t\t\n");
      out.write("\t<input type=\"submit\" value=\"저장\">\n");
      out.write("\t<input type=\"reset\" value=\"취소\">\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("$(frm1).hide();\n");
      out.write("\n");
      out.write("getList();\n");
      out.write("\n");
      out.write("function getList() {\n");
      out.write("\tvar addList = \"\";\n");
      out.write("\t$.ajax({\n");
      out.write("\t\ttype:\"get\",\n");
      out.write("\t\turl:\"categorylist.json\",\n");
      out.write("\t\tsuccess:function(data) {\n");
      out.write("\t\t\tif($(data.CATEGORYNAME)!= null){\n");
      out.write("\t\t\t\taddList += \"<thead><td width=100>대분류 상품 코드</td><td width=200>대분류 상품 이름</td></thead></tbody id=''body>\";\n");
      out.write("\t\t\t\t$(data).each(function() {\n");
      out.write("\t\t\t\t\tvar rowspan=3;\n");
      out.write("\t\t\t\t\taddList += \"<tr class='lcategory'><td width=100 class='lcategorycode'>\"+this.CATEGORYCODE.split(\"/\")[1]+\"</td>\";\n");
      out.write("\t\t\t\t\taddList +=\t\"<td width=300 class='lcategoryname'><input type='text' size=30 class='largename' value='\"+this.CATEGORYNAME.split(\"/\")[1]+\"'></td></tr>\";\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\taddList +=\"</tbody>\";\n");
      out.write("\t\t\t\t$(\"#tbl\").html(addList);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("// function getList() {\n");
      out.write("// \tvar addList = \"\";\n");
      out.write("// \t$.ajax({\n");
      out.write("// \t\ttype:\"get\",\n");
      out.write("// \t\turl:\"categorylist.json\",\n");
      out.write("// \t\tsuccess:function(data) {\n");
      out.write("// \t\t\tif($(data.NAME)!= null){\n");
      out.write("// \t\t\t\taddList += \"<thead><td width=100>대분류</td><td width=100>중분류 상품 코드</td><td width=200>중분류 상품 이름</td></thead></tbody id=''body>\";\n");
      out.write("// \t\t\t\t$(data).each(function() {\n");
      out.write("// \t\t\t\t\tvar rowspan=3;\n");
      out.write("// \t\t\t\t\taddList += \"<tr class='row' code='\"+this.CODE+\"' name='\"+this.NAME+\"'><td width=100 class='lcategoryname' >\"+this.NAME.split(\"/\")[1]+\"<input type='button' class='btnaddrow' value='+'</td>\";\n");
      out.write("// \t\t\t\t\taddList += \"<td width=100 class='mcategorycode'>001</td>\";\n");
      out.write("// \t\t\t\t\taddList += \"<td width=100 class='mcategoryname' ><input type='text' size=30  class='midname' placeholder='ex)아메리카노,아이스라떼,카페모카 등..'></td></tr>\";\n");
      out.write("// \t\t\t\t\taddList += \"<tr class='row' code='\"+this.CODE+\"'name='\"+this.NAME+\"'><td width=100 class='mcategorycode'>002</td>\";\n");
      out.write("// \t\t\t\t\taddList += \"<td width=100 class='mcategoryname'><input type='text' size=30 class='midname' ></td></tr>\";\n");
      out.write("// \t\t\t\t\taddList += \"<tr class='row' code='\"+this.CODE+\"'name='\"+this.NAME+\"'><td width=100 class='mcategorycode'>003</td>\";\n");
      out.write("// \t\t\t\t\taddList += \"<td width=100 class='mcategoryname'><input type='text' size=30  class='midname' ></td></tr>\";\n");
      out.write("// \t\t\t\t});\n");
      out.write("// \t\t\t\t\taddList +=\"</tbody>\";\n");
      out.write("// \t\t\t\t$(\"#tbl1\").html(addList);\n");
      out.write("// \t\t\t}\n");
      out.write("// \t\t}\n");
      out.write("// \t});\n");
      out.write("// }\n");
      out.write("\t$(\"#tbl1\").on(\"click\",\".btnaddrow\", function(){\n");
      out.write("\t\tvar clickedrow=$(this).parent().parent();\n");
      out.write("\t\tvar cls=clickedrow.attr(\"code\");\n");
      out.write("\t\tvar newrow=clickedrow.clone();\n");
      out.write("\t\t\n");
      out.write("\t\tnewrow.find(\"td:eq(0)\").remove();\n");
      out.write("\t\tnewrow.insertAfter($(\"#tbl1 .\"+cls+\":last\"));\n");
      out.write("\t\t\n");
      out.write("\t\trowspansize(cls);\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write(" \t//rowspan 조정\n");
      out.write("\tfunction rowspansize(cls) {\n");
      out.write("\t\tvar rowspan =$(\".\"+cls).length;\n");
      out.write("\t\t$(\".\"+cls+\":first td:eq(0)\").attr(\"rowspan\",rowspan);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t$(\"#btnadd\").click(function(){\n");
      out.write(" \t\tif(!$(frm).is(\":hidden\")){\n");
      out.write("\t\t\tvar trCnt=$(\"#tbl tr\").length;\n");
      out.write("\t\t\tif(trCnt<10){\n");
      out.write("\t\t\t\tvar trCnt1 =\"00\"+trCnt;\n");
      out.write("\t\t\t}else if(trCnt<100 && trCnt>=10) {\n");
      out.write("\t\t\t\ttrCnt1=\"0\"+trCnt;\n");
      out.write("\t\t\t}else if(trCnt>=100) {\n");
      out.write("\t\t\t\ttrCnt1=trCnt;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tvar str=\"\";\n");
      out.write("\t\t\tstr+=\"<tr class='lcategory'>\";\n");
      out.write("\t\t\tstr+=\"<td class='lcategorycode'>\"+trCnt1+\"</td>\";\n");
      out.write("\t\t\tstr+=\"<td class='lcategoryname'><input type='text' class='largename' size=30></td>\";\n");
      out.write("\t\t\tstr+=\"</tr>\";\n");
      out.write("\t\t\t$(\"#tbl > tbody:last\").append(str);\n");
      out.write("// \t\t}else if(!$(frm1).is(\":hidden\")){\n");
      out.write("// \t\t\tvar trCnt=$(\"#tbl1 tbody .row\").length;\n");
      out.write("// \t\t\talert(trCnt);\n");
      out.write("// \t\t\tif(trCnt<10){\n");
      out.write("// \t\t\t\tvar trCnt1 =\"00\"+trCnt;\n");
      out.write("// \t\t\t}else if(trCnt<100 && trCnt>=10) {\n");
      out.write("// \t\t\t\ttrCnt1=\"0\"+trCnt;\n");
      out.write("// \t\t\t}else if(trCnt>=100) {\n");
      out.write("// \t\t\t\ttrCnt1=trCnt;\n");
      out.write("// \t\t\t}\n");
      out.write("// \t\t\tvar str=\"\";\n");
      out.write("// \t\t\tstr+=\"<tr class='row'><td width=100 class='mcategorycode'>\"+trCnt1+\"</td>\";\n");
      out.write("// \t\t\tstr+=\"<td width=100 class='mcategoryname'><input type='text' size=30 class='midname' ></td></tr>\";\n");
      out.write("// \t\t\t$(\"#tbl1 > tbody:last\").append(str);\n");
      out.write("\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(\"#btndel\").click(function(e){\n");
      out.write("\t\tif($(\"#tbl tr:last .largename\").val()==\"\"){\n");
      out.write("\t\t\t$(\"#tbl > tbody:last > tr:last\").remove();\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(frm).submit(function(e){\n");
      out.write("\t\te.preventDefault();\n");
      out.write("\t\tif(!$(frm).is(\":hidden\")){\n");
      out.write("\t\t\t$(\"#tbl .lcategory\").each(function(){\n");
      out.write("\t\t\tvar strlcode=$(this).find(\".lcategorycode\").html();\n");
      out.write("\t\t\tvar lcode=\"347-88-00867/\"+strlcode+\"/000\";\n");
      out.write("\t\t\tvar strlname=$(this).find(\".lcategoryname\").find(\".largename\").val();\n");
      out.write("\t\t\tvar lname=\"에이치엘인베스트/\"+strlname+\"/empty\";\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tif(strlname!=\"\"){\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\turl :\"categoryupdate\",\n");
      out.write("\t\t\t\tdata :{\"categorycode\": lcode, \"categoryname\":lname},\n");
      out.write("\t\t\t\tsuccess: function(){\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\talert(\"저장완료 되었습니다\");\n");
      out.write("\t\t$(frm).hide();\n");
      out.write("\t\t$(frm1).show();\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("// \t\t$(frm1).submit(function(e){\n");
      out.write("// \t\te.preventDefault();\n");
      out.write("// \t\tif(!$(frm1).is(\":hidden\")){\n");
      out.write("// \t\t\t$(\"#tbl1 .row\").each(function() {\n");
      out.write("// \t\t\t\tvar lcode=$(this).attr(\"code\");//153-60-00064/001\n");
      out.write("// \t\t\t\tvar lname=$(this).attr(\"name\");//골드스탁/컴퓨터\n");
      out.write("//  \t\t\t\tvar strmcode=$(this).find(\".mcategorycode\").html();//001\n");
      out.write("//  \t\t\t\tvar mcode=lcode+\"/\"+strmcode;\n");
      out.write("//  \t\t\t\tvar strmname=$(this).find(\".mcategoryname\").find(\".midname\").val();\n");
      out.write("//  \t\t\t\tvar mname=lname+\"/\"+strmname;\n");
      out.write("// \t\t\t\tif(strmname!=\"\"){\n");
      out.write("// \t\t\t\t\t$.ajax({\n");
      out.write("// \t\t\t\t\t\ttype : \"post\", \n");
      out.write("// \t\t\t\t\t\turl :\"categoryinsert\",\n");
      out.write("// \t\t\t\t\t\tdata :{\"categorycode\": mcode, \"categoryname\":mname},\n");
      out.write("// \t\t\t\t\t\tsuccess: function(){\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("// \t\t\t\t\t\t}\n");
      out.write("// \t\t\t\t\t});\n");
      out.write("// \t\t\t\t}\n");
      out.write("// \t\t\t});\n");
      out.write("// \t\talert(\"저장완료 되었습니다\");\n");
      out.write("// \t\t}\n");
      out.write("// \t});\n");
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
