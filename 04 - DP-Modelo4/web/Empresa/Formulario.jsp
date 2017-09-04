<%-- 
    Document   : Formulario
    Created on : 25/08/2017, 10:20:58
    Author     : thassya
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%--
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Empresa</h1>
        <form action="../FrontController?action=GravarEmpresa" method="post">
            Entre com a descricao
            <input type="text" name="txtDescricao"/><br/>           
            <input type="submit" value="Cadastrar"/>
        </form>
        
        <br>
        <br>
        
        <form action="../FrontController?action=LerEmpresa" method="post">
            <input type="number" name="id"/>
            <input type="submit" value="Buscar"/>
        </form>

    </body>
</html>
