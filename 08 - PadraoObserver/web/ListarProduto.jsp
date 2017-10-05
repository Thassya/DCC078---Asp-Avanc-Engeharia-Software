<%-- 
    Document   : ListarProduto
    Created on : 02/10/2017, 12:41:22
    Author     : thassya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="Models.Produto"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listagem dos Produtos</title>
    </head>
    <body>
        <h1>Produtos</h1>
        <form action="FrontController?action=AlterarEstoqueProduto" method="post">
            <p>
                <label for="idProduto">Selecione o produto:</label>
                <select name="idProduto" id="idProduto">
                    <option value="">Selecione...</option>
                    <c:forEach items="${ProdutosList}" var="prod"> 
                        <option value="<c:out value="${prod.getId()}" />"><c:out value="${prod.getNome()}" /></option>
                    </c:forEach>
                </select>
            </p>
            <p>
                <label for="estoque">Quantidade: </label>
                <input type="text" name="estoque" id="estoque" value="" />
            </p>
            <p>
                <input type="submit" value="Salvar Estoque" />
            </p>
        </form>
    </body>
</html>
