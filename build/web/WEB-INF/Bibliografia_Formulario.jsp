<%-- 
    Document   : Disciplina_Formulario
    Created on : 13/10/2019, 14:08:41
    Author     : Rodrigo
--%>


<%@page import="entidades.pojo.Bibliografia"%>
<%@page import="entidades.pojo.PropostadeCurso"%>
<%@page import="conexao.PropostadeCursoDAO"%>
<%@page import="conexao.DisciplinaDAO"%>
<%@page import="java.util.List"%>
<%@page import="entidades.pojo.Disciplina"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <title>Formulario Bibliografia </title>
    </head>
<body bgcolor="#00BFFF"  background="lol.jpg" >

    <font style="color: cyan; background: black">
        <form action="BibliografiaServlets" method="post" >
            <%
               Bibliografia bi = (Bibliografia) request.getAttribute("con");
            %>
             <table  border="9" align="right">
                 <tr><td> Lista </td></tr>  
                 
                 <td>Nome da Disciplina </td> <td>Id Disciplina </td> </tr>   
                <%
                    DisciplinaDAO dao= new DisciplinaDAO();
                    List<Disciplina> lista = dao.consultarTodos();

                    for (Disciplina dis : lista) {
                %>

                <tr> 
                    
                    <td> <%out.print(dis.getNome_disciplina());%>      <br>  </td>
                   
                    <td> <%out.print(dis.getPk_disciplina() );%>  <br>  </td>                


                    <%}%>

           </table>
            
            
            Id Bibliográfica :
            <input  type="text" name="pk_bibliografia" value="<%=bi.getPk_bibliografia()%>" >

            Descrição Bibliográfica:
            <input type="text" name="descricao_bibliografia" value="<%=bi.getDescricao_bibliografica()%>">
            <br>
            <br>
            <br>
            Tipo da Bibliográfia <br>
            
            <input type="text" name="tipo_bibliografia" value="<%=bi.getTipo_bibliografica()%>">
            <br>
            <br>
            <br>
            <br>
            <br>
            Id da Disciplina:
            <br>
            <br>
            <input type="text" name="id_disciplina" value="<%=bi.getId_disciplina()%>">
            <br>
            <br>
            <br>
            <br>
            <input type="button" value="Voltar" onClick="history.go(-1)"> 
            <input type="button" value="Limpar" onClick="history.go(0)">

            <input type="submit"  value="Salvar"  onclick="funcao1()">


            <script>
                function funcao1()
                {
                    alert("Sucesso !");
                    alert(" Redirecionando para Página Inicial ");
                }
            </script>

        </form>
</html>
