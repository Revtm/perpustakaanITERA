/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiPerpus;

import buku.DaoBuku;
import buku.buku;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author Tama
 */
public class caribuku extends javax.swing.JFrame {

    /**
     * Creates new form caribuku
     */
    public caribuku() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "penerbit", "id_buku", "judul", "posisi", "status", "penulis", "kategori"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("TAMPILKAN SEMUA BUKU");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("News701 BT", 0, 24)); // NOI18N
        jLabel1.setText("NAMPILIN SEMUA BUKU ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Judul", "Penulis", "Penerbit" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Judul");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Penulis");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Penerbit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(34, 34, 34)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        buku Bukuu = new buku();
        Connection con;
        koneksi blabla =new koneksi();
        con=blabla.getKoneksi();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DaoBuku daobuku = new DaoBuku();
        ResultSet rs = daobuku.cariBuku(con,this.jTextField1.getText(),this.jComboBox1.getModel().toString());
        try {
            while(rs.next()){
                    Bukuu.setGetIsbn(rs.getString("isbn"));
                    Bukuu.setGetPenerbit(rs.getString("penerbit"));
                    Bukuu.setGetIdBuku(rs.getString("id_buku"));
                    Bukuu.setGetJudul(rs.getString("judul"));
                    Bukuu.setGetPosisi(rs.getString("posisi"));
                    Bukuu.setGetStatus(rs.getString("status"));
                    Bukuu.setGetPenulis(rs.getString("penulis"));
                    Bukuu.setKategori(rs.getString("kategori"));
                    ;
                    
                    Object[] row = {Bukuu.getIsbn(),Bukuu.getPenerbit(),Bukuu.getIdBuku(),Bukuu.getJudul(),Bukuu.getPosisi(),Bukuu.getStatus(),Bukuu.getPenulis(),Bukuu.getKategori()};
                    model.addRow(row);
            }
            
           
            
        } catch (SQLException ex) {
            Logger.getLogger(caribuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         buku Bukuu = new buku();
        Connection con;
        koneksi blabla =new koneksi();
        con=blabla.getKoneksi();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DaoBuku daobuku = new DaoBuku();
        ResultSet rs = daobuku.cariBuku(con,this.jTextField1.getText(),this.jButton1.getText());
        try {
            while(rs.next()){
                    Bukuu.setGetIsbn(rs.getString("isbn"));
                    Bukuu.setGetPenerbit(rs.getString("penerbit"));
                    Bukuu.setGetIdBuku(rs.getString("id_buku"));
                    Bukuu.setGetJudul(rs.getString("judul"));
                    Bukuu.setGetPosisi(rs.getString("posisi"));
                    Bukuu.setGetStatus(rs.getString("status"));
                    Bukuu.setGetPenulis(rs.getString("penulis"));
                    Bukuu.setKategori(rs.getString("kategori"));
                    ;
                    
                    Object[] row = {Bukuu.getIsbn(),Bukuu.getPenerbit(),Bukuu.getIdBuku(),Bukuu.getJudul(),Bukuu.getPosisi(),Bukuu.getStatus(),Bukuu.getPenulis(),Bukuu.getKategori()};
                    model.addRow(row);
            }
            
           
            
        } catch (SQLException ex) {
            Logger.getLogger(caribuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        buku Bukuu = new buku();
        Connection con;
        koneksi blabla =new koneksi();
        con=blabla.getKoneksi();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DaoBuku daobuku = new DaoBuku();
        ResultSet rs = daobuku.cariBuku(con,this.jTextField1.getText(),this.jButton2.getText());
        try {
            while(rs.next()){
                    Bukuu.setGetIsbn(rs.getString("isbn"));
                    Bukuu.setGetPenerbit(rs.getString("penerbit"));
                    Bukuu.setGetIdBuku(rs.getString("id_buku"));
                    Bukuu.setGetJudul(rs.getString("judul"));
                    Bukuu.setGetPosisi(rs.getString("posisi"));
                    Bukuu.setGetStatus(rs.getString("status"));
                    Bukuu.setGetPenulis(rs.getString("penulis"));
                    Bukuu.setKategori(rs.getString("kategori"));
                    ;
                    
                    Object[] row = {Bukuu.getIsbn(),Bukuu.getPenerbit(),Bukuu.getIdBuku(),Bukuu.getJudul(),Bukuu.getPosisi(),Bukuu.getStatus(),Bukuu.getPenulis(),Bukuu.getKategori()};
                    model.addRow(row);
            }
            
           
            
        } catch (SQLException ex) {
            Logger.getLogger(caribuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here: buku Bukuu = new buku();
        buku Bukuu = new buku();
        Connection con;
        koneksi blabla =new koneksi();
        con=blabla.getKoneksi();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DaoBuku daobuku = new DaoBuku();
        ResultSet rs = daobuku.cariBuku(con,this.jTextField1.getText(),this.jButton4.getText());
        try {
            while(rs.next()){
                    Bukuu.setGetIsbn(rs.getString("isbn"));
                    Bukuu.setGetPenerbit(rs.getString("penerbit"));
                    Bukuu.setGetIdBuku(rs.getString("id_buku"));
                    Bukuu.setGetJudul(rs.getString("judul"));
                    Bukuu.setGetPosisi(rs.getString("posisi"));
                    Bukuu.setGetStatus(rs.getString("status"));
                    Bukuu.setGetPenulis(rs.getString("penulis"));
                    Bukuu.setKategori(rs.getString("kategori"));
                    ;
                    
                    Object[] row = {Bukuu.getIsbn(),Bukuu.getPenerbit(),Bukuu.getIdBuku(),Bukuu.getJudul(),Bukuu.getPosisi(),Bukuu.getStatus(),Bukuu.getPenulis(),Bukuu.getKategori()};
                    model.addRow(row);
            }
            
           
            
        } catch (SQLException ex) {
            Logger.getLogger(caribuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(caribuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(caribuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(caribuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(caribuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new caribuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}