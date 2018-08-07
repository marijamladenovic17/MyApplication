/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika;

import db.DBBroker;
import domen.Clan;
import domen.Komisija;
import domen.Sluzbenik;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Kontroler {
    
    ArrayList<Sluzbenik> sluzbenici;
    DBBroker db;
    public static Kontroler instance;
    public Kontroler() {
        sluzbenici = new ArrayList<>();
        Sluzbenik s1 = new Sluzbenik("Marija", "maki", "maki");
        Sluzbenik s2 = new Sluzbenik("Joka", "joki", "joki");
        sluzbenici.add(s1);
        sluzbenici.add(s2);
        db = new DBBroker();
    }

    public static Kontroler getInstance() {
        if(instance==null){
            instance = new Kontroler();
        }
        return instance;
    }

    public boolean proveriSluzbenika(String username, String password) {
        for (Sluzbenik sluzbenik : sluzbenici) {
            if(sluzbenik.getUsername().equals(username) && sluzbenik.getPassword().equals(password)){
                return true;
            }
        }
        
        return false;
    }

    public ArrayList<Komisija> vratiSveKomisije() {
            ArrayList<Komisija> komisije = new ArrayList<>();
        try {
            
            db.ucitajDriver();
            db.otvoriKonekciju();
            komisije = db.vratiKomisije();
            db.zatvoriKonekciju();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return komisije;
    }

    public boolean proveriKomisiju(String username, String password) {
        ArrayList<Komisija> komisije = new ArrayList<>();
        boolean daLiPostojiKom = false;
        try {
            
            db.ucitajDriver();
            db.otvoriKonekciju();
            komisije = db.vratiKomisije();
            for (Komisija komisija : komisije) {
                if (komisija.getUsername().equals(username) && komisija.getPassword().equals(password)) {
                    daLiPostojiKom = true;
                }
            }
            db.zatvoriKonekciju();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return daLiPostojiKom;
    }

    public List<Clan> vratiClanove() {
        List<Clan> listaClanova = new ArrayList<>();
         try {
            
            db.ucitajDriver();
            db.otvoriKonekciju();
            listaClanova = db.vratiClanove();
            
            db.zatvoriKonekciju();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaClanova;
    }

    public boolean ubaciKomisiju(Komisija novaKom) {
        boolean ubacen = false;
        try {
            
            db.ucitajDriver();
            db.otvoriKonekciju();
            db.ubaciKomisiju(novaKom);
            
            db.zatvoriKonekciju();
            ubacen = true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ubacen;
    }

    public boolean promeniKomisiju(Komisija kom) {
       boolean ubacen = false;
        try {
            
            db.ucitajDriver();
            db.otvoriKonekciju();
            db.promeniKomisiju(kom);
            
            db.zatvoriKonekciju();
            ubacen = true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ubacen;
    }

   
    
    
    
    
    
    
    
    
    
    
}
