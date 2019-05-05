/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamanBuku;
import buku.buku;
import akun.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author revan
 */
public class pengembalian {
    buku Buku;
    user pengguna;
    Date tanggalPinjam;
    Date tanggalKembali;
    Connection con;
    
    String sqlKembali = "select tanggal_pinjam from peminjaman where id='" +pengguna.getID() + "' and id_buku='" +Buku.getIdBuku()+"';";
    
    public int hitungDenda(ResultSet rs, buku Buku, user pengguna){
            int selisih = 0;
            
        try {
            if(rs.next()){
                LocalDate hariBalik= LocalDate.now();
                LocalDate hariPinjam = LocalDate.parse(rs.getString("tanggal_pinjam"));
                
                Period periode = Period.between(hariPinjam, hariBalik);
                selisih = periode.getDays();
                return selisih*500;
            }
        } catch (SQLException ex) {
            Logger.getLogger(pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
        return selisih;
    }
    
    public ResultSet cariPeminjam(Connection con, String id_peminjam){
        this.con=con;
        char pilih;
        ResultSet rs;
        String sqlCari ="select * from peminjaman where id='"+id_peminjam+"';";
        Statement stmt;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sqlCari);
            
            if(rs.next()){
               return rs; 
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
                            
       return null; 
    }
    
    public void pengembalianBuku(Connection con, ResultSet rs, buku Buku){
        
    }
    
    public static void main(String[] args) {
        
    }
}
