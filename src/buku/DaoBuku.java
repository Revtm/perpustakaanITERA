/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package buku;
import koneksi.koneksi;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tama
 */
public class DaoBuku {
    buku Bukuu;
    
        public ResultSet tampilinBuku(Connection con){
    String sql="SELECT * FROM buku;";
        try {
            Statement stmt=con.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            
            return rs;
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoBuku.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return null;
}
        
        public ResultSet tambahBuku(Connection con, String isbn,String penerbit,String idbuku,String judul,String posisi,String status,String penulis,String kategori){
   String sql="INSERT INTO buku VALUES('"+isbn+"','"+penerbit+"','"+idbuku+"','"+judul+"','"+posisi+"','"+status+"','"+penulis+"','"+kategori+"');";
  
    try {
           PreparedStatement pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoBuku.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return null;
}
    
    public ResultSet cariBuku(Connection con, String cari,String kategori){
    String sqljdl="SELECT * FROM buku WHERE judul='"+cari+"';";
    String sqlpnrbit="SELECT * FROM buku WHERE penerbit='"+cari+"';";
    String sqlpnlis="SELECT * FROM buku WHERE penulis='"+cari+"';";
    String sql=sqljdl;
    if(kategori=="Judul"){
        sql=sqljdl;
    
    }else if("Penulis".equals(kategori)){
        sql=sqlpnlis;
    }else if("Penerbit".equals(kategori)){
        sql=sqlpnrbit;
    }else{
        
    }
    try {
            Statement stmt=con.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            
            return rs;
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoBuku.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return null;
}
    
    
    public static void main(String[] args) {
        Connection con;
        koneksi blabla =new koneksi();
        con=blabla.getKoneksi();
        
        DaoBuku daobuku = new DaoBuku();
        
        //daobuku.cariBuku(con, "AAAA");
        
        
        
    }
    
    
}
