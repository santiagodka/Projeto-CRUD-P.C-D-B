package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import entidades.pojo.PropostadeCurso;

public final class ConsultarPdC_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n");
      out.write("        <title>Consultar Proposta de Curso </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function confirmaExclusao(pk_proposta_curso) {\n");
      out.write("\n");
      out.write("                if (window.confirm(\"Tem Certeza que Deseja Excluir? \")) {\n");
      out.write("                    location.href = \"http://localhost:8080/ProvaWeb/PropostadeCursoServlets?acao=exc&pk_proposta_curso=\" + pk_proposta_curso;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            List<PropostadeCurso> lista = (List<PropostadeCurso>) request.getAttribute("lista");
        
      out.write("\n");
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
      out.write("            <table border=\"9\">\n");
      out.write("\n");
      out.write("                <tr>    <th> <center>Id Proposta de Curso : </center> </th> \n");
      out.write("                <th> <center> Nome do Curso </center>  </th>\n");
      out.write("                <th> Descrição </th> <th> Perfil de Egresso </th> \n");
      out.write("                <th> Acão </th> \n");
      out.write("                <th> Acão </th>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");
for (PropostadeCurso pro :lista) {
      out.write("\n");
      out.write("                <tr> \n");
      out.write("                    <td> ");
out.print(pro.getPk_proposta_curso());
      out.write("             <br>  </td>\n");
      out.write("                    <td> ");
out.print(pro.getNome_curso());
      out.write("      <br>  </td>\n");
      out.write("                    <td> ");
out.print(pro.getDescricao());
      out.write("      <br>  </td>\n");
      out.write("                    <td> ");
out.print(pro.getPerfilegresso());
      out.write("      <br>  </td>\n");
      out.write("                    \n");
      out.write("                    <td> <a href=\"javascript:confirmaExclusao(");
      out.print(pro.getPk_proposta_curso());
      out.write(")\"> Excluir</a>                      </td> \n");
      out.write("                    <td> <a href=\"PropostadeCursoServlets?acao=alt&pk_proposta_curso=");
      out.print(pro.getPk_proposta_curso());
      out.write("\"> Alterar </a>           </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("\n");
      out.write("               \n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
