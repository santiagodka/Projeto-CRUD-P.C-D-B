package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import conexao.PropostadeCursoDAO;
import entidades.pojo.PropostadeCurso;

public final class PropostadeCurso_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=ISO-8859-1");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#00BFFF\" align=\"center\"  background=\"bibliotecas.png\"> \n");
      out.write("        <form width=\"200px\" align=\"center\" >\n");
      out.write("            <a href=\"http://localhost:8080/ProvaWeb/\" style=\"background: black; color: white \"> <b> Página Inicial </b> </a>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <a href=\"http://localhost:8080/ProvaWeb/PropostadeCursoServlets?acao=cad\"style=\"background: black; color: white \"> <b> Cadastrar Proposta de Curso </b> </a>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <a href=\"http://localhost:8080/ProvaWeb/PropostadeCursoServlets?acao=lis\"style=\"background: black; color: white \"> <b> Consultar Lista de Proposta de Curso </b> </a>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <a href=\"http://localhost:8080/ProvaWeb/PropostadeCursoServlets?acao=lis\"style=\"background: black; color: white \"> <b> Alterar  Proposta de Curso </b> </a>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <a href=\"http://localhost:8080/ProvaWeb/PropostadeCursoServlets?acao=lis\"style=\"background: black; color: white \"> <b> Excluir  Proposta de Curso </b> </a>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
