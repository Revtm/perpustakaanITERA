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

        panelCaribuku = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("News701 BT", 0, 24)); // NOI18N
        jLabel1.setText("PENCARIAN BUKU ");

        jButton4.setText("Penerbit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Penulis");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Judul");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCaribukuLayout = new javax.swing.GroupLayout(panelCaribuku);
        panelCaribuku.setLayout(panelCaribukuLayout);
        panelCaribukuLayout.setHorizontalGroup(
            panelCaribukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCaribukuLayout.createSequentialGroup()
                .addGroup(panelCaribukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCaribukuLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCaribukuLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(65, 65, 65)
                        .addComponent(jButton2)
                        .addGap(66, 66, 66)
                        .addComponent(jButton4)))
                .addContainerGap(388, Short.MAX_VALUE))
        );
        panelCaribukuLayout.setVerticalGroup(
            panelCaribukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCaribukuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(panelCaribukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "penerbit", "id_buku", "judul", "posisi", "status", "penulis", "kategori"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCaribuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCaribuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelCaribuku;
    // End of variables declaration//GEN-END:variables
}
