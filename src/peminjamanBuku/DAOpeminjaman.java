/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamanBuku;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

/**
 *
 * @author 900056
 */
public class DAOpeminjaman {
    
    LocalDate tanggal_pinjam;
    
    public boolean tambahpinjam(Connection con ,peminjaman pinjam) throws SQLException{
        tanggal_pinjam = LocalDate.now();
        String pjm=tanggal_pinjam.toString();
        
        String sql="INSERT INTO peminjaman VALUES('" +pinjam.getNoPeminjaman()+"','"+pinjam.getId()+"','"+pjm+"','2019-05-21','"+pinjam.getId_buku()+"');"; 
        // (no_peminjaman,id,tanggal_pinjam.tanggal_kembali,id_buku)
        Statement stmt= con.createStatement();
       
        return stmt.execute(sql);
       
        
    }
    public static void main(String[] args) {
        DAOpeminjaman g = new DAOpeminjaman();
        
         g.tanggal_pinjam = LocalDate.now();
        String pjm=g.tanggal_pinjam.toString();
       
        System.out.println(pjm);
        
        
    }
}
