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
        <title>JSP Page</title>
    </head>
    <body bgcolor="#00BFFF" align="center"  background="bibliotecas.png"> 
        <form width="200px" align="center" >
            <a href="http://localhost:8080/ProvaWeb/" style="background: black; color: white "> <b> Página Inicial </b> </a>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <a href="http://localhost:8080/ProvaWeb/PropostadeCursoServlets?acao=cad"style="background: black; color: white "> <b> Cadastrar Proposta de Curso </b> </a>
            <br>
            <br>
            <br>
            <a href="http://localhost:8080/ProvaWeb/PropostadeCursoServlets?acao=lis"style="background: black; color: white "> <b> Consultar Lista de Proposta de Curso </b> </a>
            <br>
            <br>
            <br>
            <a href="http://localhost:8080/ProvaWeb/PropostadeCursoServlets?acao=lis"style="background: black; color: white "> <b> Alterar  Proposta de Curso </b> </a>
            <br>
            <br>
            <br>
            <a href="http://localhost:8080/ProvaWeb/PropostadeCursoServlets?acao=lis"style="background: black; color: white "> <b> Excluir  Proposta de Curso </b> </a>
        </form>




</html>
