/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cervejaria.controle;

import br.com.cervejaria.dao.GenericDAO;
import br.com.cervejaria.dao.UsuarioDAO;
import br.com.cervejaria.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jhe13
 */
@WebServlet(name = "CadastrarUsuario", urlPatterns = {"/CadastrarUsuario"})
public class CadastrarUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try{
             String codigo = request.getParameter("codigo");
             String nome = request.getParameter("nome");
             String telefone = request.getParameter("telefone");
             String email = request.getParameter("email");
             String login = request.getParameter("login");
             String senha = request.getParameter("senha"); 
             
             Usuario usuario = new Usuario();
             usuario.setNome(nome);
              usuario.setTelefone(telefone);
             usuario.setEmail(email);
              usuario.setLogin(login);
             usuario.setSenha(senha);
             
             GenericDAO dao = new UsuarioDAO();
             String mensagem = "";
             
             if(codigo.equals("")){
             
             if(dao.cadastrar(usuario) == true){
                 mensagem = "Usuario cadastrado com sucesso";
             }
             else{
                 mensagem = "Erro ao cadastrar ususrio";
             }
             }else{
                 usuario.setCodigo(Integer.parseInt(codigo));
                 
                 if(dao.alterar(usuario)){
                     mensagem = "Usuario alterado com sucesso";
                 }else{
                     mensagem = "Erro ao alterar Usuario";
             }
             }
             request.setAttribute("msg", mensagem);
             request.getRequestDispatcher("cadastro.jsp").forward(request, response);
                         
        }catch(Exception e){
             System.out.println("Erro ao cadastrar ususarioCTR" + e.getMessage());
        }
    
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
