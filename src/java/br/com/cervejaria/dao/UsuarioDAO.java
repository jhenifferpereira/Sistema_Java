
package br.com.cervejaria.dao;

import br.com.cervejaria.modelo.Usuario;
import br.com.cervejaria.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO implements GenericDAO {

    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet rs;

    public UsuarioDAO() {
        try{
            this.conexao = ConnectionFactory.conectar();
        }catch(Exception e){
            System.out.println("Erro ao criar conexao com a BD" + e.getMessage());
        }
    }
    
    
    
    @Override
    public Boolean cadastrar(Object object) throws Exception {
        try{
            Usuario usuario = (Usuario) object;
            String sql = "insert into usuario (nome, telefone, email, login, senha) values(?, ?, ?, ?, md5(?))";
              this.stmt = this.conexao.prepareStatement(sql);
              this.stmt.setString(1, usuario.getNome());
              this.stmt.setString(2, usuario.getTelefone());
              this.stmt.setString(3, usuario.getEmail());
               this.stmt.setString(4, usuario.getLogin());
              this.stmt.setString(5, usuario.getSenha());
              
              this.stmt.execute();
              return true;
              
        }catch(Exception e){
            System.out.println("Erro ao cadastrar usuarioDAO" + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.fecharConexao(conexao, stmt, rs);
    }
    }

    @Override
    public List<Object> listar() throws Exception {
    
             List<Object> lista = new ArrayList<>();
        
        try{
            String sql = "select * from usuario order by codigo";
            this.stmt = this.conexao.prepareStatement(sql);
            this.rs = this.stmt.executeQuery();
            
            while(this.rs.next()){
                
                Usuario usuario = new Usuario();
                
                usuario.setCodigo(this.rs.getInt("codigo"));
                usuario.setNome(this.rs.getString("nome"));
                usuario.setTelefone(this.rs.getString("telefone"));
                usuario.setEmail(this.rs.getString("email"));
                usuario.setLogin(this.rs.getString("login"));
                usuario.setSenha(this.rs.getString("senha"));
               
                
                lista.add(usuario);
            }
        }catch(Exception e){
            System.out.println("Erro ao listar usuarioDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conexao, stmt, rs);
        }
        return lista;
    
    }

    @Override
    public Object carregar(Integer codigo) throws Exception {
        Usuario usuario = new Usuario();
        
        try{
            String sql = "select * from usuario where codigo = ?";
            this.stmt = this.conexao.prepareStatement(sql);
            this.stmt.setInt(1, codigo);
            
            this.rs = this.stmt.executeQuery();
            
            rs.next();
            
            usuario.setCodigo(rs.getInt("codigo"));
            usuario.setNome(rs.getString("nome"));
            usuario.setTelefone(rs.getString("telefone"));
            usuario.setEmail(rs.getString("email"));
            usuario.setLogin(rs.getString("login"));
            usuario.setSenha(rs.getString("senha"));
            
            
            
            
            
        }
        catch(Exception e){
            System.out.println("Erro ao carregar usuarioDAO" + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conexao, stmt, rs);
        }
       return usuario;

    }

    @Override
    public Boolean alterar(Object object) throws Exception {

        try{
            Usuario usuario = (Usuario) object;
            String sql = "update usuario set nome = ?, telefone = ?, email = ?, login = ?, senha = ? where codigo = ?";
            this.stmt = this.conexao.prepareStatement(sql);
            this.stmt.setString(1, usuario.getNome());
            this.stmt.setString(2, usuario.getTelefone());
            this.stmt.setString(3, usuario.getEmail());
            this.stmt.setString(4, usuario.getLogin());
            this.stmt.setString(5, usuario.getSenha());
            this.stmt.setInt(6, usuario.getCodigo());
            
            
            
            this.stmt.execute();
            
            return true;
            
        }catch(Exception e){
            System.out.println("Erro ao alterar usuarioDAO" + e.getMessage());
            return false;
            
        }finally{
        ConnectionFactory.fecharConexao(conexao, stmt, rs);
    }

    }

    @Override
    public Boolean excluir(Integer codigo) throws Exception {
        try{
            String sql = "delete from usuario where codigo = ?";
            this.stmt = this.conexao.prepareStatement(sql);
            this.stmt.setInt(1, codigo);
            this.stmt.execute();
            
            return true;
            
        }catch(Exception e) {
            System.out.println("Erro ao excluir UsuarioDAO " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.fecharConexao(conexao, stmt, rs);
        }
    }

    public Usuario logar(Usuario obj) throws Exception {
        
            Usuario usuario = new Usuario();
        
        try{
            String sql = "select * from usuario where email = ? and senha = md5(?)";
            this.stmt = this.conexao.prepareStatement(sql);
            this.stmt.setString(1, obj.getEmail());
            this.stmt.setString(2, obj.getSenha());
            
            this.rs = this.stmt.executeQuery();
           
            
            if(this.rs.next()){
                usuario.setCodigo(this.rs.getInt("codigo"));
                usuario.setNome(this.rs.getString("nome"));
                usuario.setEmail(this.rs.getString("email"));
                usuario.setSenha(this.rs.getString("senha"));

            }
        }catch(Exception e){
            System.out.println("Erro ao logar usuarioDAO" + e.getMessage());
        }finally{
              ConnectionFactory.fecharConexao(conexao, stmt, rs);

        }
        return usuario;
    }
    
}

    

