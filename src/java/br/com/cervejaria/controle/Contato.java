/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cervejaria.controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author jhe13
 */
@WebServlet(name = "Contato", urlPatterns = {"/Contato"})
public class Contato extends HttpServlet {

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
            String nome = request.getParameter("nome");
            String email = request.getParameter("email");
            String mensagem = request.getParameter("mensagem");
            
            SimpleEmail simpleEmail = new SimpleEmail();
            simpleEmail.setHostName("smtp.gmail.com");
            simpleEmail.addTo("jheniffercarolinateste@gmail.com");
            simpleEmail.setFrom("jheniffercarolinateste@gmail.com");
            simpleEmail.setSubject("Contato - Loja informatica");
            
            simpleEmail.setMsg("Nome: " + nome + "\n" + "Email: " + email + "\n"
            + "Mensagem:  " + mensagem);
            
            simpleEmail.setAuthentication("jheniffercarolinateste@gmail.com", "teste12345jheniffer");
            simpleEmail.setSmtpPort(465);
            simpleEmail.setSSL(true);
            simpleEmail.setTLS(true);
            
            simpleEmail.send();
            
            request.setAttribute("msg", "Mensagem enviada com sucesso");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }
            
        catch(Exception e){
            System.out.println("Erro ao enviar mensagem: " + e.getMessage());
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
