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
public class Spajanje {
    
    private Karton k1;
    private Karton k2;
    private String podudarnost;

    public Spajanje() {
    }

    public Spajanje(Karton k1, Karton k2, String podudarnost) {
        this.k1 = k1;
        this.k2 = k2;
        this.podudarnost = podudarnost;
    }

    public String getPodudarnost() {
        return podudarnost;
    }

    public void setPodudarnost(String podudarnost) {
        this.podudarnost = podudarnost;
    }

    public Karton getK1() {
        return k1;
    }

    public void setK1(Karton k1) {
        this.k1 = k1;
    }

    public Karton getK2() {
        return k2;
    }

    public void setK2(Karton k2) {
        this.k2 = k2;
    }
    
    
    
}
