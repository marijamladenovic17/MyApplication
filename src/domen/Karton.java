/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author PC
 */
public class Karton {
    private int kartonID;
    private int brKartona;
    private String ime;
    private String prezime;
    private String sifraPrijave;
    private float rezultatTesta;
    private int brUnosa;
    private GrupaZadatka grupaZadataka;
    private Test test;
    private Kandidat kandidat;
    ArrayList<Zadatak> listaOdg = new ArrayList<>();
    
    public Karton() {
    }

    public Karton(int kartonID, int brKartona, String ime, String prezime, String sifraPrijave, float rezultatTesta, int brUnosa, GrupaZadatka grupaZadataka, Test test, Kandidat kandidat) {
        this.kartonID = kartonID;
        this.brKartona = brKartona;
        this.ime = ime;
        this.prezime = prezime;
        this.sifraPrijave = sifraPrijave;
        this.rezultatTesta = rezultatTesta;
        this.brUnosa = brUnosa;
        this.grupaZadataka = grupaZadataka;
        this.test = test;
        this.kandidat = kandidat;
    }

    public void setListaOdg(ArrayList<Zadatak> listaOdg) {
        this.listaOdg = listaOdg;
    }

    public ArrayList<Zadatak> getListaOdg() {
        return listaOdg;
    }

   
    

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    

    public int getBrUnosa() {
        return brUnosa;
    }

    public void setBrUnosa(int brUnosa) {
        this.brUnosa = brUnosa;
    }

    public int getKartonID() {
        return kartonID;
    }

    public void setKartonID(int kartonID) {
        this.kartonID = kartonID;
    }

    public int getBrKartona() {
        return brKartona;
    }

    public void setBrKartona(int brKartona) {
        this.brKartona = brKartona;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getSifraPrijave() {
        return sifraPrijave;
    }

    public void setSifraPrijave(String sifraPrijave) {
        this.sifraPrijave = sifraPrijave;
    }

    public float getRezultatTesta() {
        return rezultatTesta;
    }

    public void setRezultatTesta(float rezultatTesta) {
        this.rezultatTesta = rezultatTesta;
    }

    @Override
    public String toString() {
        return"";
        
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
        final Karton other = (Karton) obj;
        if (this.brKartona != other.brKartona) {
            return false;
        }
        return true;
    }

    public GrupaZadatka getGrupaZadataka() {
        return grupaZadataka;
    }

    public void setGrupaZadataka(GrupaZadatka grupaZadataka) {
        this.grupaZadataka = grupaZadataka;
    }

    public Kandidat getKandidat() {
        return kandidat;
    }

    public void setKandidat(Kandidat kandidat) {
        this.kandidat = kandidat;
    }

    

    
    
}
