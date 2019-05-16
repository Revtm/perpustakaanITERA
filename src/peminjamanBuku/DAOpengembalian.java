/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamanBuku;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Tama
 */
public class DAOpengembalian {
 
    public boolean hilangpinjam(Connection con, pengembalian kembali) throws SQLException{
        
    
        Statement stmt= con.createStatement();
        String sql5 = "update buku set status='tersedia' where id_buku = '"+kembali.getId_buku()+"' ";
        String sql4 = "update peminjaman set tanggal_kembali ='"+kembali.getTglKembali()+"' where id_buku='"+kembali.getId_buku()+"' ";
        String sql6 = "select judul from buku where id_buku = '"+kembali.getId_buku()+"' and status= 'tersedia' ";
        
        
        return ((stmt.execute(sql4)&&stmt.execute(sql5))&&stmt.execute(sql6));
    }
    
}
