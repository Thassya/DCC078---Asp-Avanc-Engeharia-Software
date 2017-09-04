<%-- 
    Document   : EmpresaBusca
    Created on : 25/08/2017, 10:35:43
    Author     : thassya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empresa Busca</title>
    </head>
    <body>
       <h1>Empresa</h1>
        <p>

        <h1>Editar Empresa</h1>
        <form action="FrontController?action=EditarEmpresa" method="post">
            <input type="hidden" name="id" value="${id}"/>

            Descrição <input type="text" name="txtDescricao" value="${descricao}"/><br/>

            <br>
            <input type="submit" value="Salvar"/>  
            
        </form>
            <br>
        <form action="FrontController?action=ApagarEmpresa" method="post">
            <input type="hidden" name="id" value="${id}"/>
            <input type="submit" value="Apagar"/>
        </form>
    </body>
</html>
