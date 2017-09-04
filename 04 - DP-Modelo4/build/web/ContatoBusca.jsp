
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

            <br>
            <input type="submit" value="Salvar"/>  
            
        </form>

        <form action="FrontController?action=ApagarContato" method="post">
            <input type="hidden" name="id" value="${id}"/>
            <input type="submit" value="Apagar"/>
        </form>
    </p>
</body>
</html>
