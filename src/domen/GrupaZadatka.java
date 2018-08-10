/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.util.List;

/**
 *
 * @author PC
 */
public class GrupaZadatka {
    private int brGrupe;
    private List<Resenje> listaResenihZadataka;
    private Test test;

    public GrupaZadatka() {
    }

    public GrupaZadatka(int brGrupe, List<Resenje> listaResenihZadataka, Test test) {
        this.brGrupe = brGrupe;
        this.listaResenihZadataka = listaResenihZadataka;
        this.test = test;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public int getBrGrupe() {
        return brGrupe;
    }

    public void setBrGrupe(int brGrupe) {
        this.brGrupe = brGrupe;
    }

    public List<Resenje> getListaResenihZadataka() {
        return listaResenihZadataka;
    }

    public void setListaResenihZadataka(List<Resenje> listaResenihZadataka) {
        this.listaResenihZadataka = listaResenihZadataka;
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
        final GrupaZadatka other = (GrupaZadatka) obj;
        if (this.brGrupe != other.brGrupe) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return brGrupe+"";
    }
    
    
}
