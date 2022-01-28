<%-- 
    Document   : contato
    Created on : 30/11/2021, 11:12:15
    Author     : jhe13
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Fale Conosco</h1>
        <form method="POST" action="Contato">
        nome<input type="text" name="nome"/></br>
        Email<input type="email" name="email"/></br>
        mensagem
        <textarea cols="30" rows="5" name="mensagem">
        </textarea>
        <input type="submit" value="Enviar">
        </form>
        ${msg}
    </body>
</html>
