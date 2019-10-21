<%-- 
    Document   : Disciplina_Formulario
    Created on : 13/10/2019, 14:08:41
    Author     : Rodrigo
--%>


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
        <title>Formulario Disciplina </title>
    </head>
<body bgcolor="#00BFFF"  background="lol.jpg" >

    <font style="color: cyan; background: black">
        <form action="DisciplinaServlets" method="post" >
            <%
                Disciplina des = (Disciplina) request.getAttribute("con");
            %>
             <table  border="9" align="right">
                 <tr><td> Lista </td></tr>  
                 
                 <td>Nome do Curso </td> <td>Id do Curso </td> </tr>   
                <%
                    PropostadeCursoDAO dao = new PropostadeCursoDAO();
                    List<PropostadeCurso> lista = dao.consultarTodos();

                    for (PropostadeCurso pro : lista) {
                %>

                <tr> 
                    
                    <td> <%out.print(pro.getNome_curso());%>      <br>  </td>
                   
                    <td> <%out.print(pro.getPk_proposta_curso());%>  <br>  </td>                


                    <%}%>

           </table>
            
            
            Id Disciplina :
            <input  type="text" name="id" value="<%=des.getPk_disciplina()%>" >

            Nome da Disciplina:
            <input type="text" name="nome_disciplina" value="<%=des.getNome_disciplina()%>">
            <br>
            <br>
            <br>
            Carga Horária:<br>
            
            <input type="text" name="carga_horaria" value="<%= des.getCarga_horaria()%>">
            <br>
            <br>
            <br>
            <br>
            <br>
            Informe  Id Escolhido:
            <br>
            <br>
            <input type="text" name="id__proposta_curso" value="<%=des.getId__proposta_curso()%>">
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
