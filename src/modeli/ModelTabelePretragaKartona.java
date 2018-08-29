/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.Zadatak;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class ModelTabelePretragaKartona extends AbstractTableModel{
    ArrayList<Zadatak> zadaci;

    public ModelTabelePretragaKartona() {
        zadaci = new ArrayList<>();
    }

    public void setZadaci(ArrayList<Zadatak> zadaci) {
        this.zadaci = zadaci;
        fireTableDataChanged();
    }

    public ArrayList<Zadatak> getZadaci() {
        return zadaci;
    }
    
    

    @Override
    public int getRowCount() {
        return zadaci.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Zadatak z = zadaci.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return z.getRbZadatka();
            case 1:
                return z.getOdgovor();
            default:
                return "";
        }
    }
    
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

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
     
     
    
}
