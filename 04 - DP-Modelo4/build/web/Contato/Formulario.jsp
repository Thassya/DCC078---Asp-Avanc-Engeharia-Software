<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<jsp:useBean id="bean" class="Bean.ContatoBean" scope="page"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%--
The taglib directive below imports the JSTL library. If you uncomment it,
you must also add the JSTL library to the project. The Add Library... action
on Libraries node in Projects view can be used to add the JSTL 1.1 library.
--%>
<%--
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Contatos</title>
    </head>
    <body>

        <h1>Cadastro de Contatos</h1>
        <form action="../FrontController?action=GravarContato" method="post">
            Entre com seu Nome:
            <input type="text" name="textNome"/><br/>
            
            Entre com seu Email:
            <input type="text" name="textEmail"/><br/>
            
            Entre com sua Empresa:
            <select id="comboEmpresa" name="textCodigoEmpresa">
                <option value="">..</option>
                <c:forEach var="empresa" items="${bean.empresas}">
                    <option value="${empresa.id}">${empresa.descricao}</option>
                </c:forEach>
            </select>
            <input type="submit" value="Cadastrar"/>
        </form>
        
        <br>
        <br>
        
        <form action="../FrontController?action=LerContato" method="post">
            <input type="number" name="codigo"/>
            <input type="submit" value="Buscar"/>
        </form>

        <%--
        This example uses JSTL, uncomment the taglib directive above.
        To test, display the page like this: index.jsp?sayHello=true&name=Murphy
        --%>
        <%--
        <c:if test="${param.sayHello}">
            <!-- Let's welcome the user ${param.name} -->
            Hello ${param.name}!
        </c:if>
        --%>

    </body>
</html>
