/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiPerpus;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.koneksi;
import peminjamanBuku.DAOpeminjaman;
import peminjamanBuku.DAOpengembalian;
import peminjamanBuku.peminjaman;
import peminjamanBuku.pengembalian;

/**
 *
 * @author Tama
 */
public class PanelPengembalian extends javax.swing.JPanel {
Connection con;
    /**
     * Creates new form PanelPengembalian
     */
    public PanelPengembalian(){
        
        initComponents();
    }
    public PanelPengembalian(Connection con) {
        initComponents();
        this.con=con;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pemberitahuan = new javax.swing.JLabel();
        idbalik = new javax.swing.JTextField();
        bukubalik = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("NIM");

        jLabel2.setText("ID BUKU ");

        pemberitahuan.setText("COLI");

        idbalik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbalikActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(pemberitahuan))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1)
                    .addComponent(idbalik, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(bukubalik))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idbalik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bukubalik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pemberitahuan)
                    .addComponent(jButton1))
                .addContainerGap(130, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idbalikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbalikActionPerformed
           
    }//GEN-LAST:event_idbalikActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    pengembalian kembali = new pengembalian();
        kembali.setId(this.idbalik.getText());
        kembali.setIdBuku(this.bukubalik.getText());
             
        DAOpengembalian buang = new DAOpengembalian();
        try {
            if(!(buang.hilangpinjam(con, kembali))){
                this.pemberitahuan.setText("Berhasil Gan !");
                
            } else {
                this.pemberitahuan.setText("Yah Gagal Gan ! ");
                
            }
        } catch (SQLException ex) {
       
            Logger.getLogger(PanelPengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bukubalik;
    private javax.swing.JTextField idbalik;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel pemberitahuan;
    // End of variables declaration//GEN-END:variables
}