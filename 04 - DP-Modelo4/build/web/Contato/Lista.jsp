<%-- 
    Document   : listaContato
    Created on : 20/08/2017, 13:37:41
    Author     : thassya
--%>

<%--
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Contatos</title>
    </head>
    <body>
        <h1>Listar Contatos</h1>

        <table>
            <thead>
                <tr>
                    <th>id</th>
                    <th>Nome</th>
                    <th>Email</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>

                <tr>
                    <td>${contato.id}</td>
                    <td>${contato.nome}</td>
                    <td>${contato.email}</td>
                    <td><a href="../FrontController"> editar </a></td> 
                    <td><a href="FrontController?action=ApagarContato"> - excluir</a></td>
                </tr>                 
       
            </tbody>
        </table>

    </body>
</html>
