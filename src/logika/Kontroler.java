/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika;

import db.DBBroker;
import domen.Clan;
import domen.Drzevljanstvo;
import domen.GrupaZadatka;
import domen.Kandidat;
import domen.Karton;
import domen.Komisija;
import domen.Nacionalnost;
import domen.Resenje;
import domen.Sluzbenik;
import domen.SrednjaSkola;
import domen.Test;
import domen.ZanimanjeRoditelja;
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
        if (instance == null) {
            instance = new Kontroler();
        }
        return instance;
    }

    public boolean proveriSluzbenika(String username, String password) {
        for (Sluzbenik sluzbenik : sluzbenici) {
            if (sluzbenik.getUsername().equals(username) && sluzbenik.getPassword().equals(password)) {
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
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
           try {
               db.zatvoriKonekciju();
           } catch (SQLException ex) {
               Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        return daLiPostojiKom;
    }

    public List<Clan> vratiClanove() {
        List<Clan> listaClanova = new ArrayList<>();
        try {

            db.ucitajDriver();
            db.otvoriKonekciju();
            listaClanova = db.vratiClanove();

            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
           try {
               db.zatvoriKonekciju();
           } catch (SQLException ex) {
               Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        return listaClanova;
    }

    public boolean ubaciKomisiju(Komisija novaKom) {
        boolean ubacen = false;
        try {

            db.ucitajDriver();
            db.otvoriKonekciju();
            db.ubaciKomisiju(novaKom);

            
            ubacen = true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
           try {
               db.zatvoriKonekciju();
           } catch (SQLException ex) {
               Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        return ubacen;
    }

    public boolean promeniKomisiju(Komisija novaKom) {
        boolean ubacen = false;
        try {

            db.ucitajDriver();
            db.otvoriKonekciju();
            db.promeniKomisiju(novaKom);

           
            ubacen = true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
           try {
               db.zatvoriKonekciju();
           } catch (SQLException ex) {
               Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        return ubacen;
    }

    public ArrayList<Drzevljanstvo> vratiDrzevljanstvo() {
        ArrayList<Drzevljanstvo> listaDrzev = new ArrayList<>();
        try {

            db.ucitajDriver();
            db.otvoriKonekciju();
            listaDrzev = db.vratiDrzevljanstvo();

            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
           try {
               db.zatvoriKonekciju();
           } catch (SQLException ex) {
               Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        return listaDrzev;
    }

    public ArrayList<ZanimanjeRoditelja> vratiSZ() {
        ArrayList<ZanimanjeRoditelja> listaZanimanja = new ArrayList<>();
        try {

            db.ucitajDriver();
            db.otvoriKonekciju();
            listaZanimanja = db.vratiZanimanja();

            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
           try {
               db.zatvoriKonekciju();
           } catch (SQLException ex) {
               Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        return listaZanimanja;
    }

    public ArrayList<Nacionalnost> vratiNacionalnost() {
        ArrayList<Nacionalnost> listaNacionalnosti = new ArrayList<>();
        try {

            db.ucitajDriver();
            db.otvoriKonekciju();
            listaNacionalnosti = db.vratiNacionalnost();

            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
           try {
               db.zatvoriKonekciju();
           } catch (SQLException ex) {
               Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        return listaNacionalnosti;
    }

    public ArrayList<SrednjaSkola> vratiSS() {
        ArrayList<SrednjaSkola> listaSrednjeSkole = new ArrayList<>();
        try {

            db.ucitajDriver();
            db.otvoriKonekciju();
            listaSrednjeSkole = db.vratiSrednjuSkolu();

            db.zatvoriKonekciju();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaSrednjeSkole;
    }

    public boolean sacuvajKandidata(Kandidat kandidat) {
        boolean ubacen = false;
        try {

            db.ucitajDriver();
            db.otvoriKonekciju();
            db.sacuvajKandidata(kandidat);

            
            ubacen = true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
           try {
               db.zatvoriKonekciju();
           } catch (SQLException ex) {
               Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        return ubacen;
    }

    public ArrayList<Test> vratiTestove() {
        ArrayList<Test> listaTest = new ArrayList<>();
        try {

            db.ucitajDriver();
            db.otvoriKonekciju();
            listaTest = db.vratiTest();

            db.zatvoriKonekciju();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaTest;
    }

    public boolean sacuvajGrupeZadataka(GrupaZadatka gz) {
        boolean ubacen = false;
        try {

            db.ucitajDriver();
            db.otvoriKonekciju();
            db.sacuvajGZ(gz);
            ArrayList<Resenje> listr = (ArrayList<Resenje>) gz.getListaResenihZadataka();
            for (Resenje resenje : listr) {
                db.sacuvajResenje(resenje, gz);
            }

            
            ubacen = true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
           try {
               db.zatvoriKonekciju();
           } catch (SQLException ex) {
               Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        return ubacen;
    }

    public int vratiKartonID() {
        int br = 0;
        try {

            db.ucitajDriver();
            db.otvoriKonekciju();
            br = db.vratiKartonID();

            db.zatvoriKonekciju();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return br;
    }

    public ArrayList<GrupaZadatka> vratiGrupuZadataka() {
        ArrayList<GrupaZadatka> listag = new ArrayList<>();
         try {

            db.ucitajDriver();
            db.otvoriKonekciju();
            listag = db.vratiGZ();

            db.zatvoriKonekciju();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listag;
    }

    public Kandidat proveriKarton( String brojPrijave) {
       Kandidat kan = new Kandidat();
        try {

            db.ucitajDriver();
            db.otvoriKonekciju();
             kan =db.vratiKandidata(brojPrijave);

            db.zatvoriKonekciju();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kan;
    
    }


    public boolean unesiKarton(Karton karton) {
       boolean ubacen = false;
        try {

            db.ucitajDriver();
            db.otvoriKonekciju();
            db.sacuvajKarton(karton);

            
            ubacen = true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
           try {
               db.zatvoriKonekciju();
           } catch (SQLException ex) {
               Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        return ubacen;
    }

    
    public Karton vratiKarton(int kartonskiBroj) {
        Karton kart = null;

        try {
            db.ucitajDriver();
            db.otvoriKonekciju();
            kart = db.vratiKarton(kartonskiBroj);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                db.zatvoriKonekciju();
            } catch (SQLException ex) {
                Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return kart;
    }
    }
