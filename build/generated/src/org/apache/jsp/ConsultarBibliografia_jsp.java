package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entidades.pojo.Bibliografia;
import java.util.List;
import entidades.pojo.Disciplina;

public final class ConsultarBibliografia_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n");
      out.write("        <title>Bibliografia </title>\n");
      out.write("    </head>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("            function confirmaExclusao(pk_bibliografia) {\n");
      out.write("\n");
      out.write("                if (window.confirm(\"Tem Certeza que Deseja Excluir? \")) {\n");
      out.write("                    location.href = \"http://localhost:8080/ProvaWeb/BibliografiaServlets?acao=exc&pk_bibliografia=\" + pk_bibliografia;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            List<Bibliografia> lista = (List<Bibliografia>) request.getAttribute("lista");
        
      out.write(" \n");
      out.write("\n");
      out.write("        <form width=\"200px\" align=\"center\">\n");
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <tr >\n");
      out.write("\n");
      out.write("                    <th ><input type=\"button\" value=\"Atualizar\" onClick=\"history.go(0)\"></th>\n");
      out.write("                    <th><input type=\"button\" value=\"Voltar\" onClick=\"history.go(-1)\"></th>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <table  aling=\"left\" border=\"9\" >\n");
      out.write("\n");
      out.write("                <tr>    <th> <center>Id Bibliográfica: </center> </th> \n");
      out.write("                <th> <center> Descrição Bibliográfica: </center>  </th>\n");
      out.write("                <th> Id da Disciplina: </th> <th> Tipo da Bibliográfia </th> \n");
      out.write("                <th> Acão </th> \n");
      out.write("                <th> Acão </th>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");
for (Bibliografia bi : lista) {
      out.write("\n");
      out.write("                <tr> \n");
      out.write("                    <td> ");
out.print(bi.getPk_bibliografia());
      out.write("             <br>  </td>\n");
      out.write("                    <td> ");
out.print(bi.getDescricao_bibliografica());
      out.write("      <br>  </td>\n");
      out.write("                    <td> ");
out.print(bi.getId_disciplina());
      out.write("      <br>  </td>\n");
      out.write("                    <td> ");
out.print(bi.getTipo_bibliografica());
      out.write("  <br>  </td>\n");
      out.write("                    \n");
      out.write("                    <td> <a href=\"javascript:confirmaExclusao(");
      out.print(bi.getPk_bibliografia());
      out.write(")\"> Excluir</a>                      </td> \n");
      out.write("                    <td> <a href=\"DisciplinaServlets?acao=alt&id=");
      out.print(bi.getPk_bibliografia());
      out.write("\"> Alterar </a>           </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
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
