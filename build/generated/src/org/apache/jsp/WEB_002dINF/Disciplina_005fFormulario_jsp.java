package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entidades.pojo.PropostadeCurso;
import conexao.PropostadeCursoDAO;
import conexao.DisciplinaDAO;
import java.util.List;
import entidades.pojo.Disciplina;

public final class Disciplina_005fFormulario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n");
      out.write("        <title>Formulario Disciplina </title>\n");
      out.write("    </head>\n");
      out.write("<body bgcolor=\"#00BFFF\"  background=\"lol.jpg\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"DisciplinaServlets\" method=\"post\" >\n");
      out.write("            ");

                Disciplina des = (Disciplina) request.getAttribute("con");
            
      out.write("\n");
      out.write("             <table  border=\"9\" align=\"right\">\n");
      out.write("                 <tr><td> Lista </td></tr>  \n");
      out.write("                 \n");
      out.write("                 <td>Nome do Curso </td> <td>Id do Curso </td> </tr>   \n");
      out.write("                ");

                    PropostadeCursoDAO dao = new PropostadeCursoDAO();
                    List<PropostadeCurso> lista = dao.consultarTodos();

                    for (PropostadeCurso pro : lista) {
                
      out.write("\n");
      out.write("\n");
      out.write("                <tr> \n");
      out.write("                    \n");
      out.write("                    <td> ");
out.print(pro.getNome_curso());
      out.write("      <br>  </td>\n");
      out.write("                   \n");
      out.write("                    <td> ");
out.print(pro.getPk_proposta_curso());
      out.write("  <br>  </td>                \n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("\n");
      out.write("           </table>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            Id Disciplina :\n");
      out.write("            <input  type=\"text\" name=\"id\" value=\"");
      out.print(des.getPk_disciplina());
      out.write("\" >\n");
      out.write("\n");
      out.write("            Nome da Disciplina:\n");
      out.write("            <input type=\"text\" name=\"nome_disciplina\" value=\"");
      out.print(des.getNome_disciplina());
      out.write("\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Carga Horária:<br>\n");
      out.write("            \n");
      out.write("            <input type=\"text\" name=\"carga_horaria\" value=\"");
      out.print( des.getCarga_horaria());
      out.write("\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Informe  Id Escolhido:\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" name=\"id__proposta_curso\" value=\"");
      out.print(des.getId__proposta_curso());
      out.write("\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"button\" value=\"Voltar\" onClick=\"history.go(-1)\"> \n");
      out.write("            <input type=\"button\" value=\"Limpar\" onClick=\"history.go(0)\">\n");
      out.write("\n");
      out.write("            <input type=\"submit\"  value=\"Salvar\"  onclick=\"funcao1()\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                function funcao1()\n");
      out.write("                {\n");
      out.write("                    alert(\"Sucesso !\");\n");
      out.write("                    alert(\" Redirecionando para Página Inicial \");\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("        </form>\n");
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
