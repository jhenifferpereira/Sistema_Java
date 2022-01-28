/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cervejaria.dao;


import br.com.cervejaria.modelo.Categoria;
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
public class CategoriaDAO implements GenericDAO {
    
    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet rs;
    
     public CategoriaDAO() {
        try{
            this.conexao = ConnectionFactory.conectar();
        }catch(Exception e){
            System.out.println("Erro ao criar conexao com a BD" + e.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) throws Exception {
       try{
            Categoria categoria = (Categoria) object;
            String sql = "insert into categoria (nome, descricao) values(?, ?)";
              this.stmt = this.conexao.prepareStatement(sql);
              this.stmt.setString(1, categoria.getNome());
              this.stmt.setString(2, categoria.getDescricao());
              
              this.stmt.execute();
              return true;
              
        }catch(Exception e){
            System.out.println("Erro ao cadastrar categoriaDAO" + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.fecharConexao(conexao, stmt, rs);
    }
    }

    @Override
    public List<Object> listar() throws Exception {
      
        List<Object> lista = new ArrayList<>();
        
        try{
            String sql = "select * from categoria order by codigo";
            this.stmt = this.conexao.prepareStatement(sql);
            this.rs = this.stmt.executeQuery();
            
            while(this.rs.next()){
                
                Categoria categoria = new Categoria();
                
                categoria.setCodigo(this.rs.getInt("codigo"));
                categoria.setNome(this.rs.getString("nome"));
                categoria.setDescricao(this.rs.getString("descricao"));
                
               
                
                lista.add(categoria);
            }
        }catch(Exception e){
            System.out.println("Erro ao listar categoriaDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conexao, stmt, rs);
        }
        return lista;
    
    }
    
    

    @Override
    public Object carregar(Integer codigo) throws Exception {
        Categoria categoria = new Categoria();
        
        try{
            String sql = "select * from categoria where codigo = ?";
            this.stmt = this.conexao.prepareStatement(sql);
            this.stmt.setInt(1, codigo);
            
            this.rs = this.stmt.executeQuery();
            
            rs.next();
            
            categoria.setCodigo(rs.getInt("codigo"));
            categoria.setNome(rs.getString("nome"));
            categoria.setDescricao(rs.getString("descricao"));
        }
        catch(Exception e){
            System.out.println("Erro ao carregar categoriaDAO" + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conexao, stmt, rs);
        }
       return categoria;
    }

    @Override
    public Boolean alterar(Object object) throws Exception {

        try{
            Categoria categoria = (Categoria) object;
            String sql = "update categoria set nome = ?, descricao = ? where codigo = ?";
            this.stmt = this.conexao.prepareStatement(sql);
            this.stmt.setString(1, categoria.getNome());
            this.stmt.setString(2, categoria.getDescricao());
            this.stmt.setInt(3, categoria.getCodigo());
            
            this.stmt.execute();
            
            return true;
            
        }catch(Exception e){
            System.out.println("Erro ao alterar categoriaDAO" + e.getMessage());
            return false;
            
        }finally{
        ConnectionFactory.fecharConexao(conexao, stmt, rs);
    }

    }

    @Override
    public Boolean excluir(Integer codigo) throws Exception {
        try{
            String sql = "delete from categoria where codigo = ?";
            this.stmt = this.conexao.prepareStatement(sql);
            this.stmt.setInt(1, codigo);
            this.stmt.execute();
            
            return true;
            
        }catch(Exception e){
            System.out.println("Erro ao excluir CategoriaDAO" + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.fecharConexao(conexao, stmt, rs);
        }

    
    }
    
}
