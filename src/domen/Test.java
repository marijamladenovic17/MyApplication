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
public class Test {
    private int testID;
    private String nazivTesta;

    public Test() {
    }

    public Test(int testID, String nazivTesta) {
        this.testID = testID;
        this.nazivTesta = nazivTesta;
    }

    public String getNazivTesta() {
        return nazivTesta;
    }

    public void setNazivTesta(String nazivTesta) {
        this.nazivTesta = nazivTesta;
    }

    public int getTestID() {
        return testID;
    }

    public void setTestID(int testID) {
        this.testID = testID;
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
        final Test other = (Test) obj;
        if (this.testID != other.testID) {
            return false;
        }
        return true;
    }
    
}
