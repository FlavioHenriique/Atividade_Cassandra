
package com.ifpb.cassandra.dao;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.datastax.driver.mapping.Mapper;
import com.datastax.driver.mapping.MappingManager;
import com.ifpb.cassandra.modelo.Usuario;

 
public class ConFactory {
    
    public   Session getConnection(){
         Cluster cluster = null;
        
       
            cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
            
            Session session = cluster.connect("atividadecassandra");
            
            return session;
    }
}
