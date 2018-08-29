/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.komisija;

import domen.Karton;
import domen.Zadatak;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import logika.Kontroler;
import modeli.ModelTabelePretragaKartona;

/**
 *
 * @author PC
 */
public class FormaPretragaKartona extends javax.swing.JFrame {

    /**
     * Creates new form FormaPretragaKartona
     */
    public FormaPretragaKartona() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = tk.getScreenSize().width;
        int y = tk.getScreenSize().height;
        setSize(x, y);
        panelZaNestajanje.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGlavni = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtKartonskiBroj = new javax.swing.JTextField();
        btnNadjiKarton = new javax.swing.JButton();
        btnNazad = new javax.swing.JButton();
        panelZaNestajanje = new javax.swing.JPanel();
        lblIme = new javax.swing.JLabel();
        lblPrezime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSifraPrijave = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblGrupaZadataka = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaZadataka = new javax.swing.JTable();
        lblTest = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGlavni.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("Molimo unesite kartonski broj:");

        btnNadjiKarton.setText("Nadji karton");
        btnNadjiKarton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNadjiKartonActionPerformed(evt);
            }
        });

        btnNazad.setText("Nazad");
        btnNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNazadActionPerformed(evt);
            }
        });

        lblIme.setText("jLabel2");

        lblPrezime.setText("jLabel2");

        jLabel2.setText("Sifra prijave:");

        lblSifraPrijave.setText("jLabel3");

        jLabel3.setText("Grupa zadataka:");

        lblGrupaZadataka.setText("jLabel4");

        tabelaZadataka.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaZadataka);

        lblTest.setText("jLabel4");

        javax.swing.GroupLayout panelZaNestajanjeLayout = new javax.swing.GroupLayout(panelZaNestajanje);
        panelZaNestajanje.setLayout(panelZaNestajanjeLayout);
        panelZaNestajanjeLayout.setHorizontalGroup(
            panelZaNestajanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelZaNestajanjeLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelZaNestajanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelZaNestajanjeLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lblGrupaZadataka)
                        .addGap(36, 36, 36)
                        .addComponent(lblTest))
                    .addGroup(panelZaNestajanjeLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(lblSifraPrijave))
                    .addGroup(panelZaNestajanjeLayout.createSequentialGroup()
                        .addComponent(lblIme)
                        .addGap(28, 28, 28)
                        .addComponent(lblPrezime)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panelZaNestajanjeLayout.setVerticalGroup(
            panelZaNestajanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelZaNestajanjeLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelZaNestajanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIme)
                    .addComponent(lblPrezime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelZaNestajanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblSifraPrijave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelZaNestajanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblGrupaZadataka)
                    .addComponent(lblTest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelGlavniLayout = new javax.swing.GroupLayout(panelGlavni);
        panelGlavni.setLayout(panelGlavniLayout);
        panelGlavniLayout.setHorizontalGroup(
            panelGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlavniLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelZaNestajanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGlavniLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtKartonskiBroj, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnNadjiKarton)
                        .addGap(51, 51, 51)
                        .addComponent(btnNazad)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panelGlavniLayout.setVerticalGroup(
            panelGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlavniLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKartonskiBroj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNadjiKarton)
                    .addComponent(btnNazad))
                .addGap(18, 18, 18)
                .addComponent(panelZaNestajanje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGlavni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGlavni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNazadActionPerformed
        // TODO add your handling code here:
        FormaZaKomisiju fzk = new FormaZaKomisiju();
        fzk.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNazadActionPerformed

    private void btnNadjiKartonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNadjiKartonActionPerformed
        // TODO add your handling code here:
        String kb =txtKartonskiBroj.getText();
        int kartonskiBroj = Integer.parseInt(kb);
        
        Karton karton = Kontroler.getInstance().vratiKarton(kartonskiBroj);
        
        if(karton!=null){
            panelZaNestajanje.setVisible(true);
            lblGrupaZadataka.setText(karton.getGrupaZadataka().getBrGrupe()+"");
            lblTest.setText(karton.getGrupaZadataka().getTest().getNazivTesta());
            ArrayList<Zadatak> zadaciKartona = karton.getListaOdg();
            ModelTabelePretragaKartona mtr = new ModelTabelePretragaKartona();
            mtr.setZadaci(zadaciKartona);
            tabelaZadataka.setModel(mtr);
        }else{
            JOptionPane.showMessageDialog(this, "Karton sa takvim kratonskim brojem ne postoji u bazi!");
            return;
        }
    }//GEN-LAST:event_btnNadjiKartonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormaPretragaKartona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaPretragaKartona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaPretragaKartona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaPretragaKartona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormaPretragaKartona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNadjiKarton;
    private javax.swing.JButton btnNazad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGrupaZadataka;
    private javax.swing.JLabel lblIme;
    private javax.swing.JLabel lblPrezime;
    private javax.swing.JLabel lblSifraPrijave;
    private javax.swing.JLabel lblTest;
    private javax.swing.JPanel panelGlavni;
    private javax.swing.JPanel panelZaNestajanje;
    private javax.swing.JTable tabelaZadataka;
    private javax.swing.JTextField txtKartonskiBroj;
    // End of variables declaration//GEN-END:variables
}
