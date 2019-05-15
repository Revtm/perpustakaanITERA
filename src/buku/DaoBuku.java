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


/**
 *
 * @author Tama
 */
public class DaoBuku extends fungsiTukDao{
    buku Bukuu;
    
 
        
public boolean tambahBuku(Connection con, buku Bukuu){
   String sql="INSERT INTO buku VALUES('"+Bukuu.getIsbn()+"','"+Bukuu.getPenerbit()+"','"+Bukuu.getIdBuku()+"','"+Bukuu.getJudul()+"','"+Bukuu.getPosisi()+"','"+Bukuu.getStatus()+"','"+Bukuu.getPenulis()+"','"+Bukuu.getKategori()+"','" + Bukuu.getDeskripsi()+"');";
  
    try {

            Statement stmt=con.createStatement();
            
            return (!stmt.execute(sql));
                       

            
        } catch (SQLException ex) {
            Logger.getLogger(DaoBuku.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
}
public boolean deleteBuku(Connection con, buku Bukuu){
   String sql="DELETE FROM buku WHERE id_buku='"+Bukuu.getIdBuku()+"';";
    try {

            Statement stmt=con.createStatement();
            
            return (!stmt.execute(sql));
                       

            
        } catch (SQLException ex) {
            Logger.getLogger(DaoBuku.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
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

  

    

    @Override
    public ResultSet tampilinBuku() {
        Connection con;
        koneksi blabla =new koneksi();
        con=blabla.getKoneksi();
        
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
    
    
}
