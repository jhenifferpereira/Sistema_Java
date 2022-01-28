/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cervejaria.controle;

import br.com.cervejaria.dao.CategoriaDAO;
import br.com.cervejaria.dao.GenericDAO;
import br.com.cervejaria.modelo.Categoria;
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
@WebServlet(name = "CadastrarCategoria", urlPatterns = {"/CadastrarCategoria"})
public class CadastrarCategoria extends HttpServlet {

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
             String descricao = request.getParameter("descricao");
             
             
             
             Categoria categoria = new Categoria();
             categoria.setNome(nome);
             categoria.setDescricao(descricao);
             
             
             GenericDAO dao = new CategoriaDAO();
             String mensagem = "";
             
             if(codigo.equals("")){
                  if(dao.cadastrar(categoria) == true){
                 mensagem = "Categoria cadastrado com sucesso";
             }
             else{
                 mensagem = "Erro ao cadastrar categoria";
             }
             }else{
                 categoria.setCodigo(Integer.parseInt(codigo));
                 
                 if(dao.alterar(categoria)){
                     mensagem = "Categoria alterado com sucesso";
                 }else{
                     mensagem = "Erro ao alterar Categoria";
                 }
             }
             
            
             request.setAttribute("msg", mensagem);
             request.getRequestDispatcher("CategoriaCadastro.jsp").forward(request, response);
             //response.sendRedirect("CategoriaCadastro.jsp");
                         
        }catch(Exception e){
             System.out.println("Erro ao cadastrar categoriaCTR" + e.getMessage());
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
