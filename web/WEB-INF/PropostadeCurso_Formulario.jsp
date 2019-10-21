<%-- 
    Document   : PropostadeCurso
    Created on : 04/10/2019, 10:15:11
    Author     : Rodrigo
--%>

<%@page import="conexao.PropostadeCursoDAO"%>
<%@page import="entidades.pojo.PropostadeCurso"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <title>Prencher Campos </title>
    </head>
    <body bgcolor="#00BFFF"> 

        <%
            PropostadeCurso pc = (PropostadeCurso) request.getAttribute("con");


        %>

        <form action="PropostadeCursoServlets" method="post" >

            Id:
            <input  type="text" name="pk_proposta_curso" value="<%=pc.getPk_proposta_curso()%>" >

            Nome do Curso:
            <input type="text" name="nome_curso" value="<%=pc.getNome_curso()%>">
            <br>
            <br>
            <br>
            Descrição do Curso:<br>
            <textarea  rows="9" cols="90" name="descricao" > <%= pc.getDescricao()%> </textarea>

            <br>
            <br>
            <br>
            Perfil de Perfil de Egresso:<br>
            <textarea  rows="9" cols="90" name="perfilegresso" > <%= pc.getPerfilegresso()%> </textarea>
            <br>
            <br>

            <input type="submit"    value="Salvar" onclick="funcao1()" >

            <input type="button" value="Voltar" onClick="history.go(-1)"> 
            <input type="button" value="Limpar" onClick="history.go(0)">




            <script>
                function funcao1()
                {
                    alert("Sucesso !");
                    alert(" Redirecionando para Página Inicial ");
                    
                }
            </script>

        </form>

</html>
