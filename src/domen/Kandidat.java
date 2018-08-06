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
public class Kandidat {
    private int sifraPrijave;
    private String jmbg;
    private String imeRoditelja;
    private String prezime;
    private String mobilni;
    private String fiksni;
    private SrednjaSkola srednjaSkola;
    private Nacionalnost nacionalnost;
    private ZanimanjeRoditelja zanimanjeRoditelja;
    private Drzevljanstvo drzevljanstvo;
    private List<Karton> listaKartona;

    public Kandidat() {
    }

    public Kandidat(int sifraPrijave, String jmbg, String imeRoditelja, String prezime, String mobilni, String fiksni, SrednjaSkola srednjaSkola, Nacionalnost nacionalnost, ZanimanjeRoditelja zanimanjeRoditelja, Drzevljanstvo drzevljanstvo, List<Karton> listaKartona) {
        this.sifraPrijave = sifraPrijave;
        this.jmbg = jmbg;
        this.imeRoditelja = imeRoditelja;
        this.prezime = prezime;
        this.mobilni = mobilni;
        this.fiksni = fiksni;
        this.srednjaSkola = srednjaSkola;
        this.nacionalnost = nacionalnost;
        this.zanimanjeRoditelja = zanimanjeRoditelja;
        this.drzevljanstvo = drzevljanstvo;
        this.listaKartona = listaKartona;
    }

    public List<Karton> getListaKartona() {
        return listaKartona;
    }

    public void setListaKartona(List<Karton> listaKartona) {
        this.listaKartona = listaKartona;
    }

    public int getSifraPrijave() {
        return sifraPrijave;
    }

    public void setSifraPrijave(int sifraPrijave) {
        this.sifraPrijave = sifraPrijave;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getImeRoditelja() {
        return imeRoditelja;
    }

    public void setImeRoditelja(String imeRoditelja) {
        this.imeRoditelja = imeRoditelja;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getMobilni() {
        return mobilni;
    }

    public void setMobilni(String mobilni) {
        this.mobilni = mobilni;
    }

    public String getFiksni() {
        return fiksni;
    }

    public void setFiksni(String fiksni) {
        this.fiksni = fiksni;
    }

    public SrednjaSkola getSrednjaSkola() {
        return srednjaSkola;
    }

    public void setSrednjaSkola(SrednjaSkola srednjaSkola) {
        this.srednjaSkola = srednjaSkola;
    }

    public Nacionalnost getNacionalnost() {
        return nacionalnost;
    }

    public void setNacionalnost(Nacionalnost nacionalnost) {
        this.nacionalnost = nacionalnost;
    }

    public ZanimanjeRoditelja getZanimanjeRoditelja() {
        return zanimanjeRoditelja;
    }

    public void setZanimanjeRoditelja(ZanimanjeRoditelja zanimanjeRoditelja) {
        this.zanimanjeRoditelja = zanimanjeRoditelja;
    }

    public Drzevljanstvo getDrzevljanstvo() {
        return drzevljanstvo;
    }

    public void setDrzevljanstvo(Drzevljanstvo drzevljanstvo) {
        this.drzevljanstvo = drzevljanstvo;
    }
    
    
           
}
