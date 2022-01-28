<%-- 
    Document   : CategoriaCadastro
    Created on : 09/10/2021, 13:24:24
    Author     : jhe13
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/cadastro-style.css">
        
    </head>
    <body>
        
        
            

         <main>

        <h1>Cadastrar Categoria</h1>
       

        

         <form  action="CadastrarCategoria" method="POST">
             
             <input type="hidden" name="codigo" value="${categoria.codigo}"/> 
             <label for="nome">
                <p>Nome</p>
                <input  type="text" name="nome" placeholder="Insira o Nome" value="${categoria.nome}" required>
            </label>
             <label for="descricao">
                <p>Descrição</p>
                <input type="text" name="descricao" value="${categoria.descricao}" required>
            </label>

             <input type="submit" value="Cadastrar" id="button" onclick='return pergunta();'>
             
                 <!--<button onclick="window.location.href='${pageContext.request.contextPath}/dashboard.jsp'">Voltar</button>   -->                
                            
                                
         </form>
                 <button id="botao" onclick="window.location.href='${pageContext.request.contextPath}/dashboard.jsp'">Voltar</button>                   

        
        <h3>${msg}</h3>
    </main>
    
    
     <script>
         function pergunta(){ 
             
       return confirm('Tem certeza que deseja cadastrar Categoria ?');
   
}
          
        </script>

</html>
