/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.Resenje;
import forme.sluzbenik.UnosGrupeZadataka;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class ModelTabeleResenjaZadataka extends AbstractTableModel {

    ArrayList<Resenje> listaResenja;
    //UnosGrupeZadataka ufz = new UnosGrupeZadataka();

    public ModelTabeleResenjaZadataka() {
        listaResenja = new ArrayList<>();
    }

//    public void setUfz(UnosGrupeZadataka ufz) {
//        this.ufz = ufz;
//    }
    @Override
    public int getRowCount() {
        return listaResenja.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Resenje r = listaResenja.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return r.getRbZadatka();
            case 1:
                return r.getOdgovor();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Redni broj zadatka";
            case 1:
                return "Tacan odgovor";
            default:
                return "";
        }
    }

    public void dodajResenje(int redBr, char odg) {
        listaResenja.add(new Resenje(redBr, odg));
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 1) {
            return true;
        }
        return false;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Resenje r = listaResenja.get(rowIndex);
        switch (columnIndex) {
            case 0:
                String br = (String) aValue;
                int b = Integer.parseInt(br);
                r.setRbZadatka(b);
                break;
            case 1:
                String odg = (String) aValue;
                odg.toUpperCase();
                r.setOdgovor(odg.charAt(1));
                //System.out.println("Unesen je!");
                break;
        }

    }

    public ArrayList<Resenje> vraiResenja() {
        return listaResenja;
    }

}
