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
public class Drzevljanstvo {
   private int drzevljanstvoID;
    private String naziv;

    public Drzevljanstvo() {
    }

    public Drzevljanstvo(int drzevljanstvoID, String naziv) {
        this.drzevljanstvoID = drzevljanstvoID;
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getDrzevljanstvoID() {
        return drzevljanstvoID;
    }

    public void setDrzevljanstvoID(int drzevljanstvoID) {
        this.drzevljanstvoID = drzevljanstvoID;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
    
}
