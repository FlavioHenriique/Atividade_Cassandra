
package com.ifpb.cassandra.modelo;

import com.datastax.driver.mapping.annotations.Frozen;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Table(keyspace = "atividade", name="usuario")
public class Usuario {
    
    @PartitionKey
    private int id;
    private String nome;
    @Frozen
    private Map<String, Telefone> telefones;
    
    
    public Usuario(){
        telefones = new HashMap();
    }

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
        telefones = new HashMap();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<String, Telefone> getMapa() {
        return telefones;
    }

    public void setMapa(Map<String, Telefone> telefones) {
        this.telefones = telefones;
    }
    
    public Telefone addTelefone(String texto, Telefone telefone){
        return telefones.put(texto, telefone);
        
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.telefones);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.telefones, other.telefones)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", telefones=" + telefones + '}';
    }

   
    
}
