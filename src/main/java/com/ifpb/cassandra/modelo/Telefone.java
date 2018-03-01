
package com.ifpb.cassandra.modelo;

import com.datastax.driver.mapping.annotations.UDT;
import java.util.Objects;

@UDT(keyspace="atividade",name = "telefone")
public class Telefone {
    
    private int ddd;
    private String numero;

    public Telefone(int ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }
    
    public Telefone(){
        
    }
    
    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return numero;
    }

    public void setTelefone(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefone{" + "ddd=" + ddd + ", numero=" + numero + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.ddd;
        hash = 29 * hash + Objects.hashCode(this.numero);
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
        final Telefone other = (Telefone) obj;
        if (this.ddd != other.ddd) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }
    
    
}
