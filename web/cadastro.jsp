<%-- 
    Document   : cadastro
    Created on : 11/09/2021, 14:24:06
    Author     : jhe13
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        
   <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Cadastro</title>
  <!-- Favicon -->
  <!--<link rel="shortcut icon" href="dash/img/svg/logo.svg" type="image/x-icon">-->
  <!-- Custom styles -->
 <!-- <link rel="stylesheet" href="dash/css/style.min.css">-->
   <link rel="stylesheet" href="${pageContext.request.contextPath}/css/cadastro-style.css">
   
  
    </head>

<body>
    
    <main>
        <div class="conteiner">
        <h1>Cadastrar Cliente</h1>
       

        

         <form  action="CadastrarUsuario" method="POST">
             <input type="hidden" name="codigo" value="${usuario.codigo}"/> 
             <label for="nome">
                <p>Nome</p>
                <input  type="text" name="nome" placeholder="Insira o Nome" value="${usuario.nome}" required>
            </label>
             <label for="telefone">
                <p>Telefone</p>
                <input type="text" id="telefone" name="telefone" onkeyup="mask(this, mphone);" onblur="mask(this, mphone);" placeholder="Ex: (00)00000-0000" value="${usuario.telefone}" required/>
            </label>

            <label for="email">
                <p>E-mail</p>
                <input type="email" id="email" name="email" placeholder="exemplo@exemplo.com" value="${usuario.email}" required>
            </label>
             <label for="login">
                <p>Login</p>
                <input type="text" id="login" name="login" placeholder="Login" value="${usuario.login}" required>
            </label>

            <label for="senha">
                <p>Senha</p>
                <input type="password" id="password" name="senha" placeholder="Senha" value="${usuario.senha}" required>
            </label>

            <input type="submit" value="Cadastrar" id="button" onclick='return pergunta();'>
                                
            <!--<button type="button" onclick="window.location.href='${pageContext.request.contextPath}/dashboard.jsp'">Voltar</button>-->
         </form>
                         <button id="botao" onclick="window.location.href='${pageContext.request.contextPath}/dashboard.jsp'">Voltar</button>                   

        <h3>${msg}</h3>
        </div>
        
       
    </main>
        
   
 
<!-- Chart library -->
<script src="${pageContext.request.contextPath}/dash/plugins/chart.min.js"></script>
<!-- Icons library -->
<script src="${pageContext.request.contextPath}/dash/plugins/feather.min.js"></script>
<!-- Custom scripts -->
<script src="${pageContext.request.contextPath}/dash/js/script.js"></script>
<script src="${pageContext.request.contextPath}/dash/js/newscript.js"></script>
 <script>
     
     function pergunta(){ 
   
   return confirm('Tem certeza que quer Cadastrar?');
}
          

       
                </script>


</body>

</html>
