/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author PC
 */
public class Komisija {
    
    private int komisijaID;
    private String username;
    private String password;
    private List<Clan> listaClanova;
    
    public Komisija() {
    }

    public Komisija(int komisijaID, String username, String password, List<Clan> listaClanova) {
        this.komisijaID = komisijaID;
        this.username = username;
        this.password = password;
        this.listaClanova = listaClanova;
    }

    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getKomisijaID() {
        return komisijaID;
    }

    public void setKomisijaID(int komisijaID) {
        this.komisijaID = komisijaID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Komisija other = (Komisija) obj;
        if (this.komisijaID != other.komisijaID) {
            return false;
        }
        return true;
    }

    public List<Clan> getListaClanova() {
        return listaClanova;
    }

    public void setListaClanova(List<Clan> listaClanova) {
        this.listaClanova = listaClanova;
    }

   

  
    
    
    
}
