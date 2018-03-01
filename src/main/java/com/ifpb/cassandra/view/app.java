
package com.ifpb.cassandra.view;

import com.ifpb.cassandra.dao.UsuarioDAO;
import com.ifpb.cassandra.modelo.Telefone;
import com.ifpb.cassandra.modelo.Usuario;
import java.util.HashMap;


public class app {
    public static void main(String[] args) {
        
        UsuarioDAO dao = new UsuarioDAO();
        
        Usuario u = new Usuario();
        u.setId(1);
        u.setNome("Flavio");
        u.setMapa(new HashMap());
        u.addTelefone("T1", new Telefone(83,"111234563"));
        
        dao.adicionar(u);
    }
    
}
