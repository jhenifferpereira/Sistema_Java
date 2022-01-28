/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cervejaria.dao;

import br.com.cervejaria.modelo.Fornecedor;
import br.com.cervejaria.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhe13
 */
public class FornecedorDAO implements GenericDAO{
    
    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet rs;
    
    public FornecedorDAO() {
        try{
            this.conexao = ConnectionFactory.conectar();
        }catch(Exception e){
            System.out.println("Erro ao criar conexao com a BD" + e.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) throws Exception {
        try{
            Fornecedor fornecedor = (Fornecedor) object;
            String sql = "insert into fornecedor (cnpj, razao_social, telefone, email, endereco, cidade, estado) values(?, ?, ?, ?, ?, ?, ?)";
              this.stmt = this.conexao.prepareStatement(sql);
              this.stmt.setString(1, fornecedor.getCnpj());
              this.stmt.setString(2, fornecedor.getRazao_social());
              this.stmt.setString(3, fornecedor.getTelefone());
              this.stmt.setString(4, fornecedor.getEmail());
              this.stmt.setString(5, fornecedor.getEndereco());
              this.stmt.setString(6, fornecedor.getCidade());
              this.stmt.setString(7, fornecedor.getEstado());
              
              this.stmt.execute();
              return true;
              
        }catch(Exception e){
            System.out.println("Erro ao cadastrar fornecedorDAO" + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.fecharConexao(conexao, stmt, rs);
    }
    }
    

    @Override
    public List<Object> listar() throws Exception {
        
         List<Object> lista = new ArrayList<>();
        
        try{
            String sql = "select * from fornecedor order by codigo";
            this.stmt = this.conexao.prepareStatement(sql);
            this.rs = this.stmt.executeQuery();
            
            while(this.rs.next()){
                
                Fornecedor fornecedor = new Fornecedor();
                
                fornecedor.setCodigo(this.rs.getInt("codigo"));
                fornecedor.setCnpj(this.rs.getString("cnpj"));
                fornecedor.setRazao_social(this.rs.getString("razao_social"));
                fornecedor.setTelefone(this.rs.getString("telefone"));
                fornecedor.setEmail(this.rs.getString("email"));
                fornecedor.setEndereco(this.rs.getString("endereco"));
                fornecedor.setCidade(this.rs.getString("cidade"));
                fornecedor.setEstado(this.rs.getString("estado"));
               
                
                lista.add(fornecedor);
            }
        }catch(Exception e){
            System.out.println("Erro ao listar fornecedorDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conexao, stmt, rs);
        }
        return lista;
    
    }

    @Override
    public Object carregar(Integer codigo) throws Exception {
        Fornecedor fornecedor = new Fornecedor();
        
        try{
            String sql = "select * from fornecedor where codigo = ?";
            this.stmt = this.conexao.prepareStatement(sql);
            this.stmt.setInt(1, codigo);
            
            this.rs = this.stmt.executeQuery();
            
            rs.next();
            
            fornecedor.setCodigo(rs.getInt("codigo"));
            fornecedor.setCnpj(rs.getString("cnpj"));
            fornecedor.setRazao_social(rs.getString("razao_social"));
            fornecedor.setTelefone(rs.getString("telefone"));
            fornecedor.setEmail(rs.getString("email"));
            fornecedor.setEndereco(rs.getString("endereco"));
            fornecedor.setCidade(rs.getString("cidade"));
            fornecedor.setEstado(rs.getString("estado"));
            
            
        }
        catch(Exception e){
            System.out.println("Erro ao carregar fornecedorDAO" + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conexao, stmt, rs);
        }
       return fornecedor;
    }

    @Override
    public Boolean alterar(Object object) throws Exception {

        try{
            Fornecedor fornecedor = (Fornecedor) object;
            String sql = "update fornecedor set cnpj = ?, razao_social = ?, telefone = ?, email = ?, endereco = ?, cidade = ?, estado = ? where codigo = ?";
            this.stmt = this.conexao.prepareStatement(sql);
            this.stmt.setString(1, fornecedor.getCnpj());
            this.stmt.setString(2, fornecedor.getRazao_social());
            this.stmt.setString(3, fornecedor.getTelefone());
            this.stmt.setString(4, fornecedor.getEmail());
            this.stmt.setString(5, fornecedor.getEndereco());
            this.stmt.setString(6, fornecedor.getCidade());
            this.stmt.setString(7, fornecedor.getEstado());
            this.stmt.setInt(8, fornecedor.getCodigo());
            
            
            
            this.stmt.execute();
            
            return true;
            
        }catch(Exception e){
            System.out.println("Erro ao alterar fornecedorDAO" + e.getMessage());
            return false;
            
        }finally{
        ConnectionFactory.fecharConexao(conexao, stmt, rs);
    }

    }

    @Override
    public Boolean excluir(Integer codigo) throws Exception {
        
        try{
            String sql = "delete from fornecedor where codigo = ?";
            this.stmt = this.conexao.prepareStatement(sql);
            this.stmt.setInt(1, codigo);
            this.stmt.execute();
            
            return true;
            
        }catch(Exception e){
            System.out.println("Erro ao excluir UsuarioDAO" + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.fecharConexao(conexao, stmt, rs);
        }

    }
    
}
