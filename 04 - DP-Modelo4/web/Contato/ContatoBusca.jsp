
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="bean" class="Bean.ContatoBean" scope="page"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ContatoLer</title>
    </head>
    <body>
        <h1>Contato</h1>
        <p>

        <h1>Editar Contato</h1>
        <form action="FrontController?action=EditarContato" method="post">
            <input type="hidden" name="id" value="${id}"/>

            Nome: <input type="text" name="textNome" value="${nome}"/><br/>
            Email: <input type="text" name="textEmail" value="${email}"/><br/>

            Entre com sua empresa:
            <select id="comboEmpresa" name="textCodigoEmpresa">
                <option value="">..</option>
                <c:forEach var="empresa" items="${bean.empresas}">
                    <option  value="${empresa.id}" <c:if test="${empresa.id == idEmpresa}"> selected</c:if> >${empresa.descricao}</option>
                </c:forEach>
            </select> <br/>
            
            <br>
            <input type="submit" value="Salvar"/>  
            
        </form>
            <br>
        <form action="FrontController?action=ApagarContato" method="post">
            <input type="hidden" name="id" value="${id}"/>
            <input type="submit" value="Apagar"/>
        </form>
    </p>
</body>
</html>
