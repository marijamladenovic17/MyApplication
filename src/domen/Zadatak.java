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
public class Zadatak {
    
    private int rbZadatka;
    private char odgovor;
    private Karton karton;

    public Zadatak() {
    }

    public Zadatak(int rbZadatka, char odgovor, Karton karton) {
        this.rbZadatka = rbZadatka;
        this.odgovor = odgovor;
        this.karton = karton;
    }

    public Karton getKarton() {
        return karton;
    }

    public void setKarton(Karton karton) {
        this.karton = karton;
    }

    public int getRbZadatka() {
        return rbZadatka;
    }

    public void setRbZadatka(int rbZadatka) {
        this.rbZadatka = rbZadatka;
    }

    public char getOdgovor() {
        return odgovor;
    }

    public void setOdgovor(char odgovor) {
        this.odgovor = odgovor;
    }
    
    
    
}
