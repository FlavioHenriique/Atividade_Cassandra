
package com.ifpb.cassandra.dao;

import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.Statement;
import com.datastax.driver.mapping.Mapper;
import com.datastax.driver.mapping.MappingManager;
import com.ifpb.cassandra.modelo.Usuario;
import java.util.List;


public class UsuarioDAO {

    private Session session;
    
    public UsuarioDAO(){
    
    }
            
    public void adicionar(Usuario u){
          ConFactory factory = new ConFactory();
      session = factory.getConnection();
     MappingManager mapping = new MappingManager(session);
            
     Mapper<Usuario> mapper = mapping.mapper(Usuario.class); 
     
     mapper.save(u);
            
    }
    
    public void deletar(Usuario u){
    ConFactory factory = new ConFactory();
      session = factory.getConnection();
     MappingManager mapping = new MappingManager(session);
            
     Mapper<Usuario> mapper = mapping.mapper(Usuario.class); 
     mapper.delete(u);
    }
    
    public List<Usuario> listar(){
        ConFactory factory = new ConFactory();
      session = factory.getConnection();
     MappingManager mapping = new MappingManager(session);
            
     Mapper<Usuario> mapper = mapping.mapper(Usuario.class); 
     
     mapper.get
    }
            
}
