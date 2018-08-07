/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.Clan;
import domen.Komisija;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class ModelTabeleKomisija extends AbstractTableModel{
    
    List<Clan> clanovi;

    public ModelTabeleKomisija() {
        clanovi = new ArrayList<Clan>();
    }
    
    

    @Override
    public int getRowCount() {
        return clanovi.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    public List<Clan> getClanovi() {
        return clanovi;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Clan c = clanovi.get(rowIndex);
        switch(columnIndex){
            case 0: return c.getIme();
            case 1: return c.getPrezime();
            default: return "Ja sam Spiderman";
        }
    }

    @Override
    public String getColumnName(int column) {
        
        
        switch(column){
            case 0: return "Ime";
            case 1: return "Prezime";
            default: return "Ja sam Spiderman";
        }
    }

    public void dodajClana(Clan clan) {
       clanovi.add(clan);
       fireTableDataChanged();
    }

    public void obrisiKomisiju(int red) {
       clanovi.remove(red);
       fireTableDataChanged();
    }
    
    
}
