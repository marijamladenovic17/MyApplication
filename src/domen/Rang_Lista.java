/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

/**
 *
 * @author PC
 */
public class Rang_Lista {
    
    private String sifraRL;
    private String smer;
    private int godina;

    public Rang_Lista() {
    }

    public Rang_Lista(String sifraRL, String smer, int godina) {
        this.sifraRL = sifraRL;
        this.smer = smer;
        this.godina = godina;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public String getSifraRL() {
        return sifraRL;
    }

    public void setSifraRL(String sifraRL) {
        this.sifraRL = sifraRL;
    }

    public String getSmer() {
        return smer;
    }

    public void setSmer(String smer) {
        this.smer = smer;
    }
    
    
    
    
    
    
    
}
