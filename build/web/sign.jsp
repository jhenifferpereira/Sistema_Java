<%-- 
    Document   : sign
    Created on : 25/09/2021, 14:11:25
    Author     : jhe13
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/sign-style.css">
</head>
  
<body>
    <main>
        <h1>Login</h1>
       

        

         <form action="Login" method="POST">
            

            <label for="email">
                <span>E-mail</span>
                <input type="email" id="email" name="email" placeholder="Entre com o email" required>
            </label>

            <label for="senha">
                <span>Senha</span>
                <input type="password" id="password" name="senha" placeholder="Entre com a Senha" required>
            </label>

            <input type="submit" value="Entrar" id="button">
            <a href="cadastro.jsp" id="cadastrar">Cadastre-se </a>  
            
        </form>
        
        <h3>${msg}</h3>
    </main>
    
</body>
 
</html>
