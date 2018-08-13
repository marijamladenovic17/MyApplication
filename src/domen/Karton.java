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
    private String sifraPrijave;
    private double rezultatTesta;
    private int brUnosa;
    private GrupaZadatka grupaZadataka;
    private Test test;
    private Kandidat kandidat;
    ArrayList<Zadatak> listaOdg = new ArrayList<>();

    public Karton() {
    }

    public Karton(int kartonID, int brKartona, String sifraPrijave, double rezultatTesta, int brUnosa, GrupaZadatka grupaZadataka, Kandidat kandidat) {
        this.kartonID = kartonID;
        this.brKartona = brKartona;

        this.sifraPrijave = sifraPrijave;
        this.rezultatTesta = rezultatTesta;
        this.brUnosa = brUnosa;
        this.grupaZadataka = grupaZadataka;

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

    public String getSifraPrijave() {
        return sifraPrijave;
    }

    public void setSifraPrijave(String sifraPrijave) {
        this.sifraPrijave = sifraPrijave;
    }

   

    

    @Override
    public String toString() {
        return "";

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

    public double getRezultatTesta() {
        return rezultatTesta;
    }

    public void setRezultatTesta(double rezultatTesta) {
        this.rezultatTesta = rezultatTesta;
    }

}
