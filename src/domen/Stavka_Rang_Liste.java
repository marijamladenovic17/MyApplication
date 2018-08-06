/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

/**
 *
 * @author PC
 */
public class Stavka_Rang_Liste {
    
    private Rang_Lista rang_lista;
    private int redniBroj;

    public Stavka_Rang_Liste() {
    }

    public Stavka_Rang_Liste(Rang_Lista rang_lista, int redniBroj) {
        this.rang_lista = rang_lista;
        this.redniBroj = redniBroj;
    }

    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }

    public Rang_Lista getRang_lista() {
        return rang_lista;
    }

    public void setRang_lista(Rang_Lista rang_lista) {
        this.rang_lista = rang_lista;
    }
    
    
    
}
