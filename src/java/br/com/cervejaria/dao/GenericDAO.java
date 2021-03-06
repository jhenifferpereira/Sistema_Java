
package br.com.cervejaria.dao;

import java.util.List;


public interface GenericDAO {
    
    public Boolean cadastrar(Object object) throws Exception;
    public List<Object> listar() throws Exception;
    public Object carregar(Integer codigo) throws Exception;
    public Boolean alterar(Object object) throws Exception;
    public Boolean excluir(Integer codigo) throws Exception;
    
}
