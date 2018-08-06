/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domen.Clan;
import domen.Komisija;
import java.io.IOException;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class DBBroker {
    
    Connection konekcija;
    ReaderProperty rp;
    public DBBroker()  {
        
        try {
            rp = new ReaderProperty();
        } catch (IOException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void ucitajDriver() throws ClassNotFoundException{
        Class.forName(rp.vratiVrednost(Konstanta.DRIVER));
    }
   
    public  void otvoriKonekciju() throws SQLException{
        
        String url = rp.vratiVrednost(Konstanta.URL);
        String user = rp.vratiVrednost(Konstanta.USER);
        String pass = rp.vratiVrednost(Konstanta.PASS);
        
        konekcija = DriverManager.getConnection(url, user, pass);
        konekcija.setAutoCommit(true);
        
        
    }
    
    public void zatvoriKonekciju() throws SQLException{
    konekcija.close();
    }
    public  void commit() throws SQLException{
        konekcija.commit();
    }
    public  void rollback() throws SQLException{
        konekcija.rollback();
        
    }

    public ArrayList<Komisija> vratiKomisije() throws SQLException {
        ArrayList<Komisija> komisije = new ArrayList<>();
        String upit = "SELECT * FROM komisija";
        Statement stat = konekcija.createStatement();
        ResultSet rs = stat.executeQuery(upit);
        
        while(rs.next()){
            int komid = rs.getInt("komisijaID");
            String user = rs.getString("user");
            String pass = rs.getString("password");
            
            Komisija k = new Komisija(komid, user, pass, null);
            
            komisije.add(k);
        }
        return komisije;
    }

    public List<Clan> vratiClanove() throws SQLException {
        String upit = "SELECT * FROM clan ";
         List<Clan> listaClanova = new ArrayList<>();
         Statement st = konekcija.createStatement();
         ResultSet rs = st.executeQuery(upit);
         
         while(rs.next()) {
             int idClana = rs.getInt(1);
             String ime = rs.getString(2);
             String prezime = rs.getString(3);
             Clan c= new Clan(idClana, ime, prezime);
             listaClanova.add(c);
         }
         rs.close();
         st.close();
         return listaClanova;
         
    }

    public void ubaciKomisiju(Komisija novaKom) throws SQLException {
       String upit = "INSERT INTO komisija(komisjaID,user,password) VALUES(?,?,?)";
        PreparedStatement ps = konekcija.prepareStatement(upit);
        ps.setInt(1, novaKom.getKomisijaID());
        ps.setString(2, novaKom.getUsername());
        ps.setString(3, novaKom.getPassword());
        ps.executeUpdate();
        ps.close();
    }
    
    
}