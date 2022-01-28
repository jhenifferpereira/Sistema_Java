<%-- 
    Document   : FornecedorCadastro
    Created on : 05/10/2021, 19:38:16
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
        <h1>Cadastro</h1>
       

        

         <form name="seuformulario" action="CadastrarFornecedor" method="POST">
             
             <input type="hidden" name="codigo" value="${fornecedor.codigo}"/> 
             <label for="cnpj">
                <p>CNPJ</p>
                <input type="text"  name="cnpj" pattern="[0-9]{2}\.?[0-9]{3}\.?[0-9]{3}\/?[0-9]{4}\-?[0-9]{2}" placeholder="000.0000.000.00" value="${fornecedor.cnpj}"required/>
            </label>

            <label for="razao_social">
                <p>Razão Social</p>
                <input type="text" name="razao_social" value="${fornecedor.razao_social}" required>
            </label>
              <label for="telefone">
                <p>Telefone</p>
                <input type="text" name="telefone" onkeypress="mask(this, mphone);" onblur="mask(this, mphone);" placeholder="Ex: (00)00000-0000" value="${fornecedor.telefone}" required/>
            </label>
             <label for="email">
                <p>E-mail</p>
                <input type="email" id="email" name="email" placeholder="exemplo@exemplo.com" value="${fornecedor.email}" required>
            </label>

            <label for="endereco">
                <p>Endereço</p>
                <input type="text"  name="endereco" placeholder="Endereço" value="${fornecedor.endereco}" required>
            </label>
            
             <label for="cidade">
                <p>Cidade</p>
                <input type="text"  name="cidade" value="${fornecedor.cidade}" required>
            </label>
             <label for="estado">
                <p>Estado</p>
                <input type="text"  name="estado" value="${fornecedor.estado}" required>
            </label>

            <input type="submit" value="Cadastrar" onclick='return pergunta();'>
                          <!--   <button onclick="window.location.href='${pageContext.request.contextPath}/dashboard.jsp'">Voltar</button> -->                  

        </form>
                                              <button id="botao" onclick="window.location.href='${pageContext.request.contextPath}/dashboard.jsp'">Voltar</button>                   

        
        <h3>${msg}</h3>
    </main>
 
   
 
<!-- Chart library -->
<script src="${pageContext.request.contextPath}/dash/plugins/chart.min.js"></script>
<!-- Icons library -->
<script src="${pageContext.request.contextPath}/dash/plugins/feather.min.js"></script>
<!-- Custom scripts -->
<script src="${pageContext.request.contextPath}/dash/js/script.js">

</script>

<script src="${pageContext.request.contextPath}/dash/js/newscript.js"></script>
 <script>
            function pergunta(){ 
   
   return confirm('Tem certeza que quer Cadastrar?');
}
        </script>
    </body>
</html>
